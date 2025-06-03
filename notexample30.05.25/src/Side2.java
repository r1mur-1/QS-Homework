import java.util.Scanner;

public class Side2 {
// Задача №334. Остаток
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();

        for (; a < b; a++) {
            if (a % d == c) {
                System.out.print(a + " ");
            }

        }
    }
}
