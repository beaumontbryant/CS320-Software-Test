import java.util.ArrayList;
import java.util.Date;

public class AppointmentService {

	private ArrayList<Appointment> appointments;
	
	public AppointmentService() {
        appointments = new ArrayList<>();
    }

    public void addAppointment(Date appointmentDate, String appointmentDescription) {
    	Appointment appointment = new Appointment(appointmentDate, appointmentDescription);
    	appointments.add(appointment);
    }
    
    
    public void deleteAppointment(String appointmentID) {
        for (int i = 0; i < appointments.size(); i++) {
            if (appointmentID.equals(appointments.get(i).getAppointmentID())) {
                appointments.remove(i);
                return;
            }
        }
        
    }
    
    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }
    
    
}
