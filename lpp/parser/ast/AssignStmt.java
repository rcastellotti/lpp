package lpp.parser.ast;

import lpp.visitors.Visitor;

public class AssignStmt extends AbstractAssignStmt {

	public AssignStmt(VarIdent ident, Exp exp) {
		super(ident, exp);
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visitAssignStmt(ident, exp);
	}
}
