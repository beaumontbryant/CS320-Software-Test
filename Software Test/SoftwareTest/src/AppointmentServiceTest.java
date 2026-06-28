import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;

import org.junit.jupiter.api.Test;

public class AppointmentServiceTest {
	
	private Date futureDate = new Date(System.currentTimeMillis() + 86400000);

	@Test
	void testAppointmentServiceClass() {
		AppointmentService service = new AppointmentService();
		service.addAppointment(futureDate, "Appointment description.");
	
		
		assertTrue(service.getAppointments().get(0).getAppointmentDate().equals(futureDate));
		assertTrue(service.getAppointments().get(0).getAppointmentDescription().equals("Appointment description."));
		
	}

	@Test
	void testUniqueIDs() {
		AppointmentService service = new AppointmentService();
		service.addAppointment(futureDate, "Appointment one description.");
		service.addAppointment(futureDate, "Appointment two description.");

	    assertNotEquals(service.getAppointments().get(0).getAppointmentID(), service.getAppointments().get(1).getAppointmentID());
	}
	
	@Test
	void testDelete() {
		AppointmentService service = new AppointmentService();
		service.addAppointment(futureDate, "Appointment one description.");

		assertEquals(1, service.getAppointments().size());
		
		service.deleteAppointment(service.getAppointments().get(0).getAppointmentID());
		
		assertEquals(0, service.getAppointments().size());

	}
	
	
	
}
