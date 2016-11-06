public interface Flys {
    // Avoid interfaces that just force action
    // Using an interface just to force the creation of a method
    // is a bad idea.
    // BAD TECHNIQUE
    /*
    void fly();
    */

    String fly();
}

class ItFlys implements Flys {

    public String fly() {
	return "Flying High";
    }
}

class CantFly implements Flys {

    public String fly() {
	return "I can't fly...";
    }
}
