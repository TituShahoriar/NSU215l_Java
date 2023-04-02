public class lab3a
{
    public static void main(String[] args) {
        int n=5;
        for (int i=n; i>=1; i--) {
            for (int p=1; p<=(i * 2) -1; p++) {
                System.out.print("*");
            }
            System.out.println();
            for (int j=n; j>=i; j--){
                System.out.print(" ");
            }

        }
    }
}