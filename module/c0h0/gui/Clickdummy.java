package org.jalgo.module.c0h0.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Caret;
import javax.swing.text.Document;
import javax.swing.text.EditorKit;
import javax.swing.text.ViewFactory;


public class Clickdummy extends JPanel {
	JPanel right;
	JPanel left;
	JScrollPane leftscroll;
	JSplitPane leftright;
	JSplitPane topbottom;
	JPanel bottom;
	JEditorPane c0edit;

	public Clickdummy() {

		// panels
		left = new JPanel();
		right = new JPanel();
		bottom = new JPanel();
		c0edit = new JEditorPane("text/html",
	            "<html>\n<body  style=\"margin:0;padding:0;font-family:'sans-serif,courier-new,monospace';\">\n<div style=\"color:#181615;padding:0px;margin:0px;\"><div style='background-color:#cccccc;padding:0px;margin:0px;'><span style='background-color:#cccccc;'>01</span> <span style='color:#0057ae;'><b>int</b></span> main()<br />\n<span style='background-color:#cccccc;'>02</span> {<br />\n<span style='background-color:#cccccc;'>03</span> &nbsp;&nbsp;<span style='color:#0057ae;'><b>int</b></span> x1, x2, ... , xm;<br />\n<span style='background-color:#cccccc;'>04</span> &nbsp;&nbsp;<b>scanf</b>(<span style='color:#bf0303;'>&quot;%i&quot;</span>, &amp;x1);<br />\n<span style='background-color:#cccccc;'>05</span> &nbsp;&nbsp;<b>scanf</b>(<span style='color:#bf0303;'>&quot;%i&quot;</span>, &amp;x2);<br />\n<span style='background-color:#cccccc;'>06</span> &nbsp;&nbsp;...<br />\n<span style='background-color:#cccccc;'>07</span> &nbsp;&nbsp;<b>scanf</b>(<span style='color:#bf0303;'>&quot;%i&quot;</span>, &amp;xm);</div><span style='background-color:#cccccc;'>08</span><div style='color:#181615;background-color:#ffdddd;padding:0px;margin:0px;'><span style='background-color:#cccccc;'>09</span> &nbsp;&nbsp;<b>if</b>(x1 &gt; <span style='color:#b08000;'>4</span>)<br />\n<span style='background-color:#cccccc;'>10</span> &nbsp;&nbsp;{<br />\n<span style='background-color:#cccccc;'>11</span> &nbsp;&nbsp;&nbsp;&nbsp;x1 = x1 -<span style='color:#b08000;'>1</span><br />\n<span style='background-color:#cccccc;'>12</span> &nbsp;&nbsp;}</div>\n<span style='background-color:#cccccc;'>13</span> &nbsp;&nbsp;<b>printf</b>(<span style='color:#bf0303;'>&quot;%d&quot;</span>, xi);<br />\n<span style='background-color:#cccccc;'>14</span> &nbsp;&nbsp;<b>return</b> <span style='color:#b08000;'>0</span>;<br />\n<span style='background-color:#cccccc;'>15</span> }<br />\n</div>\n</body>\n</html>");
		c0edit.setSize(500, 500);
		leftscroll = new JScrollPane(c0edit);
		//c0edit.setEditorKit(new Numbered)



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
		leftscroll.setPreferredSize(new Dimension());
		c0edit.setMinimumSize(new Dimension());


	}
}


/*
 * 		c0edit.setText("int main()\n"+
				"{\n"+
				"	int x1, x2, ... , xm;\n"+
				"	scanf(\"%i\", &x1);\n"+
				"	scanf(\"%i\", &x2);\n"+
				"	...\n"+
				"	scanf(\"%i\", &xm);\n"+
				 "\n"+
				"	if(x1 > 4)\n"+
				"	{\n"+
				"		x1 = x1 -1\n"+
				"	}\n"+
				" .....\n"+
				"	printf(\"%d\", xi);\n"+
				"	Areturn 0;\n"+
				"}");
 * */
