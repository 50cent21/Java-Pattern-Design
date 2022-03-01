package InterfaceSegregationExample2;

public interface RestaurantInterface {
	public void acceptOnlineOrder();
	public void takeTelephoneOrder();
	public void payOnline();
	public void walkInCustomerOrder();
	public void payInPerson();
}

public class OnlineClient implements RestaurantInterface {
	
	public void acceptOnlineOrder() {
		//logic for placing online order
	}
	public void takeTelephoneOrder() {
		//Not Applicable for Online Order
		throw new UnsupportedOperationException();
	}
	public void payOnline() {
		//logic for paying online
	}
	public void walkInCustomerOrder() {
		//Not applicable for online order
	}
	public void payInPerson() {
		//Not applicable for online order
	}
}
