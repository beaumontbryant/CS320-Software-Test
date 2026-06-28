import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;

import org.junit.jupiter.api.Test;

public class AppointmentTest {
	private Date futureDate = new Date(System.currentTimeMillis() + 86400000);
	private Date pastDate = new Date(System.currentTimeMillis() - 86400000);
	
		
	@Test
	void testAppointmentClass() {
		Appointment appointment = new Appointment(futureDate, "Appointment description.");
		assertTrue(appointment.getAppointmentDate().equals(futureDate));
		assertTrue(appointment.getAppointmentDescription().equals("Appointment description."));
			
		}
		
	
	@Test
	void testAppointmentDateNull(){
		assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(null, "Appointment description.");
		});
	}
	
	@Test
	void testAppointmentDatePast(){
		assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(pastDate, "Appointment description.");
		});
	}
	
	@Test
	void testAppointmentDescriptionNull(){
		assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(futureDate, null);
		});
	}
	
	@Test
	void testAppointmentDescriptionLength(){
		assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(futureDate, "Way too long appointment description. Way too long appointment description. Way too long appointment description.");
		});
	}
	
	@Test
	void testAppointmentIDNull() {
	    Appointment appointment = new Appointment(futureDate, "Appointment description.");

	    assertNotNull(appointment.getAppointmentID());
	}
	
	@Test
	void testAppointmentIDLength() {
		Appointment appointment = new Appointment(futureDate, "Appointment description.");

	    assertTrue(appointment.getAppointmentID().length() <= 10);
	}
	
	@Test
	void testAppointmentIDUnique() {
		Appointment appointment1 = new Appointment(futureDate, "Appointment description for appointment 2.");
		Appointment appointment2 = new Appointment(futureDate, "Appointment description for appointment 1.");

	    assertNotEquals(appointment1.getAppointmentID(), appointment2.getAppointmentID());
	}
	
		

}
