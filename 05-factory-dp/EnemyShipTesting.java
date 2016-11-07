import java.util.Scanner;

public class EnemyShipTesting {

	/*
	 * Old style of implementing these things
	 * This is not very good because it is NOT dynamic
	public static void main(String[] args) {
		EnemyShip ufoShip = new UFOEnemyShip();

		doStuffEnemy(ufoShip);
	}

	
	public static void doStuffEnemy(EnemyShip anEnemyShip) {
		anEnemyShip.displayEnemyShip();
		anEnemyShip.followHeroShip();
		anEnemyShip.enemyShipShoots();
	}
	*/

	public static void main(String[] args) {

		EnemyShip theEnemy = null;

		Scanner userInput = new Scanner(System.in);
		String enemyShipOption = "";
		System.out.println("What type of ship (U / R): ");

		if (userInput.hasNextLine()) {
			enemyShipOption = userInput.nextLine();
		}

		if (enemyShipOption.equals("U")){
			theEnemy = new UFOEnemyShip();
		} else if (enemyShipOption.equals("R")) {
			theEnemy = new RocketEnemyShip();
		}

		doStuffEnemy(theEnemy);
	}

	
	public static void doStuffEnemy(EnemyShip anEnemyShip) {
		anEnemyShip.displayEnemyShip();
		anEnemyShip.followHeroShip();
		anEnemyShip.enemyShipShoots();
	}
}
