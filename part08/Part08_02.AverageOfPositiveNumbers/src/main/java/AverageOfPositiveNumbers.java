
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        Integer sum = 0;
        Integer denominator = 0;

        while(Integer.parseInt(userInput) != 0) {
            try {
                if (Integer.parseInt(userInput) > 0) {
                    sum += Integer.parseInt(userInput);
                    denominator++;
                }
            } catch (Exception e) {
                System.out.println(e);
            }
            userInput = scanner.nextLine();
        }
        if (denominator == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            Float avrg = (float) sum / denominator;
            System.out.println((float) avrg);
        }
    }
}
