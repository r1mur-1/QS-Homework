import java.util.Scanner;

public class Main {
// Задача №292. Максимум из двух чисел

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, b, c;

        a = in.nextInt();
        b = in.nextInt();

        c = Math.max(a, b);

        System.out.println(c);



    }
}
