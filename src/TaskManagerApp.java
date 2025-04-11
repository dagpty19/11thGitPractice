import java.util.Scanner;

public class TaskManagerApp {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nTask Manager Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. Mark Task as Completed");
            System.out.println("3. List Tasks");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    taskList.addTask(description);
                    System.out.println("Task added.");
                    break;
                case "2":
                    taskList.displayTasks();
                    if (!taskList.getAllTasks().isEmpty()) {
                        System.out.print("Enter the number of the task to mark as completed: ");
                        try {
                            int taskNumber = Integer.parseInt(scanner.nextLine());
                            taskList.markTaskAsCompleted(taskNumber - 1);
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input. Please enter a number.");
                        }
                    }
                    break;
                case "3":
                    taskList.displayTasks();
                    break;
                case "4":
                    System.out.println("Exiting Task Manager. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}