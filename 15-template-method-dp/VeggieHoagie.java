public class VeggieHoagie extends Hoagie {

	String[] veggiesUsed = {"Lettuce", "Tomatoes", "Onions", "Sweet Peppers"};
	String[] condimentsUsed = {"Oil", "Vinegar"};

	boolean customerWantsMeat() { return false; }
	boolean customerWantsCheese() { return false; }

	void addMeat() {} 

	void addCheese() {}

	void addVegetables() {
		System.out.println("Adding the vegetables: ");

		for (String veg : veggiesUsed) {
			System.out.print(veg + " ");
		}
	}

	void addCondiments() {
		System.out.println("Adding the Condiments: ");

		for (String condiment : condimentsUsed) {
			System.out.print(condiment + " ");
		}
	}


}
