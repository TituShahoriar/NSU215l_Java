import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        switch (number % 2) {
            case 0:
                System.out.println("Even");
                break;
            case 1:
            case -1:
                System.out.println("Odd");
                break;
        }
    }
}
