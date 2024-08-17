package game;

public class Main {

	    public static void main(String[] args) {
	        Game game = Game.getInstance();
	        
	   
	        FactoryelementGame easyLevelFactory = new EasyLevel();
	        game.setLevelFactory(easyLevelFactory);
	        game.play();
	        System.out.println("------------");
	        
	    
	        FactoryelementGame hardLevelFactory = new HardLevel();
	        game.setLevelFactory(hardLevelFactory);
	        game.play();
	    }
	}
