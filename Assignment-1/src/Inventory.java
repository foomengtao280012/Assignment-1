
public class Inventory {
	String[] productName = { "Frozen Pizza", "Fish Fillet", "Sausage" };
	double[] price = { 12.0, 4.0, 7.0 };
	int[] quantity = { 48, 36, 57 };

	public void PrintInfo() {
		System.out.println("Inventory info");
		for (int i = 0; i < 3; i++) {
			System.out.println("*******************************");
			System.out.println("Product name :" + productName[i]);
			System.out.println("Price of the product: " + price[i]);
			System.out.println("Quantity left in inventory: " + quantity[i]);
		}
		System.out.println("*******************************");
	}
}
