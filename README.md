
# To-Do List Application

This is a simple To-Do List application built using Java. It allows users to manage tasks by adding, removing, completing, and displaying them. The application runs on the console, providing an interactive menu to perform various actions.

---

## Features

- **Add Tasks**: Allows users to add new tasks to the to-do list.
- **Remove Tasks**: Allows users to remove tasks from the list.
- **Complete Tasks**: Allows users to mark tasks as completed and move them to a separate completed tasks list.
- **Display Tasks**: Shows the current to-do list and completed tasks.
- **Interactive Menu**: A console-based menu to choose different operations.

---

## Technologies Used

- **Java**: The application is written in Java.

---

## How to Run

1. **Clone the repository** to your local machine.
   ```bash
   git clone https://github.com/yourusername/todo-list.git
   ```

2. **Navigate to the project folder**.
   ```bash
   cd todo-list
   ```

3. **Compile and run the program**.
   ```bash
   javac Main.java
   java Main
   ```

---

## Usage

Upon running the program, you will be presented with an interactive menu to choose one of the following actions:

1. **Add Task**: Enter the task description you want to add to the list.
2. **Remove Task**: Select from the displayed list of tasks and remove the one you want to delete.
3. **Complete Task**: Mark a task as completed, moving it from the to-do list to the completed tasks list.
4. **Print All Tasks**: View the list of current to-do tasks and completed tasks.
5. **Exit**: Quit the program.

---

## Example

Here’s what the program might look like in the terminal:

```bash
To-Do list menu:
1. Add Task
2. Remove Task
3. Complete a task
4. Print All Tasks
5. Exit
What do you want to do: 1
Enter the task you want to add:
Buy groceries
Your task has been added

To-Do list menu:
1. Add Task
2. Remove Task
3. Complete a task
4. Print All Tasks
5. Exit
What do you want to do: 4
To Do Tasks:
1. Buy groceries
Completed Tasks:
No completed tasks yet.
```

---

## Code Structure

- **Main.java**: This file contains the main program logic, where the user interacts with the console and makes choices.
- **ToDoList.java**: This file defines the `ToDoList` class with methods to manage tasks (adding, removing, completing, displaying tasks).
- **Task.java**: This file defines the `Task` class, representing each individual task with a description and a completed status.

---

## Future Improvements

- Implement a persistent storage option to save tasks between sessions (e.g., using a file or a database).
- Add task due dates and priority levels.
- Implement user authentication to track tasks for multiple users.

---

## License

This project is open-source and available under the MIT License.
