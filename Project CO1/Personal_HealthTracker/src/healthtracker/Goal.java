package healthtracker;

public class Goal {
	 private int stepGoal;
	    private int calorieGoal;
	    private int sleepGoal;

	    public Goal(int stepGoal, int calorieGoal, int sleepGoal) {
	        this.stepGoal = stepGoal;
	        this.calorieGoal = calorieGoal;
	        this.sleepGoal = sleepGoal;
	    }

	    public int getStepGoal() {
	        return stepGoal;
	    }

	    public void setStepGoal(int stepGoal) {
	        this.stepGoal = stepGoal;
	    }

	    public int getCalorieGoal() {
	        return calorieGoal;
	    }
	    
	    public void setCalorieGoal(int calorieGoal) {
	        this.calorieGoal = calorieGoal;
	    }

	    public int getSleepGoal() {
	        return sleepGoal;
	    }

	    public void setSleepGoal(int sleepGoal) {
	        this.sleepGoal = sleepGoal;
	    }
}
