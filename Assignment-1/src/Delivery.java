
public class Delivery extends Sales {
	String deliveryMode;
	double deliveryCost, distance;

	Delivery(int purchase, int quantity, int mode, double distance) { // constructor with 4 argument
		super(purchase, quantity);
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

	public void printInfo() {
		System.out.println("Delivery mode\t\t: " + this.deliveryMode);
		System.out.printf("Cost of delivery(per km): RM%.2f%n", this.deliveryCost);
		System.out.println("Distance(in km)\t\t: " + this.distance + "km");
		System.out.printf("Delivery Fee\t\t: RM%.2f%n", calDeliveryFee());
		System.out.printf("Total Price(Include Delivery): RM%.2f%n", (calDeliveryFee() + calTotalPrice()));
	}
}
