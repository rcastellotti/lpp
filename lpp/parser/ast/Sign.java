package lpp.parser.ast;

import lpp.visitors.Visitor;

public class Sign extends UnaryOp {

	public Sign(Exp exp) {
		super(exp);
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visitSign(exp);
	}
}
