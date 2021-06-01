
public class Finance extends GroceryStore{
	double totalIncome, insurance, rent, inventory, advertisementCosts;

	Finance(double totalIncome, double insurance, double rent, double inventory, double advertisementCosts) { //constructor with 5 arguments
		this.totalIncome = totalIncome;
		this.insurance = insurance;
		this.rent = rent;
		this.inventory = inventory;
		this.advertisementCosts = advertisementCosts;
	}

	public double calTotalCost() {
		return insurance + rent + inventory + advertisementCosts;

	}

	public double calNetIncome() {
		return totalIncome - calTotalCost();
	}

	public void printInfo() {
		System.out.println("\n===============Financial Report for Fresh Mart===============");
		System.out.printf("Total income of the store for this month\t: RM%.2f%n" , this.totalIncome);
		System.out.printf("Total expenses of the store for this month\t: RM%.2f%n" , calTotalCost());
		System.out.printf("Net income of the store for this month\t\t: RM%.2f%n" , calNetIncome());
		System.out.println("=============================================================");
	}
}
