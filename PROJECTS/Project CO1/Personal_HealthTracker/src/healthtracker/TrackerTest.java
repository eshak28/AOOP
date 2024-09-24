package healthtracker;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;


public class TrackerTest {
	 private Data Data;
	    private Goal goal;
	    private Progress tracker;

	@Before
	   public void setUp() {
        Data = new Data(10000, 2000, 8);
        goal = new Goal(8000, 2200, 7);
        tracker = new Progress();
    }

	@Test
	public void test() {
		assertTrue("Health data should be valid", tracker.validateHealthData(Data));
		fail("Not yet implemented");
	}
	@Test
	 public void testGoalCompletion() {
	        assertTrue("Goals should be completed", tracker.checkGoalCompletion(Data, goal));
	    }
	@Test
	  public void testReportProgress() {
	        tracker.reportProgress(Data, goal);
	    }

	    @Test
	    public void testIncompleteGoal() {
	        Data incompleteData = new Data(7000, 2500, 6); // Not meeting goals
	        assertFalse("Goals should not be completed", tracker.checkGoalCompletion(incompleteData, goal));
	    }
	}


