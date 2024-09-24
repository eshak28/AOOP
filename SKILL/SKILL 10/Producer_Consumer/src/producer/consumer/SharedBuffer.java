package producer.consumer;

import java.util.LinkedList;

public class SharedBuffer {
	 private final LinkedList<String> buffer = new LinkedList<>();
	    private final int capacity;

	    public SharedBuffer(int capacity) {
	        this.capacity = capacity;
	    }

	    public synchronized void produce(String message) throws InterruptedException {
	        while (buffer.size() == capacity) {
	            wait(); 
	        }
	        buffer.add(message);
	        System.out.println("Produced: " + message);
	        notifyAll(); 
	    }


	    public synchronized String consume() throws InterruptedException {
	        while (buffer.isEmpty()) {
	            wait(); 
	        }
	        String message = buffer.removeFirst();
	        System.out.println("Consumed: " + message);
	        notifyAll(); 
	        return message;
	    }
}
