import java.util.ArrayList;

public class ContactService{
	private ArrayList<Contact> contacts;
	
	public ContactService() {
        contacts = new ArrayList<>();
    }

    public void addContact(String firstName, String lastName, String number, String address) {
    	Contact contact = new Contact(firstName, lastName, number, address);
    	contacts.add(contact);
    }
    
    
    public void deleteContact(String contactID) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contactID.equals(contacts.get(i).getContactID())) {
                contacts.remove(i);
                return;
            }
        }
        
    }
    
    
    public void updateContactName(String contactID, String firstName, String lastName) {
    	for (Contact contact : contacts) {
    		if (contactID.equals(contact.getContactID())) {
    			contact.setName(firstName, lastName);
    			return;
    		}
    		
    	}
    }
    
    
    public void updateContactNumber(String contactID, String number) {
    	for (Contact contact : contacts) {
    		if (contactID.equals(contact.getContactID())) {
    			contact.setNumber(number);
    			return;
    		}
    		
    	}
    }
    
    
    public void updateContactAddress(String contactID, String address) {
    	for (Contact contact : contacts) {
    		if (contactID.equals(contact.getContactID())) {
    			contact.setAddress(address);
    			return;
    		}
    		
    	}
    }
    
    
    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    
    
}