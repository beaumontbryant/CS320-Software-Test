public class Task {
	private static int idCounter = 1;
	private final String taskID;
	private String taskName;
	private String taskDescription;
	
	public Task(String taskName, String taskDescription) {
		if (taskName == null || taskName.length() > 20) {
			throw new IllegalArgumentException("Error: Invalid input name");
		}
		if (taskDescription == null || taskDescription.length() > 50) {
			throw new IllegalArgumentException("Error: Invalid input description");
		}
		
		this.taskName = taskName;
		this.taskDescription = taskDescription;
		
		this.taskID = String.format("%09d", idCounter); //9 digit format
		idCounter++; //increment counter
	
	
	}
	
	public String getTaskID() {
		return taskID;
	}
	
	public String getTaskName() {
		return taskName;
	}
	
	public String getTaskDescription() {
		return taskDescription;
	}
	
	public void setTaskName(String taskName) {
		if (taskName == null || taskName.length() > 20) {
			throw new IllegalArgumentException("Error: Invalid input name");
		}
		
		this.taskName = taskName;
	}
	
	public void setTaskDescription(String taskDescription) {
		if (taskDescription == null || taskDescription.length() > 50) {
			throw new IllegalArgumentException("Error: Invalid input description");
		}
		
		this.taskDescription = taskDescription;
	}

	
	
	
}