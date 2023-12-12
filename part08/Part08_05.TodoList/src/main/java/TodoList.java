import java.util.ArrayList;
import java.util.List;

public class TodoList {

  private List<String> tasks;

  public TodoList() {
    tasks = new ArrayList<>();
  }

  public void add(String task) {
    tasks.add(task);
  }

  public void print() {
    for (int i = 0; i < tasks.size(); i++) {
      System.out.println((i + 1) + ": " + tasks.get(i));
    }
  }

  public void remove(int number) {
    if (number > 0 && number <= tasks.size()) {
      tasks.remove(number - 1);
    } else {
      System.out.println("Invalid task number");
    }
  }
}