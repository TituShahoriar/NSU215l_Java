import java.util.Scanner;
public class mainN3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        /*
        for(int i=1, p=1; i<=n; i++,p++ ){

            for(int j=i; j<=n; j++)
            {
                System.out.print(p+ "");
            }
         */
            for(int i=1, p=1; i<=n; i++,p++ ){
                for(int j=1; j<=i; j++)
                {
                    System.out.print(p+ "");
                }
            System.out.println();
        }
    }
}