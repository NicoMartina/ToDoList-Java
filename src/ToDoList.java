import java.util.ArrayList;

public class ToDoList {
    private final ArrayList<Task> tasks;
    private final ArrayList<Task> completedTasks;

    public ToDoList(){
        tasks = new ArrayList<>();
        completedTasks = new ArrayList<>();
    }

    public void addTask(String description) {
        tasks.add(new Task(description));
    }

    public void removeTask(String description) {
        for (Task task : tasks) {
            if (task.getDescription().equalsIgnoreCase(description)) {
                tasks.remove(task);
                System.out.println("Task removed: " + description);
                return;
            }
        }
        System.out.println("Task not found: " + description);
    }


    public void completedTask(String description) {
        Task taskToComplete = null;
        for (Task task : tasks) {
            if (task.getDescription().equals(description)) {
                taskToComplete = task;
                break;
            }
        }
        if (taskToComplete != null) {
            taskToComplete.markCompleted();
            completedTasks.add(taskToComplete);
            tasks.remove(taskToComplete);
        }
    }

    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Your to-do list is empty.");
        } else {
            System.out.println("To Do Tasks:");
            for (Task task : tasks) {
                System.out.println(task);  // Print each task's description and its status
            }
        }

        if (completedTasks.isEmpty()) {
            System.out.println("No completed tasks yet.");
        } else {
            System.out.println("Completed Tasks:");
            for (Task task : completedTasks) {
                System.out.println(task);  // Print completed tasks
            }
        }
    }
}
