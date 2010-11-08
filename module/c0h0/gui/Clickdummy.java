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
import javax.swing.JSplitPane;

public class Clickdummy extends JPanel {
	JPanel right;
	JPanel left;
	JPanel top;
	JPanel bottom;
	JEditorPane C0edit;

	public Clickdummy() {

		left = new JPanel();
		right = new JPanel();
		top = new JPanel();
		bottom = new JPanel();
		C0edit = new JEditorPane();
		C0edit.setSize(500, 500);

		JLabel l = new JLabel("left");
		JLabel r = new JLabel("right");
		JLabel b = new JLabel("bottom");

		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		
		JSplitPane topbottom = new JSplitPane(JSplitPane.VERTICAL_SPLIT, true,top, bottom);
		JSplitPane leftright		 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, true,left, right);
		topbottom.setOneTouchExpandable(true);
		top.add(leftright);
		add(topbottom);


		left.add(C0edit);
		right.add(r);
		bottom.add(b);

		left.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		right.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		bottom.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		
		bottom.setSize(60,60);

	}
}
