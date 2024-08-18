package orderprocess;

public class ShippingHandler extends Handler {

	@Override
	public void handleOrder(Order order) {
		        if (order.isPacked()) {
		            System.out.println("Shipping order...");
		            order.setShipped(true);
		        }

	}

}
