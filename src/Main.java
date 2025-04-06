import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();

        boolean running = true;

        while (running) {
            System.out.println("\nTo-Do list menu:");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Complete a task");
            System.out.println("4. Print All Tasks");
            System.out.println("5. Exit");
            System.out.println("What do you want to do:");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter the task you want to add:");
                    String newTask = scanner.nextLine();
                    toDoList.addTask(newTask);
                    System.out.println("Your task has been added");
                    break;
                case 2:
                    toDoList.displayTasks();
                    System.out.println("Choose the task you want to remove:");
                    String removeTask = scanner.nextLine();
                    toDoList.removeTask(removeTask);
                    System.out.println("Your task has been deleted");
                    break;
                case 3:
                    System.out.println("Enter the task you want to complete:");
                    String completedTask = scanner.nextLine();
                    toDoList.completedTask(completedTask);
                    System.out.println("You task have completed the task: " + completedTask);
                    break;
                case 4:
                    toDoList.displayTasks();
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
            }

        }
        scanner.close();

    }
}