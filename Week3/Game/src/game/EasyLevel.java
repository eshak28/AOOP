package game;

public class EasyLevel implements FactoryelementGame {

	@Override
	public Enemy createEnemy() {
		return new Goblin();
	}

	@Override
	public Weapon createWeapon() {
		return new Dagger();
	}

	@Override
	public Powerup createPowerUp() {
		return new Health();
	}

}
