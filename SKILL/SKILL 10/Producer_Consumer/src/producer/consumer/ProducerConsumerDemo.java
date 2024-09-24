package producer.consumer;

public class ProducerConsumerDemo {
	public static void main(String[] args)
	{
		 SharedBuffer sharedBuffer = new SharedBuffer(5); 

	        Producer producer = new Producer(sharedBuffer);
	        Consumer consumer = new Consumer(sharedBuffer);

	        producer.start();
	        consumer.start();

	        try {
	            producer.join();
	            consumer.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	}
}
