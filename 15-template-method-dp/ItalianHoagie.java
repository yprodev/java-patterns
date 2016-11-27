public class ItalianHoagie extends Hoagie {

	String[] meatUsed = {"Salami", "Pepperoni", "Capicola Ham"};
	String[] cheeseUsed = {"Provolone"};
	String[] veggiesUsed = {"Lettuce", "Tomatoes", "Onions", "Sweet Peppers"};
	String[] condimentsUsed = {"Oil", "Vinegar"};

	void addMeat() {

		System.out.println("Adding the meat: ");

		for (String meat : meatUsed) {
			System.out.print(meat + " ");
		}

	}

	void addCheese() {
		System.out.println("Adding the cheese: ");

		for (String cheese : cheeseUsed) {
			System.out.print(cheese + " ");
		}
	}

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
