package org.jalgo.module.c0h0.views;

import javax.swing.JEditorPane;

import org.jalgo.module.c0h0.model.C0CodeModel;

public class C0View extends View {
	private JEditorPane codePane;
	private C0CodeModel codeModel;
	
	public C0View(JEditorPane codepain) {
		// TODO Auto-generated constructor stub
		codePane = codepain;
		this.codeModel = new C0CodeModel();
	}

	public void highlightNext(){
		codeModel.highlightLine++;
	}
	
	public void highlightPrevious(){
		codeModel.highlightLine--;
	}
	
	public boolean render(){
		// TODO hier richtiges update rein
		codePane.updateUI();
		return true;
	}
	
	public void stepForward(){}

	public String plainText() {
		return codeModel.plainText();
	}
	
	public String highliteText() {
		return codeModel.highliteText();
	}
}
