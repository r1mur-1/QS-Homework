import java.util.Scanner;

public class Side1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        int result = power(a, b);
        System.out.println(result);
    }

    public static int power(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result = a * a;
        }
        return result;
    }
}