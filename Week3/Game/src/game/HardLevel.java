package game;

public class HardLevel implements FactoryelementGame {

	@Override
	public Enemy createEnemy() {
	        return new Orc1();

	}

	@Override
	public Weapon createWeapon() {
		  return new Sword();
	}

	@Override
	public Powerup createPowerUp() {
		return new Sheild();
	}

}
