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

		EnemyShipFactory shipFactory = new EnemyShipFactory();

		EnemyShip theEnemy = null;
		Scanner userInput = new Scanner(System.in);
		System.out.print("What type of ship (U / R / B): ");

		if (userInput.hasNextLine()) {
			String typeOfShip = userInput.nextLine();
			theEnemy = shipFactory.makeEnemyShip(typeOfShip);
		}

		if (theEnemy != null) {
			doStuffEnemy(theEnemy);
		} else System.out.println("Enter a U, R or B");


	}

	
	public static void doStuffEnemy(EnemyShip anEnemyShip) {
		anEnemyShip.displayEnemyShip();
		anEnemyShip.followHeroShip();
		anEnemyShip.enemyShipShoots();
	}
}
