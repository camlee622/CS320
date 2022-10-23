package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import contactService.Contact;
import contactService.ContactService;

class ContactServiceTest {
	
	// - Testing adding contact object - 
	@Test
	void testAddContact() {
		ContactService ContactService = new ContactService();
		
		Contact contact = new Contact("1", "John", "Lee", "12345", "USA");     // Task 1 information
		Contact contact2 = new Contact("2", "Babette", "Lee", "54321", "USA"); // Task 2 information
		
		// Tests are successful if contacts are added
		assertEquals(true, ContactService.addContact(contact)); 
		assertEquals(true, ContactService.addContact(contact2));
	}
	
	
	// - Testing removing contact object - 
	@Test
	void testRemoveContact() {
		ContactService ContactService = new ContactService();
		
		Contact contact = new Contact("1", "John", "Lee", "12345", "USA");     // Task 1 information
		Contact contact2 = new Contact("2", "Babette", "Lee", "54321", "USA"); // Task 2 information
		
		ContactService.addContact(contact);  // Adding two contacts
		ContactService.addContact(contact2); // to have remove option.
		
		// Tests are successful if contacts are removed
		assertEquals(true, ContactService.removeContact("1"));
		assertEquals(true, ContactService.removeContact("2"));
		
	}
	
	// - Testing updating contact object - 
	@Test
	void testUpdateContact() {
		ContactService ContactService = new ContactService();
				
		Contact contact = new Contact("1", "John", "Lee", "12345", "USA");     // Task 1 information
		Contact contact2 = new Contact("2", "Babette", "Lee", "54321", "USA"); // Task 2 information
		
		ContactService.addContact(contact);  // Adding two contacts
		ContactService.addContact(contact2); // to have update option.
		
		// Tests are successful if contacts are updated
		assertEquals(true, ContactService.updateContact("1", "John Jr.", "Lee", "1111", "UpdateDescription")); // Updating task 1 name and description
		assertEquals(true, ContactService.updateContact("2", "Zoey", "Lee", "2222", "UpdateDescription2")); // Updating task 1 name and description
	}

}
