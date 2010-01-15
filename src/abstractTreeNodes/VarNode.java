package abstractTreeNodes;

import symTable.AbstractDescr;
import symTable.SymTable;
import codeGen.CodeGen;

public class VarNode extends BinNode {

	private static final long serialVersionUID = 1L;

	public VarNode () {}
	
	public VarNode(IdfNode varName, AbstractNode type) {
		SetL(varName);
		SetR(type);
	}

	public void print(int indentation) {
		
		for(int i = 0; i < indentation; i++) System.out.print(' ');
		System.out.println("VarNode");
		GetL().print(indentation+2);
		GetR().print(indentation+2);
	}	
	
	public String toString() {
		return new String("VarNode" + 
				"\n  " + GetL().toString() +
				"\n  " + GetR().toString());
	}
	
	//TODO:ersetzen
	@Override
	public void Compile() {
		System.out.println("VarNode::Compile");
		CodeGen.envs.get(CodeGen.level).addVariable(
				((IdfNode)GetL()).GetS(), 
				GetR().Compile(CodeGen.envs.get(CodeGen.level))
		);
		((IdfNode)GetL()).Compile();
	}
	
	@Override
	public AbstractDescr Compile(SymTable env) {
		System.out.println("VarNode::Compile2");
		env.addVariable(
				((IdfNode)GetL()).GetS(), 
				GetR().getDescriptor(env)
		);
		((IdfNode)GetL()).Compile(env);
		//TODO: null ???
		return null;
	}
}
