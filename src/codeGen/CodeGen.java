package codeGen;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import symTable.AbstractDescr;
import symTable.AbstractEntry;
import symTable.SimpleTypeDescr;
import symTable.SymTable;
import symTable.VarEntry;

import instructions.*;
import interpreter.Interpreter;
import abstractTreeNodes.*;

public class CodeGen {

	FileInputStream in;
	ObjectInputStream s;

	AbstractNode root;
	
	//Program Speicher (Prog)
	public static ArrayList<AbstrInstr> progst = new ArrayList<AbstrInstr>();
	
	public static ArrayList<SymTable> envs = new ArrayList<SymTable>();

	public static int[] labels = new int[10000];
	public static int progcnt = 0;
	public static int labcnt = 0;
	public static int level = 0;

	public static void OutInstr(AbstrInstr instr) {

		System.out.println("OutInstr " + (progcnt));
		progst.add(instr);
		progcnt++;
	}

	public CodeGen(String filename) throws IOException, ClassNotFoundException {

		in = new FileInputStream(filename);
		s = new ObjectInputStream(in);

		System.out.println("== CodeGen abstract tree wieder einlesen ==");
		root = (AbstractNode) s.readObject();
	}

	public void start(String instrfile) throws IOException {

		FileOutputStream f = new FileOutputStream(instrfile);
		ObjectOutputStream os = new ObjectOutputStream(f);

		System.out.println("== CodeGen auf gehts ==");

		((/*ProgNode*/AbstractNode) root).Compile();

		System.out.println("== CodeGen code f�r Interpretierer rausschreiben ==");
		os.writeObject(progst);
		os.flush();
	}

	public static int NewLabel() {
		return labcnt++;
	}

	public static void DefLabel(int flab) {
		labels[flab] = CodeGen.progcnt;
	}	
	
	public static SearchResult Search(String s) {
		int level;
		VarEntry e = null;
		SymTable lenv;
		level = CodeGen.level;
		while ((level >= 0) && (e == null)) {
			lenv = CodeGen.envs.get(level);
			e = lenv.getVariable(s);
			if (e == null)
				level--;
		}
		return new SearchResult(level, e);
	}
	
	public static void printEnvs() {
		
		System.out.println("== Symboltabellen ausgabe ==");
		for(int i = 0; i < envs.size(); i++) {
			System.out.println("  Symboltabelle " + i + ":");
			envs.get(i).Print();
		}
	}
}
