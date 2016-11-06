public class AnimalPlay {

    public static void main (String[] args) {

	// Why we are typing Animal sparky, but not Dog sparky?
	Animal sparky = new Dog();
	Animal tweety = new Bird();

	System.out.println("Dog: " + sparky.tryToFly());
	System.out.println("Bird: " + tweety.tryToFly());

	// We adding flying ability to our Dog dynamicly
	sparky.setFlyingAbility(new ItFlys());

	System.out.println("Dog gets the ability: " + sparky.tryToFly());
    }
}

