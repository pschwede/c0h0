package org.jalgo.module.c0h0.views;

import javax.swing.JEditorPane;

import org.jalgo.module.c0h0.model.C0CodeModel;

public class C0View extends View {
	public JEditorPane codePane;
	private C0CodeModel codeModel;
	
	public C0View(JEditorPane codepain) {
		// TODO Auto-generated constructor stub
		this.codePane = codepain;
		this.codeModel = new C0CodeModel();
	}
	
	public boolean render(){
		
		return true;
	}
	
	public void stepForward(){}

	public String plainText() {
		// TODO Auto-generated method stub
		return codeModel.plainText();
	}
}
