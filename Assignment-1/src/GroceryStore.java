
public class GroceryStore {
	private String storeName, address, businessHours;
	private int phoneNum;

	public void setStoreName(String storeName) { // constructor with 1 argument
		this.storeName = storeName;
	}
	
	public void setAddress(String address) { // constructor with 1 argument
		this.address = address;
	}

	public void setPhoneNum(int phoneNum) { // constructor with 1 argument
		this.phoneNum = phoneNum;
	}
	
	public void setBusinessHours(String businessHours) { // constructor with 1 argument
		this.businessHours = businessHours;
	}

	public String getStoreName() {
		return storeName;
	}
	
	public String getAddress() {
		return address;
	}

	public int getPhoneNum() {
		return phoneNum;
	}

	public String getBusinessHours() {
		return businessHours;
	}
}
