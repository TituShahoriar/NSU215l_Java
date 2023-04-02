import java.util.Scanner;
public class mainN7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        //int n=5;
        for (int i = 1,p=1; i < n; i++,p++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            //for(int j=1; j<=i; j++)
            for (int j = 1; j <=i; j++) {
                System.out.print(p+"");
            }
            for (int j = 1; j < i; j++) {
                System.out.print(p+"");
            }
            System.out.println();
        }
        for (int i = 1,p=n; i <= n; i++,p--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            //for(int j=1; j<=i; j++)
            for (int j = i; j <=n; j++) {
                System.out.print(p+"");
            }
            for (int j = i; j < n; j++) {
                System.out.print(p+"");
            }
            System.out.println();
        }
    }
}
