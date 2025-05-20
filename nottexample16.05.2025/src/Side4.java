import java.util.Scanner;

public class Side4 {
//Задача №2941. Последняя цифра

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, last;

        n = sc.nextInt();

        last = n % 10;

        System.out.println(last);
    }
}
