import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class TaskTest {
	
	@Test
	void testTaskClass() {
		Task task = new Task("Task 1", "I am the description of task 1.");
		assertTrue(task.getTaskName().equals("Task 1"));
		assertTrue(task.getTaskDescription().equals("I am the description of task 1."));
		
	}

	@Test
	void testTaskNameNull(){
		assertThrows(IllegalArgumentException.class, () -> {
			new Task(null, "I am the description of task 1.");
		});
	}
	
	@Test
	void testTaskNameLength(){
		assertThrows(IllegalArgumentException.class, () -> {
			new Task("Really long task name that is far too long.", "I am the description of task 1.");
		});
	}
	
	@Test
	void testTaskDescriptionNull(){
		assertThrows(IllegalArgumentException.class, () -> {
			new Task("Task 1", null);
		});
	}
	
	@Test
	void testTaskDescriptionLength(){
		assertThrows(IllegalArgumentException.class, () -> {
			new Task("Task 1", "I am the description of task 1. But, I am a really long task description that is far too long. I am the description of task 1. But, I am a really long task description that is far too long. I am the description of task 1. But, I am a really long task description that is far too long.");
		});
	}
	
	@Test
	void testTaskIDNull() {
	    Task task = new Task("Task 1", "I am the description of task 1.");

	    assertNotNull(task.getTaskID());
	}
	
	@Test
	void testTaskIDLength() {
	    Task task = new Task("Task 1", "I am the description of task 1.");

	    assertTrue(task.getTaskID().length() <= 10);
	}
	
	@Test
	void testTaskIDUnique() {
	    Task task1 = new Task("Task 1", "I am the description of task 1.");
	    Task task2 = new Task("Task 2", "I am the description of task 2.");

	    assertNotEquals(task1.getTaskID(), task2.getTaskID());
	}
	
	
	
}
