
import java.util.Scanner;

public class SumPositiveIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (count < 10) {
            try {
                System.out.print("Enter a positive integer: ");
                int num = scanner.nextInt();
                if (num < 0) {
                    throw new Exception("Input positive integer only");
                }
                sum += num;
                count++;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("The sum of the 10 positive integers is: " + sum);
    }
}
