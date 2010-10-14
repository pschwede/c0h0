/*
 * j-Algo - j-Algo is an algorithm visualization tool, especially useful for
 * students and lecturers of computer science. It is written in Java and platform
 * independent. j-Algo is developed with the help of Dresden University of
 * Technology.
 * 
 * Copyright (C) 2004-2010 j-Algo-Team, j-algo-development@lists.sourceforge.net
 * 
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc., 59 Temple
 * Place, Suite 330, Boston, MA 02111-1307 USA
 */
/* WARNING: This is generated code. DO *NOT* MODIFY IT! */

package org.jalgo.module.am0c0.parser.c0;

import java.util.ArrayList;
import org.jalgo.module.am0c0.model.c0.ast.*;
import org.jalgo.module.am0c0.parser.ParserUtils;
import beaver.*;
import org.jalgo.module.am0c0.parser.ErrorEvents;
import org.jalgo.module.am0c0.model.c0.trans.AtomicTrans.AtomicType;

/**
 * This class is a LALR parser generated by
 * <a href="http://beaver.sourceforge.net">Beaver</a> v0.9.6.1
 * from the grammar specification "c0-parser.g".
 */
public class GeneratedC0Parser extends Parser {
	static public class Terminals {
		static public final short EOF = 0;
		static public final short IDENT = 1;
		static public final short MINUS = 2;
		static public final short PLUS = 3;
		static public final short SEMICOLON = 4;
		static public final short LPAREN = 5;
		static public final short NUMBER = 6;
		static public final short LBRACKET = 7;
		static public final short SCANF = 8;
		static public final short PRINTF = 9;
		static public final short IF = 10;
		static public final short WHILE = 11;
		static public final short RPAREN = 12;
		static public final short RETURN = 13;
		static public final short EQ = 14;
		static public final short NE = 15;
		static public final short LE = 16;
		static public final short GE = 17;
		static public final short LT = 18;
		static public final short GT = 19;
		static public final short RBRACKET = 20;
		static public final short MULT = 21;
		static public final short DIV = 22;
		static public final short MOD = 23;
		static public final short COMMA = 24;
		static public final short ELSE = 25;
		static public final short INT = 26;
		static public final short ASSIGN = 27;
		static public final short IFORMAT = 28;
		static public final short AMP = 29;
		static public final short DFORMAT = 30;
		static public final short INCLUDE = 31;
		static public final short STDIO = 32;
		static public final short MAIN = 33;
		static public final short CONST = 34;
	}

	static final ParsingTables PARSING_TABLES = new ParsingTables(
		"U9obbbjiL4K0Xl#pjrBPbW8LjYsrq7OBhQMW8Du0kNW1lA9o4PHI5E#9ngWFFXYZYI$6nCk" +
		"3HatGX0TzyS6O#6vCr0TVC055MwsY8hG52wK5AkCtS#PiTxUx98tdpzz$vf$$pENCdZcLOg" +
		"tc5mjbj51PtQ9wrMawzLZeUnpK75sc#UPdYuBiJTItXBvlZVlIZnO#ctJP#wbl2ttVcl2b7" +
		"onyDkMost7#2NtVMk5BVHO#MscpvFhCSEZxrcb#lZyv77KmxkymzTFUTz0CNphiy9U5gfsU" +
		"fdxA#mwgygLUXpyTBhY$fqol7lI#WsRwqY67Fomqr$tTJlsCzntKv4k$EHonq0AdPwYFUDz" +
		"17Nvj$Gw$MwZJwOZfrsBlEsY9p$vgeMQrwWfjqEMsH7rMw7kS2xEQfrfpBeUJ#7lKeajqBs" +
		"KFBOVBjCDcDLlNu9tG2Zsag$6lDISYQ3UqetOpwfNAu0rfbTlVBbrdXYBG0hNQjTWT7JA3k" +
		"jxDSaWDPZ02EQWrkToW6T1QbnlK9ZCGWHpKkbnkm1mdTIbxFQ0RpF48MW$j6fhL2DlmZg6B" +
		"pD$u6ysn27eKtgExzOZvLrjr7zvvxTG3seM$rvoFe1xui1dNOt8NtdW4QkDkB7zP9tVTgjj" +
		"qk#xGdRhBd9smpTa8gidpRzHANQLsBLMDDbFVCSbD#$j79rmpciCOldIpIun5O8GnttzDNb" +
		"$vlUgYxJ75bL3WrBxnAIrY7asgrWpkcAbP$5Aws8CvcbiccoZ8pY#HNU2ocKdP#XBPP9bik" +
		"aIseansSOciocIp9RArPRA9AVJRK2BRKYRRCeLiiaGsdSjcBxAs5jxefDeuWMqfJIa$6#Hb" +
		"ApY9ApaxfkDMyIj9S$PqvhbPt3Ix5$QRuNa5zDpCELH7QI8N8sV7IhbH0v#pSwtZ$i9H0ju" +
		"oss9fS#5ywxYpEDTOa0lAvj85EPlAailavHBamcVTwXZbqkGwYjPHIph5RhVxTLWq5AqtHQ" +
		"u19sNSHIxNHisDPKpKPd9NuJxa#GKhAkUglbosO6x5TzLEzQxS#ANRfSTViYUJuQmMhdYEO" +
		"atIUhW1ReFFIW7lJ700zb9$2puFFwJ#7lecZ56U1wlXSlgxWAx5jsTm1rm3CtZiHc3xtefk" +
		"GPz4xHWlmtVXf$0hF7kg7qQVG4$2xs4NFCXGTYxDAFCDLk0DknDP0QTcR3Qw2JP1sru95yA" +
		"baFK4k#0os0vtmvMm6$R05#0pz67dUHI#2Z#6duVdVl0Y#ZJ4rmVmC$WDxAEDPn3mA8Dtg3" +
		"UYNwDsd45erxKHVH#rOt5ly0hifFuSodFKQ$0ZodmNWdtmTVW6tXVeVlGxlqz7h1QJQvLN#" +
		"xzNFxgpJExGH3dOxBst2pD1XzTktxxFwoUJ#mjwlExD6#E0ro#zVfkNh$BUIAdvJOMiSpHQ" +
		"W#zx3rmzbJx8F$L$vp6vJtUryskju9kMWac#k06CSI8BnZmJdC#MISyKTyMW$KudtBSwIny" +
		"JEWt6EPFZl551IROvnZpZZgruhKv3jhZpqZAk9Vy1gTSq70==");

    public ErrorEvents getErrorEvents() {
        return (ErrorEvents) report;
    }

    private int convert(final Symbol symbol) {
        return ParserUtils.safeSymbolToInt(symbol, (ErrorEvents) report);
    }

	private final Action[] actions;

	public GeneratedC0Parser() {
		super(PARSING_TABLES);
		actions = new Action[] {
			new Action() {	// [0] Program = INCLUDE STDIO INT MAIN LPAREN RPAREN Block.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_b = _symbols[offset + 7];
					final Block b = (Block) _symbol_b.value;
					 return new Symbol(new Program(b));
				}
			},
			new Action() {	// [1] Block = LBRACKET Declaration.d StatementSequence.s RETURN SEMICOLON RBRACKET
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_d = _symbols[offset + 2];
					final Declaration d = (Declaration) _symbol_d.value;
					final Symbol _symbol_s = _symbols[offset + 3];
					final StatementSequence s = (StatementSequence) _symbol_s.value;
					 return new Symbol(new Block(d, s));
				}
			},
			new Action() {	// [2] Block = LBRACKET Declaration.d RETURN SEMICOLON RBRACKET
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_d = _symbols[offset + 2];
					final Declaration d = (Declaration) _symbol_d.value;
					 return new Symbol(new Block(d, null));
				}
			},
			new Action() {	// [3] StatementSequence = Statement.stat
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_stat = _symbols[offset + 1];
					final Statement stat = (Statement) _symbol_stat.value;
					 return new Symbol(new StatementSequence(stat));
				}
			},
			new Action() {	// [4] StatementSequence = StatementSequence.seq Statement.stat
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_seq = _symbols[offset + 1];
					final StatementSequence seq = (StatementSequence) _symbol_seq.value;
					final Symbol _symbol_stat = _symbols[offset + 2];
					final Statement stat = (Statement) _symbol_stat.value;
					 seq.addStatement(stat); return new Symbol(seq);
				}
			},
			new Action() {	// [5] Declaration = 
				public Symbol reduce(Symbol[] _symbols, int offset) {
					 return new Symbol(new Declaration(null, null));
				}
			},
			new Action() {	// [6] Declaration = ConstDeclaration.constdecl SEMICOLON
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_constdecl = _symbols[offset + 1];
					final ConstDeclaration constdecl = (ConstDeclaration) _symbol_constdecl.value;
					 return new Symbol(new Declaration(constdecl, null));
				}
			},
			new Action() {	// [7] Declaration = VarDeclaration.vardecl SEMICOLON
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_vardecl = _symbols[offset + 1];
					final VarDeclaration vardecl = (VarDeclaration) _symbol_vardecl.value;
					 return new Symbol(new Declaration(null, vardecl));
				}
			},
			new Action() {	// [8] Declaration = ConstDeclaration.constdecl SEMICOLON VarDeclaration.vardecl SEMICOLON
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_constdecl = _symbols[offset + 1];
					final ConstDeclaration constdecl = (ConstDeclaration) _symbol_constdecl.value;
					final Symbol _symbol_vardecl = _symbols[offset + 3];
					final VarDeclaration vardecl = (VarDeclaration) _symbol_vardecl.value;
					 return new Symbol(new Declaration(constdecl, vardecl));
				}
			},
			new Action() {	// [9] ConstDeclaration = CONST IDENT.i ASSIGN NUMBER.n
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_i = _symbols[offset + 2];
					final String i = (String) _symbol_i.value;
					final Symbol n = _symbols[offset + 4];
					 return new Symbol(new ConstDeclaration(new C0AST.ConstIdent(i, convert(n))));
				}
			},
			new Action() {	// [10] ConstDeclaration = CONST IDENT.i ASSIGN MINUS NUMBER.n
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_i = _symbols[offset + 2];
					final String i = (String) _symbol_i.value;
					final Symbol n = _symbols[offset + 5];
					 return new Symbol(new ConstDeclaration(new C0AST.ConstIdent(i, -convert(n))));
				}
			},
			new Action() {	// [11] ConstDeclaration = ConstDeclaration.d COMMA IDENT.i ASSIGN NUMBER.n
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_d = _symbols[offset + 1];
					final ConstDeclaration d = (ConstDeclaration) _symbol_d.value;
					final Symbol _symbol_i = _symbols[offset + 3];
					final String i = (String) _symbol_i.value;
					final Symbol n = _symbols[offset + 5];
					 d.addConstant(new C0AST.ConstIdent(i, convert(n))); return new Symbol(d);
				}
			},
			new Action() {	// [12] ConstDeclaration = ConstDeclaration.d COMMA IDENT.i ASSIGN MINUS NUMBER.n
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_d = _symbols[offset + 1];
					final ConstDeclaration d = (ConstDeclaration) _symbol_d.value;
					final Symbol _symbol_i = _symbols[offset + 3];
					final String i = (String) _symbol_i.value;
					final Symbol n = _symbols[offset + 6];
					 d.addConstant(new C0AST.ConstIdent(i, -convert(n))); return new Symbol(d);
				}
			},
			new Action() {	// [13] VarDeclaration = INT IDENT.i
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_i = _symbols[offset + 2];
					final String i = (String) _symbol_i.value;
					 return new Symbol(new VarDeclaration(new C0AST.Ident(i)));
				}
			},
			new Action() {	// [14] VarDeclaration = VarDeclaration.d COMMA IDENT.i
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_d = _symbols[offset + 1];
					final VarDeclaration d = (VarDeclaration) _symbol_d.value;
					final Symbol _symbol_i = _symbols[offset + 3];
					final String i = (String) _symbol_i.value;
					 d.addVariable(new C0AST.Ident(i)); return new Symbol(d);
				}
			},
			new Action() {	// [15] Statement = IDENT.i ASSIGN SimpleExpr.e SEMICOLON
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_i = _symbols[offset + 1];
					final String i = (String) _symbol_i.value;
					final Symbol _symbol_e = _symbols[offset + 3];
					final SimpleExpr e = (SimpleExpr) _symbol_e.value;
					 return new Symbol(new Statement.AssignmentStatement(i, e));
				}
			},
			new Action() {	// [16] Statement = IF LPAREN BoolExpr.e RPAREN Statement.s
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e = _symbols[offset + 3];
					final BoolExpression e = (BoolExpression) _symbol_e.value;
					final Symbol _symbol_s = _symbols[offset + 5];
					final Statement s = (Statement) _symbol_s.value;
					 return new Symbol(new Statement.IfStatement(e, s));
				}
			},
			new Action() {	// [17] Statement = IF LPAREN BoolExpr.e RPAREN Statement.s1 ELSE Statement.s2
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e = _symbols[offset + 3];
					final BoolExpression e = (BoolExpression) _symbol_e.value;
					final Symbol _symbol_s1 = _symbols[offset + 5];
					final Statement s1 = (Statement) _symbol_s1.value;
					final Symbol _symbol_s2 = _symbols[offset + 7];
					final Statement s2 = (Statement) _symbol_s2.value;
					 return new Symbol(new Statement.IfElseStatement(e, s1, s2));
				}
			},
			new Action() {	// [18] Statement = WHILE LPAREN BoolExpr.e RPAREN Statement.s
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e = _symbols[offset + 3];
					final BoolExpression e = (BoolExpression) _symbol_e.value;
					final Symbol _symbol_s = _symbols[offset + 5];
					final Statement s = (Statement) _symbol_s.value;
					 return new Symbol(new Statement.WhileStatement(e, s));
				}
			},
			new Action() {	// [19] Statement = PRINTF LPAREN DFORMAT COMMA IDENT.i RPAREN SEMICOLON
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_i = _symbols[offset + 5];
					final String i = (String) _symbol_i.value;
					 return new Symbol(new Statement.PrintfStatement(i));
				}
			},
			new Action() {	// [20] Statement = SCANF LPAREN IFORMAT COMMA AMP IDENT.i RPAREN SEMICOLON
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_i = _symbols[offset + 6];
					final String i = (String) _symbol_i.value;
					 return new Symbol(new Statement.ScanfStatement(i));
				}
			},
			new Action() {	// [21] Statement = LBRACKET StatementSequence.s RBRACKET
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_s = _symbols[offset + 2];
					final StatementSequence s = (StatementSequence) _symbol_s.value;
					 return new Symbol(new Statement.CompStatement(s));
				}
			},
			new Action() {	// [22] BoolExpr = SimpleExpr.l Relation.rel SimpleExpr.r
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_l = _symbols[offset + 1];
					final SimpleExpr l = (SimpleExpr) _symbol_l.value;
					final Symbol _symbol_rel = _symbols[offset + 2];
					final AtomicType rel = (AtomicType) _symbol_rel.value;
					final Symbol _symbol_r = _symbols[offset + 3];
					final SimpleExpr r = (SimpleExpr) _symbol_r.value;
					 return new Symbol(new BoolExpression(l, rel, r));
				}
			},
			new Action() {	// [23] Relation = EQ
				public Symbol reduce(Symbol[] _symbols, int offset) {
					 return new Symbol(AtomicType.EQ);
				}
			},
			new Action() {	// [24] Relation = NE
				public Symbol reduce(Symbol[] _symbols, int offset) {
					 return new Symbol(AtomicType.NE);
				}
			},
			new Action() {	// [25] Relation = LE
				public Symbol reduce(Symbol[] _symbols, int offset) {
					 return new Symbol(AtomicType.LE);
				}
			},
			new Action() {	// [26] Relation = GE
				public Symbol reduce(Symbol[] _symbols, int offset) {
					 return new Symbol(AtomicType.GE);
				}
			},
			new Action() {	// [27] Relation = LT
				public Symbol reduce(Symbol[] _symbols, int offset) {
					 return new Symbol(AtomicType.LT);
				}
			},
			new Action() {	// [28] Relation = GT
				public Symbol reduce(Symbol[] _symbols, int offset) {
					 return new Symbol(AtomicType.GT);
				}
			},
			new Action() {	// [29] SimpleExpr = Term.t
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_t = _symbols[offset + 1];
					final Term t = (Term) _symbol_t.value;
					 return new Symbol(new SimpleExpr.UnaryPlusExpr(t));
				}
			},
			new Action() {	// [30] SimpleExpr = PLUS Term.t
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_t = _symbols[offset + 2];
					final Term t = (Term) _symbol_t.value;
					 return new Symbol(new SimpleExpr.UnaryPlusExpr(t));
				}
			},
			new Action() {	// [31] SimpleExpr = MINUS Term.t
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_t = _symbols[offset + 2];
					final Term t = (Term) _symbol_t.value;
					 return new Symbol(new SimpleExpr.UnaryMinusExpr(t));
				}
			},
			new Action() {	// [32] SimpleExpr = SimpleExpr.s PLUS Term.t
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_s = _symbols[offset + 1];
					final SimpleExpr s = (SimpleExpr) _symbol_s.value;
					final Symbol _symbol_t = _symbols[offset + 3];
					final Term t = (Term) _symbol_t.value;
					 return new Symbol(new SimpleExpr.PlusExpr(s, t));
				}
			},
			new Action() {	// [33] SimpleExpr = SimpleExpr.s MINUS Term.t
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_s = _symbols[offset + 1];
					final SimpleExpr s = (SimpleExpr) _symbol_s.value;
					final Symbol _symbol_t = _symbols[offset + 3];
					final Term t = (Term) _symbol_t.value;
					 return new Symbol(new SimpleExpr.MinusExpr(s, t));
				}
			},
			new Action() {	// [34] Term = Factor.f
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_f = _symbols[offset + 1];
					final Factor f = (Factor) _symbol_f.value;
					 return new Symbol(new Term.FactorTerm(f));
				}
			},
			new Action() {	// [35] Term = Term.t MULT Factor.f
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_t = _symbols[offset + 1];
					final Term t = (Term) _symbol_t.value;
					final Symbol _symbol_f = _symbols[offset + 3];
					final Factor f = (Factor) _symbol_f.value;
					 return new Symbol(new Term.MultTerm(t, f));
				}
			},
			new Action() {	// [36] Term = Term.t DIV Factor.f
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_t = _symbols[offset + 1];
					final Term t = (Term) _symbol_t.value;
					final Symbol _symbol_f = _symbols[offset + 3];
					final Factor f = (Factor) _symbol_f.value;
					 return new Symbol(new Term.DivTerm(t, f));
				}
			},
			new Action() {	// [37] Term = Term.t MOD Factor.f
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_t = _symbols[offset + 1];
					final Term t = (Term) _symbol_t.value;
					final Symbol _symbol_f = _symbols[offset + 3];
					final Factor f = (Factor) _symbol_f.value;
					 return new Symbol(new Term.ModTerm(t, f));
				}
			},
			new Action() {	// [38] Factor = IDENT.i
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_i = _symbols[offset + 1];
					final String i = (String) _symbol_i.value;
					 return new Symbol(new Factor.IdentFactor(i));
				}
			},
			new Action() {	// [39] Factor = NUMBER.n
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol n = _symbols[offset + 1];
					 return new Symbol(new Factor.NumberFactor(convert(n)));
				}
			},
			new Action() {	// [40] Factor = LPAREN SimpleExpr.s RPAREN
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_s = _symbols[offset + 2];
					final SimpleExpr s = (SimpleExpr) _symbol_s.value;
					 return new Symbol(new Factor.CompExprFactor(s));
				}
			}
		};


        this.report = ErrorEvents.forC0();
	}

	protected Symbol invokeReduceAction(int rule_num, int offset) {
		return actions[rule_num].reduce(_symbols, offset);
	}
}
