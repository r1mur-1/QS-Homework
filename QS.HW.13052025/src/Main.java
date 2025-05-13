import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short a, b;
        a = sc.nextShort();
        b = sc.nextShort();

        double c = Math.sqrt(a * a + b * b);

        System.out.println(c);


    }
}
