

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
	void testContactServiceClass() {
		ContactService service = new ContactService();
		service.addContact("John", "Smith", "5555555555", "123 Main St.");
	
		
		assertTrue(service.getContacts().get(0).getFirstName().equals("John"));
		assertTrue(service.getContacts().get(0).getLastName().equals("Smith"));
		assertTrue(service.getContacts().get(0).getNumber().equals("5555555555"));
		assertTrue(service.getContacts().get(0).getAddress().equals("123 Main St."));
		
	}

	@Test
	void testUniqueIDs() {
		ContactService service = new ContactService();
		service.addContact("John", "Smith", "5555555555", "123 Main St.");
	    service.addContact("Jane", "Doe", "5555555556", "456 Main St.");

	    assertNotEquals(service.getContacts().get(0).getContactID(), service.getContacts().get(1).getContactID());
	}
	
	@Test
	void testDelete() {
		ContactService service = new ContactService();
		service.addContact("John", "Smith", "5555555555", "123 Main St.");

		assertEquals(1, service.getContacts().size());
		
		service.deleteContact(service.getContacts().get(0).getContactID());
		
		assertEquals(0, service.getContacts().size());

	}
	
	@Test
	void testUpdate() {
		ContactService service = new ContactService();
		service.addContact("John", "Smith", "5555555555", "123 Main St.");

		assertTrue(service.getContacts().get(0).getFirstName().equals("John"));
		assertTrue(service.getContacts().get(0).getLastName().equals("Smith"));
		assertTrue(service.getContacts().get(0).getNumber().equals("5555555555"));
		assertTrue(service.getContacts().get(0).getAddress().equals("123 Main St."));
		
		service.updateContactName(service.getContacts().get(0).getContactID(), "Jane", "Doe");
		service.updateContactNumber(service.getContacts().get(0).getContactID(), "5555555556");
		service.updateContactAddress(service.getContacts().get(0).getContactID(), "456 Main St.");
		
		assertTrue(service.getContacts().get(0).getFirstName().equals("Jane"));
		assertTrue(service.getContacts().get(0).getLastName().equals("Doe"));
		assertTrue(service.getContacts().get(0).getNumber().equals("5555555556"));
		assertTrue(service.getContacts().get(0).getAddress().equals("456 Main St."));

	}
	
	
	
	
	
	
	
	
	
	
	
	
}
