package orderprocess;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OrderProcessingTest {
	private Order order;
    private Handler validationHandler;
    private Handler packingHandler;
    private Handler shippingHandler;

	@Before
	public void setUp() throws Exception {
		  order = new Order();
	        validationHandler = new ValidationHandler();
	        packingHandler = new PackingHandler();
	        shippingHandler = new ShippingHandler();

	        validationHandler.setNextHandler(packingHandler);
	        packingHandler.setNextHandler(shippingHandler);
	}

	@Test
	public void test() {
		 validationHandler.handleOrder(order);

	        // Validate the order has been processed through all stages
	        assertTrue("Order should be validated", order.isValid());
	        assertTrue("Order should be packed", order.isPacked());
	        assertTrue("Order should be shipped", order.isShipped());
		fail("Not yet implemented");
	}
	  public void testOrderValidationStage() {
	        validationHandler.handleOrder(order);
	  }
}
