package orderprocess;

public class ValidationHandler extends Handler {

	@Override
	public void handleOrder(Order order) {
	System.out.println("Validating the Order...");
	order.setValid(true);
	if(nextHandler!= null)
	{
		nextHandler.handleOrder(order);
	}

	}

}
