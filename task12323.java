import java.util.Scanner;

        public class task12323 {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.print("length: ");
                double side = input.nextDouble();
                if (side < 0) {
                    System.out.println("The area cannot be computed due to invalid side length.");
                } else {
                    double area = (6 * side * side) / (4 * Math.tan(Math.PI / 6));
                    System.out.printf("Area=%.2f", area);
                }
            }
        }




