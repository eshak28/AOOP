package healthtracker;

public class Data {
	private int steps;
    private int calories;
    private int sleepHours;
    
    public Data(int steps, int calories, int sleepHours) {
        this.steps = steps;
        this.calories = calories;
        this.sleepHours = sleepHours;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getSleepHours() {
        return sleepHours;
    }

    public void setSleepHours(int sleepHours) {
        this.sleepHours = sleepHours;
    }
}

