import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class ToDoList {
private HashMap<String, Task> tasks = new HashMap<String, Task>();

	public void addTask (Task task) {
		tasks.put(task.getDescription(), task);
		//Add code here
	}
	public boolean completeTask(Task task) {
		return task.isComplete();
		// Add code here
	}
	public boolean getStatus(String description) {
		//Add code here
		boolean status = tasks.containsKey(description);
		return status;
		//return false;
	}
	public Task getTask(String description) {
		// Add code here
		return null;
	}
	public Task removeTask(String description) {
		// Add code here
		return tasks.remove(description);
		//return null;
	}
	
	public boolean editTask(String description) {
		//Add code to edit task here
		Task oldValue = null;
		Task newValue = null;
		return tasks.replace(description, oldValue, newValue);
		//return null;
	}
	public Collection<Task> getAllTasks() {
		return tasks.values();

	}
	public Collection<Task> getCompletedTasks() {
		// Add code here
		return tasks.values();
		//return null;
	}
}
