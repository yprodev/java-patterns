public class Dog extends Animal {

    public void digHole() {
	System.out.println("Dig hole");
    }

    public Dog() {
	super();

	setSound("Bark");
	flyingType = new CantFly();
    }

    // We can override method
    // BAD TECHNIQUE
    /*
    public void fly() {
	System.out.println("I can't fly...");
    }
    */
}
