public class TestingReflection {

	public static void main(String[] args) {
		Class reflectClass = UFOEnemyShip.class;
		String className = reflectClass.getName();
		System.out.print(className + "\n");
	}

}
