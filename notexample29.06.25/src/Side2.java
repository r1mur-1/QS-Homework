import java.util.Scanner;

public class Side2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();

        int xOry = xOr(x, y);
        System.out.println(xOry);
    }

    public static int xOr(int x, int y) {
        int alignment = 0;
        if (x == 0 && y == 1) {
            alignment = 1;
        }
        if (x == 1 && y == 0) {
            alignment = 1;
        }
        return alignment;
    }
}
