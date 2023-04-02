import java.util.*;
public class lab2task1 {
    static Scanner console = new Scanner(System.in);
    public static void main (String[] args)
    {
        String name;
        System.out.print("name ");
        name = console.nextLine();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <=n;i++) {
            System.out.println(name);
        }
    }
}