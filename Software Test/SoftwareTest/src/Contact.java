public class Contact{
	private static int idCounter = 1;
	private final String contactID;
	private String firstName;
	private String lastName;
	private String number;
	private String address;
	
	
	
	public Contact(String firstName, String lastName, String number, String address) {
		if (firstName == null || firstName.length() > 10 || lastName == null || 
				lastName.length() > 10) {
			throw new IllegalArgumentException("Error: Invalid input name");
		}
		if (number == null || !number.matches("\\d{10}")) {
			throw new IllegalArgumentException("Error: Invalid input number");
		}
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Error: Invalid input address");
		}
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.number = number;
		this.address = address;
		
		this.contactID = String.format("%09d", idCounter); //9 digit format
		idCounter++; //increment counter
	
	
	}
	
	public String getContactID() {
		return contactID;
	}
	
	public void setName(String firstName, String lastName) {
		if (firstName == null || firstName.length() > 10 || lastName == null || 
				lastName.length() > 10) {
			throw new IllegalArgumentException("Error: Invalid input name");
		}
		
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void setAddress(String address) {
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Error: Invalid input address");
		}
		
		this.address = address;
	}
	
	public void setNumber(String number) {
		if (number == null || !number.matches("\\d{10}")) {
			throw new IllegalArgumentException("Error: Invalid input number");
		}
		
		this.number = number;
	}
	
	
	
	public String getFirstName() {
	    return firstName;
	}

	public String getLastName() {
	    return lastName;
	}

	public String getNumber() {
	    return number;
	}

	public String getAddress() {
	    return address;
	}
	
	
}