import java.util.Scanner;
public class mainp7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        //int n=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
                //System.out.println("*");
            }
            for(int j=i; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}