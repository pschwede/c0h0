package org.jalgo.module.c0h0.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JToolBar;

import org.jalgo.main.gui.JAlgoGUIConnector;
import org.jalgo.main.gui.components.JToolbarButton;
import org.jalgo.main.util.Messages;
import org.jalgo.module.c0h0.views.C0View;

public class ToolbarAssistent implements ActionListener{
	
	public C0View c0View;
	
	public void buildStepButtons(JToolBar toolbar) {

		JToolbarButton bigStepBack = new JToolbarButton(
				new ImageIcon(Messages	.getResourceURL("main", "Icon.Undo_all")), "a tooltip", "");
		JToolbarButton smallStepBack = new JToolbarButton(
				new ImageIcon(Messages.getResourceURL("main", "Icon.Undo_blockstep")), "a tooltip", "");
		JToolbarButton bigStepForward = new JToolbarButton(
				new ImageIcon(Messages	.getResourceURL("main", "Icon.Perform_all")), "a tooltip", "");
		JToolbarButton smallStepForward = new JToolbarButton(
				new ImageIcon(Messages.getResourceURL("main", "Icon.Perform_blockstep")), "a tooltip", "");
		JToolbarButton runButton = new JToolbarButton(
				new ImageIcon(Messages.getResourceURL("main", "Icon.Finish_algorithm")), "a tooltip", "");

		
		// step buttons einfuegen
		toolbar.add(bigStepBack);
		toolbar.add(smallStepBack);
		
		toolbar.add(smallStepForward);
		toolbar.add(bigStepForward);
		
		toolbar.add(runButton);
		
		bigStepForward.addActionListener(this);
		bigStepForward.setActionCommand("bigstepfor");
	
	}
	public void buildModeCombobox(JToolBar toolbar){
		JComboBox viewModeBox= new JComboBox(new Object []{"C0 - FlowChart","FlowChart - H0", "C0 - H0"});
		toolbar.add(viewModeBox);
	}
	public void actionPerformed(ActionEvent e) {
		 if ("bigstepfor".equals(e.getActionCommand())) {
			 c0View.highlightNext();
			 c0View.render();
		 }
	
	}
}
