public class MultNumbers implements Chain {
	
	private Chain nextInChain;

	public void setNextChain(Chain nextChain) {
		this.nextInChain = nextChain;
	}

	public void calculate(Numbers request) {
		if(request.getCalcWanted() == "mul") {
			// quick and dirty method to add
			// don't repeat that at home ))
			System.out.println(request.getNumber1() + " * " + request.getNumber2() + " = " + (request.getNumber1() * request.getNumber2()));
		} else {
			nextInChain.calculate(request);
		}
	}

}
