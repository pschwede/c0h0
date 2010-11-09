package org.jalgo.module.c0h0.model;

import java.util.LinkedList;

public class C0CodeModel {
	public LinkedList<String> code;
	private int highlightLine = 6;

	public C0CodeModel() {
		insertCode();

	}

	public String plainText() {
		String line, result = "";
		for (int i = 0; i < code.size(); i++) {
			line = code.get(i);
			if (highlightLine == i) {
				result = result.concat("<pre style=\"background:#ffdddd;\">");
				result = result.concat(line);
			}
			result = result.concat(line);
			if (highlightLine == i)
				result = result.concat("</pre>\n");
			else
				result = result.concat("<br />\n");
		}
		System.out.println(result);
		return result;
	}

	private void insertCode() {
		// TODO schöneres System für CodeModel Finden
		code = new LinkedList<String>();
		code.add("int main()");
		code.add("{");
		code.add("	int x1, x2, ... , xm;");
		code.add("	scanf(\"%i\", &x1);");
		code.add("	scanf(\"%i\", &x2);");
		code.add("scanf(\"%i\", &xm);");
		code.add("	if(x1 > 4)");
		code.add("{");
		code.add("		x1 = x1 -1");
		code.add("}");
		code.add("printf(\"%d\", xi);");
		code.add("return 0;");
		code.add("}");
	}
}
