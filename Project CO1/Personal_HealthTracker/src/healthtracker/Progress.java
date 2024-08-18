package healthtracker;

public class Progress {
	public boolean validateHealthData(Data Data) {
       
        return Data.getSteps() >= 0 && Data.getCalories() >= 0 && Data.getSleepHours() >= 0;
    }

	public boolean checkGoalCompletion(Data data, Goal goal) {
	    return data.getSteps() >= goal.getSleepGoal() &&
	           data.getCalories() <= goal.getCalorieGoal() &&
	           data.getSleepHours() >= goal.getSleepGoal();
	}

    public void reportProgress(Data healthData, Goal goal) {
        System.out.println("Progress Report:");
        System.out.println("Steps: " + healthData.getSteps() + "/" + goal.getStepGoal());
        System.out.println("Calories: " + healthData.getCalories() + "/" + goal.getCalorieGoal());
        System.out.println("Sleep: " + healthData.getSleepHours() + " hours/" + goal.getSleepGoal() + " hours");
    }


}
