import java.util.Scanner;

public class Side {
// Задача №253. Високосный год
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b;

        a = sc.nextInt();

        if (a % 4 == 0 && a % 400 == 0 || a % 100 != 0)

                System.out.println("YES");
        else
                System.out.println("NO");
    }
}
