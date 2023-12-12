
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();

        while (!"end".equals(userInput)) {
            try {
                System.out.println((int) Math.pow(Integer.valueOf(userInput), 3));
            } catch(Exception e) {
                continue;
            }
            userInput = scanner.nextLine();
        };

    }
}
