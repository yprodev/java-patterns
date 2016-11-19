public abstract class EnemyShip {

	private String name;

	ESWeapon weapon;
	ESEngine engine;

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		name = newName;
	}

	abstract void makeShip();

	public void followHeroShip() {
		System.out.println(getName() + " is following the hero at " + engine);
	}


}
