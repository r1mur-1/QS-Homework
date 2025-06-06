import java.util.Scanner;

public class Side {
// Задача №341. Количество делителей
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int end = scan.nextInt();
        int num = 0;

        for (int start = 1; end >= start ; start++) {
            if (end % start == 0) {
                num++;
            }
        }
        System.out.println(num);
    }
}
