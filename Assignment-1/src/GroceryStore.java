
public class GroceryStore {
	private String storeName, location, address;
	private int phoneNum;

	public void setStoreName(String storeName) { // constructor with 1 argument
		this.storeName = storeName;
	}

	public void setLocation(String location) { // constructor with 1 argument
		this.location = location;
	}

	public void setPhoneNum(int phoneNum) { // constructor with 1 argument
		this.phoneNum = phoneNum;
	}

	public void setAddress(String address) { // constructor with 1 argument
		this.address = address;
	}

	public String getStoreName() {
		return storeName;
	}

	public String getLocation() {
		return location;
	}

	public int getPhoneNum() {
		return phoneNum;
	}

	public String getAddress() {
		return address;
	}
}
