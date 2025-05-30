import java.util.Scanner;

public class Side1 {
    //Задача №2959. Знак числа

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;

        a = sc.nextInt();

        if (a < 0) {
            System.out.println("-1");
        }
        else {
            if (a == 0) {
                System.out.println("0");
            }
            if (a > 1) {
                System.out.println("1");
            }
        }
    }
}