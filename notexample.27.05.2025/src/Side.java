import java.util.Scanner;

public class Side {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int point, num, stop;

        num = 1;
        stop = 1;
        point = scan.nextInt();

        while (point > stop) {
            System.out.println(stop);
            num++;
            stop = num + num;
        }
    }
}
