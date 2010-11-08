package org.jalgo.module.c0h0.gui;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Clickdummy extends JPanel{
	public JPanel left;
	public BoxLayout leftright;
	
	public Clickdummy() {
		leftright = new BoxLayout(this, BoxLayout.Y_AXIS);
		JLabel test = new JLabel("Foo");
		setLayout(leftright);
		add(test);
	}
}
