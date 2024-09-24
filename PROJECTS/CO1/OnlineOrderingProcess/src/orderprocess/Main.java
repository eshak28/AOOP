package orderprocess;

public class Main {

	public static void main(String[] args) {
		 Order order = new Order();

	      
	        Handler validationHandler = new ValidationHandler();
	        Handler packingHandler = new PackingHandler();
	        Handler shippingHandler = new ShippingHandler();
	        validationHandler.setNextHandler(packingHandler);
	        packingHandler.setNextHandler(shippingHandler);

	        validationHandler.handleOrder(order);

	        System.out.println("Order Processing Completed:");
	        System.out.println("Order Validated: " + order.isValid());
	        System.out.println("Order Packed: " + order.isPacked());
	        System.out.println("Order Shipped: " + order.isShipped());
	    }
	

}
