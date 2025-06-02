import java.util.Scanner;

public class Side1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, stop, mnoj;

        stop = scan.nextInt();
        mnoj = 0;
        num = 2 * (2 * mnoj);

        while (stop > num) {
            num = 2 * (2 * mnoj);
            mnoj = mnoj + 2;
        }
        if (stop == 1) {
            System.out.println("YES");
        } else {
            String string = stop == num ? "YES" : "NO";
            System.out.println(string);
        }
    }
}
