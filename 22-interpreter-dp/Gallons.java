public class Gallons extends Expression {

	public abstract String gallons(double quantity) {
		return Double.toString(quantity * 4);
	}

	public abstract String quarts(double quantity) {
		return Double.toString(quantity * 8);
	}

	public abstract String cups(double quantity) {
		return Double.toString(quantity * 16);
	}

	public abstract String tablespoons(double quantity) {
		return Double.toString(quantity * 256);
	}

}
