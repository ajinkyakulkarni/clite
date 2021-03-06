package abstractTreeNodes;

import symTable.AbstractDescr;
import symTable.SymTable;

public class AssNode extends BinNode {

	private static final long serialVersionUID = 1L;

	public AssNode () {
		op = Ops.assop;
	}
	
	public AssNode(AbstractNode left_side, AbstractNode right_side) {
		
		op = Ops.assop;
		SetL(left_side);
		SetR(right_side);
	}

	public void print(int indentation) {
		
		for(int i = 0; i < indentation; i++) System.out.print(' ');
		System.out.println("AssNode");
		GetL().print(indentation+2);
		GetR().print(indentation+2);
	}	
	
	public String toString() {
		return new String("AssNode" + 
				"\n  " + GetL().toString() +
				"\n  " + GetR().toString());
	}
	
	@Override
	public void SetR(AbstractNode fr) {
		if (fr != null) {
			super.SetR(fr);
		}
		else {
			super.SetR(new IntNode("0"));
		}
	}

	@Override
	public AbstractDescr Compile(SymTable env) {
		return super.Compile(env);
	}
}
