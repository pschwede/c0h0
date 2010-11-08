package org.jalgo.module.c0h0.views;

import javax.swing.JPanel;

/*
 * Abstract superclass of all views.
 */
public abstract class View extends JPanel {
	
	private boolean visible;
	//TODO private StyleMode displaySettings;
	
	public View() {	
		this.visible = false;
		//TODO this.displaySettings = null;
	}
	
	/**
	 * toggles 
	 * @returns success
	 */
	public boolean setBeamerMode() {
		return true;
	}
	
	/**
	 * Renders the view.
	 * @return success
	 */
	public boolean render() {
		return true;
	}
	
	/**
	 * Updates the view.
	 * @return success
	 */
	public boolean updateWithAST() {
		this.render();
		return true;
	}
}
