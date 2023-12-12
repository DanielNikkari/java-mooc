
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.print("First: " + first + "/100\n");
            System.out.print("Second: " + second + "/100\n");

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                if (amount < 0) {
                    continue;
                } else {
                    if (first + amount > 100) {
                        first = 100;
                    } else {
                        first += amount;
                    }
                }
            } else if (command.equals("move")) {
                if (amount < 0) {
                    continue;
                } else {
                    if (amount > first) {
                        if (second + first > 100) {
                            second = 100;
                        } else {
                            second += first;
                        }
                        first = 0;
                    } else if (second + first > 100) {
                        second = 100;
                        first -= amount;       
                    } else {
                        second += amount;
                        first -= amount;
                    }
                }
            } else if (command.equals("remove")) {
                if (amount < 0) {
                    continue;
                } else {
                if (amount > second) {
                    second = 0;
                } else {
                    second -= amount;
                }
                }
            }

        }
    }

}
