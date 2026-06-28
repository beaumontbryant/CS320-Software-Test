import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class TaskServiceTest {
	
	@Test
	void testTaskServiceClass() {
		TaskService service = new TaskService();
		service.addTask("Task 1", "I am the description of task 1.");
	
		
		assertTrue(service.getTasks().get(0).getTaskName().equals("Task 1"));
		assertTrue(service.getTasks().get(0).getTaskDescription().equals("I am the description of task 1."));
		
	}

	@Test
	void testUniqueIDs() {
		TaskService service = new TaskService();
		service.addTask("Task 1", "I am the description of task 1.");
		service.addTask("Task 2", "I am the description of task 2.");

	    assertNotEquals(service.getTasks().get(0).getTaskID(), service.getTasks().get(1).getTaskID());
	}
	
	@Test
	void testDelete() {
		TaskService service = new TaskService();
		service.addTask("Task 1", "I am the description of task 1.");

		assertEquals(1, service.getTasks().size());
		
		service.deleteTask(service.getTasks().get(0).getTaskID());
		
		assertEquals(0, service.getTasks().size());

	}
	
	@Test
	void testUpdate() {
		TaskService service = new TaskService();
		service.addTask("Task 1", "I am the description of task 1.");

		assertTrue(service.getTasks().get(0).getTaskName().equals("Task 1"));
		assertTrue(service.getTasks().get(0).getTaskDescription().equals("I am the description of task 1."));
		
		service.updateTaskName(service.getTasks().get(0).getTaskID(), "Task 2");
		service.updateTaskDescription(service.getTasks().get(0).getTaskID(), "I am the NEW description of task 2.");
		
		assertTrue(service.getTasks().get(0).getTaskName().equals("Task 2"));
		assertTrue(service.getTasks().get(0).getTaskDescription().equals("I am the NEW description of task 2."));

	}
	
}
