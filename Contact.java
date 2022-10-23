package contactService;

public class Contact {
	
	String contactID; // Contact ID
	String firstName; // First name
	String lastName; // Last name
	String phoneNum; // Phone number
	String address; // Address
	
	public Contact(String contactID, String firstName, String lastName, String phoneNum, String address) {
		super();
		
		if(contactID.length() <= 10 && contactID != null) { // Contact ID requirements
			this.contactID = contactID;
		}
		
		
		this.setFirstName(firstName); // First Name
		this.setLastName(lastName); // Last Name
		this.setPhoneNum(phoneNum); // Phone number
		this.setAddress(address); // Address
		
	}
	
	// - Getters - 
	public String getContactID() { // Contact ID
		return contactID;
	}
	
	public String getFirstName() { // First name
		return firstName;
	}

	public String getLastName() { // Last name
		return lastName;
	}
	
	public String getPhoneNum() { // Phone number
		return phoneNum;
	}
		
	public String getAddress() { // Address
		return address;
	}
	
	// - Setters -
	public void setFirstName(String firstName) { // First name
		if(firstName.length() <= 10 && firstName != null) { // First name requirements
			this.firstName = firstName; // If met, set
		}
	}
	
	public void setLastName(String lastName) { // Last Name
		if(lastName.length() <= 10 && lastName != null) { // Last name requirements
			this.lastName = lastName; // If met, set.
		}
	}
	
	public void setPhoneNum(String phoneNum) { // Phone number
		if(phoneNum.length() <= 10 && phoneNum != null) { // Phone number requirements
			this.phoneNum = phoneNum; // If met, set.
		}
	}
	
	public void setAddress(String address) { // Address
		if(address.length() <= 30 && address != null) { // Address requirements
			this.address = address; // If met, set.
		}
	}
	
	
	
	

}
