import java.util.Scanner;
public class mainp3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        //int n=5;
        for(int i=1; i<=n; i++){
            for(int j=i; j<=n; j++){
                System.out.print("* ");
                //System.out.println("*");
            }
            System.out.println();
        }
    }
}