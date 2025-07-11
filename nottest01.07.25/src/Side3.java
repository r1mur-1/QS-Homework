import java.util.Scanner;

public class Side3 {
    // Задача 1. Принадлежность отрезку
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();

        String string = a > 10 && a < 100 ? "Yes" : "No";

        System.out.println(string);
    }
}
