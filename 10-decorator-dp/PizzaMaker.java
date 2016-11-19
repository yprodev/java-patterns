public class PizzaMaker {
	public static void main(String[] args) {
		// Creating our Mozzarella Pizza with a tomato sauce
		Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));

		System.out.println("Ingredients: " + basicPizza.getDescription());
		System.out.println("Price: " + basicPizza.getCost());
	}
}
