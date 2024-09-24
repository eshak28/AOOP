package orderprocess;

public class PackingHandler extends Handler {

	@Override
	public void handleOrder(Order order) {
		 if (order.isValid()) {
	            System.out.println("Packing order...");
	            order.setPacked(true);
	            if (nextHandler != null) {
	                nextHandler.handleOrder(order);
	            }
		 }

	}

}
