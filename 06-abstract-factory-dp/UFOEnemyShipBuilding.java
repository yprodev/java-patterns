public class UFOEnemyShipBuilding extends EnemyShipBuilding {
	protected EnemyShip makeEnemyShip(String typeOfEnemy) {
		EnemyShip theEnemyShip = null;

		if(typeOfEnemy.equals("UFO")) {
			EnemyShipFactory shipPartsFactory = new UFOEnemyShipFactory();
			theEnemyShip = new UFOEnemyShip(shipPartsFactory);
			theEnemyShip.setName("UFO Grunt Ship");
		} else 

				if(typeOfEnemy.equals("UFO BOSS")) {
					EnemyShipFactory shipPartsFactory = new UFOBossEnemyShipFactory();
					theEnemyShip = new UFOBossEnemyShip(shipPartsFactory);
					theEnemyShip.setName("UFO Boss Ship");
		}

		return theEnemyShip;

	}
}
