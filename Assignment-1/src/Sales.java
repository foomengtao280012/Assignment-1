
public class Sales extends GroceryStore{
	String productName, deliveryMode;
	double price, deliveryCost, distance;
	int quantity;

	Sales(int purchase, int quantity) { // constructor with 2 arguments
		this.quantity = quantity;
		if (purchase == 1) {
			productName = "Frozen Pizza";
			price = 12.0;
		} else if (purchase == 2) {
			productName = "Fish Fillets";
			price = 4.0;
		} else if (purchase == 3) {
			productName = "Sausage";
			price = 7.0;
		} else {
			System.out.println("Product not found! Please enter a valid product name!");
		}
	}
	
	public void Delivery(int mode, double distance) { // constructor with 4 argument
		this.distance = distance;
		if (mode == 1) {
			deliveryMode = "Face to face";
			deliveryCost = 1.2;
		} else if (mode == 2) {
			deliveryMode = "Parcel Shipping";
			deliveryCost = 0.8;
		}
	}
	
	public double calDeliveryFee() {
		return deliveryCost * distance;
	}

	public double calTotalPrice() {
		return this.price * this.quantity;
	}

	public double calTotalPrice(double price) {
		return price * this.quantity;
	}

	public double calTotalPrice(double price, int quantity) {
		return price * quantity;
	}

	public void printSales() {
		System.out.println("\n==============Your Purchase==============");
		System.out.println("Product name\t: " + this.productName);
		System.out.printf("Unit Price\t: RM%.2f%n", this.price);
		System.out.println("Quantity\t: " + this.quantity);
		System.out.printf("Total price\t: RM%.2f%n", calTotalPrice());
		System.out.println("======Thank you, please come again!======");
	}
	
	public void printDelivery() {
		System.out.println("=======================================");
		System.out.println("Delivery mode\t\t: " + this.deliveryMode);
		System.out.printf("Cost of delivery(per km): RM%.2f%n", this.deliveryCost);
		System.out.println("Distance(in km)\t\t: " + this.distance + "km");
		System.out.printf("Delivery Fee\t\t: RM%.2f%n", calDeliveryFee());
		System.out.printf("Total Price(Include Delivery): RM%.2f%n", (calDeliveryFee() + calTotalPrice()));
		System.out.println("=======================================");
	}
}
