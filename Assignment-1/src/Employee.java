import java.util.Scanner;

public class Employee {
	String name, gender, address;
	int age, phoneNum;
	Scanner scan = new Scanner(System.in); //Pre-Defined Class
	
	Employee(){ //Constructor with no argument
		System.out.println("\nRegistering Employee info...");
		System.out.print("Enter name\t\t: ");
		this.name = scan.next()+scan.nextLine();
		System.out.print("Enter age\t\t: ");
		this.age = scan.nextInt();
		System.out.print("Enter gender\t\t: ");
		this.gender = scan.next()+scan.nextLine();
		System.out.print("Enter phone number\t: ");
		this.phoneNum = scan.nextInt();
		System.out.print("Enter address\t\t: ");
		this.address = scan.next()+scan.nextLine();
	}

	public void printInfo() {
		System.out.println("Registered successfully, displaying employee info...");
		System.out.println("====================================================");
		System.out.println("Employee Name\t: " + this.name);
		System.out.println("Age\t\t: " + this.age);
		System.out.println("Gender\t\t: " + this.gender);
		System.out.println("Phone Number\t: " + this.phoneNum);
		System.out.println("Home Address\t: " + this.address);
		System.out.println("====================================================");
	}
}
