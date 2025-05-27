import java.util.Scanner;

public class Side7 {
    // Прошлая домашняя работа. Задача №292. Максимум из двух чисел
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, max;

        a = sc.nextInt();
        b = sc.nextInt();

        max = (a > b) ? a : b;

        System.out.println(max);
        }
     }



