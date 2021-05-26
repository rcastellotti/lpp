package lpp.visitors.typechecking;

import static java.util.Objects.hash;

public class RangeType implements Type {

	public static final String TYPE_NAME = "RANGE";

	public RangeType() {}

	@Override
	public String toString() {
		return "[int:int]";
	}

	@Override
	public int hashCode() {
		return hash(TYPE_NAME);
	}

	@Override
	public final boolean equals(Object obj) {
        return obj instanceof RangeType;
	}
}
