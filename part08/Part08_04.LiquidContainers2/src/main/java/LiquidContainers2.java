
import java.util.Scanner;


public class LiquidContainers2 {

    static Container container1 = new Container();
    static Container container2 = new Container();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        while (true) {

            System.out.print("First: " + container1 + "\n");
            System.out.print("Second: " + container2 + "\n");

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                container1.add(amount);
            } else if (command.equals("move")) {
                if (container1.contains() < amount) {
                    container2.add(container1.contains());
                    container1.remove(amount);
                } else {
                    container1.remove(amount);
                    container2.add(amount);
                }
            } else if (command.equals("remove")) {
                container2.remove(amount);
            }

        }

    }

}
