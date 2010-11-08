package org.jalgo.module.c0h0.gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;

public class Clickdummy extends JPanel {
	JPanel right;
	JPanel left;
	JScrollPane leftscroll;
	JSplitPane leftright;
	JSplitPane topbottom;
	JPanel bottom;
	JEditorPane C0edit;

	public Clickdummy() {

		// panels
		left = new JPanel();
		leftscroll = new JScrollPane();
		right = new JPanel();
		bottom = new JPanel();
		C0edit = new JEditorPane();
		C0edit.setSize(500, 500);

		//7\ labels
		JLabel l = new JLabel("editor");
		JLabel r = new JLabel("right");
		JLabel b = new JLabel("bottom");
		left.add(l);
		right.add(r);
		bottom.add(b);
		left.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		left.setLayout(new BoxLayout(left, BoxLayout.Y_AXIS));
		right.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		bottom.setBorder(BorderFactory.createLineBorder(Color.black, 1));

		//eintilung ;)
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
		leftscroll.add(C0edit);
		C0edit.setPreferredSize(new Dimension());


	}
}
