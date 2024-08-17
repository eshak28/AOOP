package game;

public class Game {
	 private static Game instance;
	    private FactoryelementGame factory;
	    private Game() {
	    	
	    } 
	    public static Game getInstance() {
	        if(instance == null) {
	            instance = new Game();
	        }
	        return instance;
	    }
	    public void setLevelFactory(FactoryelementGame factory) {
	        this.factory = factory;
	    }
	    public void play() {
	        Enemy enemy = factory.createEnemy();
	        Weapon weapon = factory.createWeapon();
	        Powerup powerup = factory.createPowerUp();
	        enemy.attack();
	        weapon.use();
	        powerup.activate();
	    }
}
