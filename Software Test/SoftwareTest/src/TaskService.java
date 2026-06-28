import java.util.ArrayList;

public class TaskService {
	private ArrayList<Task> tasks;
	
	public TaskService() {
        tasks = new ArrayList<>();
    }
	
	public void addTask(String taskName, String taskDescription) {
    	Task task = new Task(taskName, taskDescription);
    	tasks.add(task);
    }
	
	public void deleteTask(String taskID) {
        for (int i = 0; i < tasks.size(); i++) {
            if (taskID.equals(tasks.get(i).getTaskID())) {
                tasks.remove(i);
                return;
            }
        }
        
    }
    
    
    public void updateTaskName(String taskID, String taskName) {
    	for (Task task : tasks) {
    		if (taskID.equals(task.getTaskID())) {
    			task.setTaskName(taskName);
    			return;
    		}
    		
    	}
    }
    
    public void updateTaskDescription(String taskID, String taskDescription) {
    	for (Task task : tasks) {
    		if (taskID.equals(task.getTaskID())) {
    			task.setTaskDescription(taskDescription);
    			return;
    		}
    		
    	}
    }
    
    public ArrayList<Task> getTasks() {
        return tasks;
    }

}
