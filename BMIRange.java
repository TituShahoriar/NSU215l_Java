import java.util.Scanner;

public class BMIRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your BMI: ");
        double bmi = scanner.nextDouble();

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Healthy");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("Overweight");
        } else if (bmi >= 30 && bmi <= 39.9) {
            System.out.println("Obese");
        }

        String category = (bmi < 18.5) ? "Underweight" :
                (bmi >= 18.5 && bmi <= 24.9) ? "Healthy" :
                        (bmi >= 25 && bmi <= 29.9) ? "Overweight" :
                                (bmi >= 30 && bmi <= 39.9) ? "Obese" :
                                        "";
        System.out.println(category);
    }
}
