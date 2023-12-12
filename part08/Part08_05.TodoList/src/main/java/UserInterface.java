import java.util.Scanner;

public class UserInterface {
  private TodoList todolist;
  private Scanner scanner;

  public UserInterface(TodoList todoList, Scanner scanner) {
    this.todolist = todoList;
    this.scanner = scanner;
  }

  public void start() {
    while (true) {
      System.out.println("Command: ");
      String command = scanner.nextLine().toLowerCase();
      switch (command) {
        case "add":
          System.out.println("To add: ");
          String itemToAdd = scanner.nextLine();
          todolist.add(itemToAdd);
          break;
        case "list":
          todolist.print();
          break;
        case "remove":
          System.out.println("Which one is removed? ");
          try {
            int itemNumber = Integer.parseInt(scanner.nextLine());
            todolist.remove(itemNumber);
          } catch (NumberFormatException e) {
            System.out.println("You must provide the item number");
          }
          break;
        case "stop":
          return;
        default:
          break;
      }
    }
  }
}
