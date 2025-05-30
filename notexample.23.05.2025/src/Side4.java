import java.util.Scanner;

public class Side4 {
    //Задача №254. Ладья

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();


        if (a == c || b == d) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}