import java.util.Scanner;

public class Side2 {
    //Задача №293. Какое из чисел больше?

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        a = sc.nextInt();
        b = sc.nextInt();

        if (a > b) {
            System.out.println(1);

        } else {
            if (a == b) {
                System.out.println(0);
            }
            if (b > a) {
                System.out.println(2);
            }
        }
    }
}
