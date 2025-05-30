import java.util.Scanner;

public class Side8 {
    // Прошлая домашняя работа. Задача №253. Високосный год
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a;

        a = sc.nextInt();

        String string = a % 4 == 0 && a % 400 == 0 || a % 100 != 0 ? "YES" : "NO";

        System.out.println(string);
    }
}