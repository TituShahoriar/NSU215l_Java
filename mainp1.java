import java.util.Scanner;

public class mainp1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
                System.out.println("Enter number");
                int n = sc.nextInt();
                //int n=5;
        for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    System.out.print("* ");
                    //System.out.println("*");
                }
            System.out.println();
        }
    }
}
