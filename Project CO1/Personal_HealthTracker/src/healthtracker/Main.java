package healthtracker;

public class Main {

	public static void main(String[] args) {
		Data healthData = new Data(10000, 2000, 8);
        Goal goal = new Goal(8000, 2200, 7);

        Progress tracker = new Progress();

        if (tracker.validateHealthData(healthData)) {
            System.out.println("Health data is valid.");
        } else {
            System.out.println("Health data is invalid.");
        }

     
        boolean goalCompleted = tracker.checkGoalCompletion(healthData, goal);
        System.out.println("Goal Completed: " + goalCompleted);

        tracker.reportProgress(healthData, goal);
    }


	}


