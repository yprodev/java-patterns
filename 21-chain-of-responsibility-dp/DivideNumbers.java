public class DivideNumbers implements Chain {
	
	private Chain nextInChain;

	public void setNextChain(Chain nextChain) {
		this.nextInChain = nextChain;
	}

	public void calculate(Numbers request) {
		if(request.getCalcWanted() == "div") {
			// quick and dirty method to add
			// don't repeat that at home ))
			System.out.println(request.getNumber1() + " / " + request.getNumber2() + " = " + (request.getNumber1() / request.getNumber2()));
		} else {
			System.out.println("Sorry, but this is works only for add, mul, sub, div operations");
		}
	}

}
