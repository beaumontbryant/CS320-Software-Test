

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	void testContactClass() {
		Contact contact = new Contact("John", "Smith", "5555555555", "123 Main St.");
		assertTrue(contact.getFirstName().equals("John"));
		assertTrue(contact.getLastName().equals("Smith"));
		assertTrue(contact.getNumber().equals("5555555555"));
		assertTrue(contact.getAddress().equals("123 Main St."));
		
	}
	
	@Test
	void testFirstNameNull(){
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Smith", "5555555555", "123 Main St.");
		});
	}
	
	@Test
	void testFirstNameLength(){
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("JohnJohnJohn", "Smith", "5555555555", "123 Main St.");
		});
	}
	
	@Test
	void testLastNameNull(){
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("John", null, "5555555555", "123 Main St.");
		});
	}
	
	@Test
	void testLastNameLength(){
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("John", "SmithSmithSmith", "5555555555", "123 Main St.");
		});
	}
	
	@Test
	void testNumberNull(){
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("John", "Smith", null, "123 Main St.");
		});
	}
	
	@Test
	void testNumberLength(){
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("John", "Smith", "55555", "123 Main St.");
		});
	}
	
	@Test
	void testAddressNull(){
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("John", "Smith", "5555555555", null);
		});
	}
	
	@Test
	void testAddressLength(){
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("John", "Smith", "5555555555", "123 Main St. 123 Main St. 123 Main St. 123 Main St. 123 Main St. 123 Main St.");
		});
	}
	
	@Test
	void testContactIDNull() {
	    Contact contact = new Contact("John", "Smith", "5555555555", "123 Main St.");

	    assertNotNull(contact.getContactID());
	}
	
	@Test
	void testContactIDLength() {
	    Contact contact = new Contact("John", "Smith", "5555555555", "123 Main St.");

	    assertTrue(contact.getContactID().length() <= 10);
	}
	
	@Test
	void testContactIDUnique() {
	    Contact contact1 = new Contact("John", "Smith", "5555555555", "123 Main St.");
	    Contact contact2 = new Contact("Jane", "Smith", "5555555556", "456 Main St.");

	    assertNotEquals(contact1.getContactID(), contact2.getContactID());
	}

}
