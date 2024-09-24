package orderprocess;

public class Order {

	    private boolean isValid;
	    private boolean isPacked;
	    private boolean isShipped;

	    public Order() {
	        this.isValid = false;
	        this.isPacked = false;
	        this.isShipped = false;
	    }

	    public boolean isValid() {
	        return isValid;
	    }

	    public void setValid(boolean valid) {
	        isValid = valid;
	    }

	    public boolean isPacked() {
	        return isPacked;
	    }

	    public void setPacked(boolean packed) {
	        isPacked = packed;
	    }

	    public boolean isShipped() {
	        return isShipped;
	    }

	    public void setShipped(boolean shipped) {
	        isShipped = shipped;
	    }
	}



