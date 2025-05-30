import java.util.Scanner;

public class Side2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int stop, num;

        num = 1;
        stop = scan.nextInt();

        while (stop > num) {
            System.out.println(num);
            num = num + num;
        }
    }
}
