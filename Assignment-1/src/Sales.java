
public class Sales {
	String productName;
	double price;
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

	public double calTotalPrice() {
		return this.price * this.quantity;
	}

	public double calTotalPrice(double price) {
		return price * this.quantity;
	}

	public double calTotalPrice(double price, int quantity) {
		return price * quantity;
	}

	public void printInfo() {
		System.out.println("\n==============Your Purchase==============");
		System.out.println("Product name\t: " + this.productName);
		System.out.printf("Unit Price\t: RM%.2f%n", this.price);
		System.out.println("Quantity\t: " + this.quantity);
		System.out.printf("Total price\t: RM%.2f%n", calTotalPrice());
		System.out.println("======Thank you, please come again!======");
	}
}
