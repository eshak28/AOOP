package producer.consumer;

public class Consumer extends Thread {
	private final SharedBuffer sharedBuffer;

    public Consumer(SharedBuffer sharedBuffer) {
        this.sharedBuffer = sharedBuffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                sharedBuffer.consume();
                Thread.sleep(150); 
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
