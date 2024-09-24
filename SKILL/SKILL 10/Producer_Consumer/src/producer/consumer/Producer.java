package producer.consumer;
import java.util.Random;

public class Producer extends Thread {
	private final SharedBuffer sharedBuffer;
    private final String[] messages = {
        "Hello from the Producer!",
        "Data packet 1 received.",
        "Task completed successfully.",
        "Important update available.",
        "Notification: Check your inbox.",
        "Reminder: Meeting at 3 PM.",
        "Alert: New message from client.",
        "Status: All systems operational.",
        "Info: Your order has been shipped.",
        "Thanks for your support!"
    };
    private final Random random = new Random();

    public Producer(SharedBuffer sharedBuffer) {
        this.sharedBuffer = sharedBuffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
            
                String message = messages[random.nextInt(messages.length)];
                sharedBuffer.produce(message);
                Thread.sleep(100); 
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

}
