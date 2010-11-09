package org.jalgo.module.c0h0.gui;

import javax.swing.JPanel;
import javax.swing.JSplitPane;

import org.jalgo.module.c0h0.views.C0View;

public class Container extends JPanel {
	private JPanel leftPane;
	private JPanel rightPane;
	private JPanel bottomPane;
	//private ViewController
	private JSplitPane leftright; 
	private JSplitPane topbottom;
	
	Container(){
		leftPane = new JPanel();
		rightPane = new JPanel();
		bottomPane = new JPanel();
		
		leftright = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
				true, leftPane, rightPane);
	}
}
