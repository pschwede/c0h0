package org.jalgo.module.c0h0.gui;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;

import org.jalgo.module.c0h0.views.C0View;
import org.jalgo.module.c0h0.views.FlowChartView;

public class Clickdummy extends JPanel {
	JPanel right;
	JPanel left;
	JScrollPane leftscroll;
	JSplitPane leftright;
	JSplitPane topbottom;
	JPanel bottom;
	JEditorPane c0edit;

	public Clickdummy() {

		C0View c0view = new C0View(c0edit);
		FlowChartView fcview = new FlowChartView();
		// panels
		left = new JPanel();
		right = new JPanel();
		bottom = new JPanel();
		c0edit = new JEditorPane("text/html", c0view.plainText());
		c0edit.setSize(500, 500);
		leftscroll = new JScrollPane(c0edit);
		// c0edit.setEditorKit(new Numbered)

		// 7\ labels
		JLabel l = new JLabel("editor");
		JLabel b = new JLabel("bottom");
		bottom.add(b);
		left.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 1));
		left.setLayout(new BoxLayout(left, BoxLayout.Y_AXIS));
		right.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 1));
		bottom.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 1));

		// einteilung ;)
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		JSplitPane leftright = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
				true, left, right);
		JSplitPane topbottom = new JSplitPane(JSplitPane.VERTICAL_SPLIT, true,
				leftright, bottom);
		topbottom.setOneTouchExpandable(true);
		leftright.setResizeWeight(.5d);
		topbottom.setResizeWeight(.85d);

		add(topbottom);
		left.add(leftscroll);
		leftscroll.setPreferredSize(new Dimension());
		c0edit.setMinimumSize(new Dimension());
		right.add(fcview);

	}
}

/*
 * c0edit.setText("int main()\n"+ "{\n"+ "	int x1, x2, ... , xm;\n"+
 * "	scanf(\"%i\", &x1);\n"+ "	scanf(\"%i\", &x2);\n"+ "	...\n"+
 * "	scanf(\"%i\", &xm);\n"+ "\n"+ "	if(x1 > 4)\n"+ "	{\n"+ "		x1 = x1 -1\n"+
 * "	}\n"+ " .....\n"+ "	printf(\"%d\", xi);\n"+ "	Areturn 0;\n"+ "}");
 */
