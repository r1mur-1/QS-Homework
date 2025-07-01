import java.util.Scanner;

public class Side1 {
// Задача 1. Площадь прямоугольника
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        double b = scan.nextDouble();

        double s = a * b;
        System.out.println(s);
    }
}