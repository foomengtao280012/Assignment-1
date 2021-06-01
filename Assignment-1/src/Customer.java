import java.util.Scanner;

public class Customer {
	String name, address;
	int phoneNum;
	Scanner scan = new Scanner(System.in); //Pre-Defined Class
	
	Customer(){ //Constructor with no argument
		System.out.println("\nPlease enter your details...");
		System.out.print("Enter name\t\t: ");
		this.name = scan.next()+scan.nextLine();
		System.out.print("Enter phone number\t: ");
		this.phoneNum = scan.nextInt();
		System.out.print("Enter address\t\t: ");
		this.address = scan.next()+scan.nextLine();
	}

	public void printInfo() {
		System.out.println("Registered successfully, displaying customer info...");
		System.out.println("====================================================");
		System.out.println("Customer Name\t: " + this.name);
		System.out.println("Phone Number\t: " + this.phoneNum);
		System.out.println("Home Address\t: " + this.address);
		System.out.println("====================================================");
	}
}
