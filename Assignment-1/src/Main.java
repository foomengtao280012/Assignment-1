import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in); // pre-defined class

	public static void main(String[] args) {
		System.out.println("Choose your option: ");
		System.out.println("1. Admin");
		System.out.println("2. Customer");
		System.out.print("Enter option: ");
		int option = scan.nextInt();
		if (option == 1) {
			GroceryStore gs = new GroceryStore();// constructor with no argument
			gs.setStoreName("Fresh Mart");
			gs.setLocation("Klang");
			gs.setPhoneNum(32917028);
			gs.setAddress("Taman Gembira");
			System.out.println("*******************************");
			System.out.println("Store name\t: " + gs.getStoreName());
			System.out.println("Store location\t: " + gs.getLocation());
			System.out.println("Phone number\t: " + gs.getPhoneNum());
			System.out.println("Address\t: " + gs.getAddress());
			System.out.println("*******************************");
			System.out.println("Welcome admin.");
			char choice;
			do {
				System.out.println("Choose your operation: ");
				System.out.println("1. View Financial Report");
				System.out.println("2. Register Employee Details");
				System.out.println("3. View Inventory Info");
				System.out.print("Enter operation: ");
				int operation = scan.nextInt();
				if (operation == 1) {
					Finance f = new Finance(12000.0, 3000.0, 2500.0, 4800.0, 600.0);// constructor with 5 arguments
					f.printInfo();
				} else if (operation == 2) {
					Employee employee = new Employee();// constructor with no argument
					employee.printInfo();
				} else if (operation == 3) {
					Inventory i = new Inventory();// constructor with no argument
					i.PrintInfo();
				} else {
					System.out.println("Error! Please select a valid operation!");
				}
				System.out.print("Do you want to continue(Y/N)? ");
				choice = scan.next().charAt(0);
			} while (choice == 'Y' || choice == 'y');
		} else if (option == 2) {
			Customer customer = new Customer();// constructor with no argument
			customer.printInfo();
			Advertisement ad = new Advertisement();// constructor with no argument
			ad.printAdvertisement();
			System.out.println("Please select your purchase: ");
			System.out.println("1. Frozen Pizza");
			System.out.println("2. Fish Fillet");
			System.out.println("3. Sausage");
			System.out.print("Enter your purchase: ");
			int purchase = scan.nextInt();
			System.out.print("Enter quantity: ");
			int quantity = scan.nextInt();
			Sales sales = new Sales(purchase, quantity);// constructor with 2 arguments
			sales.printInfo();
			System.out.print("\nDo you need a delivery service?(Y/N): ");
			char choice = scan.next().charAt(0);
			if (choice == 'Y' || choice == 'y') {
				System.out.println("Choose your delivery mode: ");
				System.out.println("1. Face to face");
				System.out.println("2. Parcel shipping");
				System.out.print("Enter option: ");
				int mode = scan.nextInt();
				System.out.print("Enter distance(in km): ");
				double distance = scan.nextDouble();
				Delivery d = new Delivery(purchase, quantity, mode, distance);// constructor with 4 arguments
				d.printInfo();
			} else {
				System.out.println("Thank you for your purchase!");
			}
		}
	}
}
