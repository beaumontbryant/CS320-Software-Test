import java.util.Date;

public class Appointment {
	private static int idCounter = 1;
	private final String appointmentID;
	private Date appointmentDate;
	private String appointmentDescription;
	
	
	public Appointment(Date appointmentDate, String appointmentDescription) {
		if (appointmentDate == null || appointmentDate.before(new Date())) {
			throw new IllegalArgumentException("Error: Invalid date");
		}
		
		if (appointmentDescription == null || appointmentDescription.length() > 50) {
			throw new IllegalArgumentException("Error: Invalid description");
		}
		
		this.appointmentDate = appointmentDate;
		this.appointmentDescription = appointmentDescription;
		
		this.appointmentID = String.format("%09d", idCounter); //9 digit format
		idCounter++; //increment counter
	
	}
	

	
	public Date getAppointmentDate() {
		return appointmentDate;
	}
	
	public String getAppointmentDescription() {
		return appointmentDescription;
	}
	
	public String getAppointmentID() {
		return appointmentID;
	}
	
	
	
	
	
}
