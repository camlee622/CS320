package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import contactService.Contact;

class ContactTest {
	
	Contact contact = new Contact("1", "firstName", "lastName", "phoneNum", "address");
	
	@Test
	void getContactID() { // Contact ID test
		assertEquals("1", contact.getContactID()); 
	}
	
	@Test
	void getFirstName() { // First name test
		assertEquals("firstName", contact.getFirstName());
	}
	
	@Test
	void getLastName() { // Last name test
		assertEquals("lastName", contact.getLastName());
	}
	
	@Test
	void getPhoneNum() { // Phone number test
		assertEquals("phoneNum", contact.getPhoneNum());
	}
	
	@Test
	void getAddress() { // Address test
		assertEquals("address", contact.getAddress());
	}


}
