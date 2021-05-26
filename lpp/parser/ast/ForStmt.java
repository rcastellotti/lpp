package lpp.parser.ast;

import static java.util.Objects.requireNonNull;

import lpp.visitors.Visitor;

public class ForStmt implements Stmt {

    private final VarIdentAST ident;
    private final RangeLiteral range;
	private final Block block;

	public ForStmt(VarIdentAST ident, RangeLiteral range, Block block) {
        this.ident = requireNonNull(ident);
		this.range = requireNonNull(range);
		this.block = requireNonNull(block);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "(" + ident + "," + range + "," + block + ")";
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visitForStmt(ident, range, block);
	}

}
