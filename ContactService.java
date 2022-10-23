package contactService;

import java.util.ArrayList;

public class ContactService {
	
	// Contacts list that can have objects updated
	private ArrayList<Contact> Contacts;
	
	// Contacts constructor
	public ContactService() {
		Contacts = new ArrayList<>();
	}
	
	// Adding a contact object
	public boolean addContact(Contact newContact) {
		
		boolean notAvailable = false; // Default contact value
		
		for(Contact contact : Contacts) {
			if(contact.getContactID().equalsIgnoreCase(newContact.getContactID())) { // If contact already exists
				notAvailable = true; // Contact not available 
				break;
			} 
		}
		
		if(!notAvailable) {
			Contacts.add(newContact); // Add to list
			return true;
		}
		
		else {
			return false;
		}
	}
	
	// Removing a contact object
	public boolean removeContact(String contactID) {
		
		boolean removed = false; // Default contact value
		
		for(Contact contact : Contacts) {
			if(contact.getContactID().equalsIgnoreCase(contactID)) { // If contact matches an existing contact
				
				Contacts.remove(contact); // Remove contact
				removed = true; // Contact has been deleted
				break;
			}
		}
		return removed;
	}
	
	// Updating a contact object
	public boolean updateContact(String contactID, String firstName, String lastName, String phoneNum, String address) {
		
		boolean updated = false;
		
		for(Contact contact : Contacts) {
			if(contact.getContactID().equalsIgnoreCase(contactID)) {
				
				if(firstName != (""))
					contact.setFirstName(firstName);
				
				if (lastName != ("")) // If last name is not empty
					contact.setLastName(lastName); // Update last name
				
				if (phoneNum != ("")) // If phone number is not empty
					contact.setPhoneNum(phoneNum); // Update phone number
				
				if (address != ("")) // If address is not empty
					contact.setAddress(address); // Update address
				
				updated = true;
			}		
		}
		return updated;
	}
}
