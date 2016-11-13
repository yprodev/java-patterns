public class Singleton {

	private static Singleton firstInstance = null;

	// Creating Constructor
	public Singleton(){  }

	public static Singleton getInstance() {
		if(firstInstance == null) {
			firstInstance = new Singleton();
		}
		return firstInstance;
	}
}
