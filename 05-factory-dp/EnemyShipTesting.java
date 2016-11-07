import java.util.Scanner;

public class EnemyShipTesting {

	/*
	 * Old style of implementing these things
	 * This is not very good because it is NOT dynamic
	 */
	public static void main(String[] args) {
		EnemyShip ufoShip = new UFOEnemyShip();

		doStuffEnemy(ufoShip);
	}

	
	public static void doStuffEnemy(EnemyShip anEnemyShip) {
		anEnemyShip.displayEnemyShip();
		anEnemyShip.followHeroShip();
		anEnemyShip.enemyShipShoots();
	}

}
