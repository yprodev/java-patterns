public class MVCCalculator {
	public static void main(String[] argv) {
		CalculatorView theView = new CalculatorView();
		CalculatorModel theModel = new CalculatorModel();
		CalculatorController theController = new CalculatorController(theView, theModel);
		theView.setVisible(true);
	}
}
