import java.util.Scanner;

public class ArrayIndex {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10000);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an index: ");
        int index = scanner.nextInt();

        try {
            System.out.println("The element at index " + index + " is: " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of array size");
        }
    }
}