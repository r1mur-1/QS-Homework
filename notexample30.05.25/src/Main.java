import java.util.Scanner;

public class Main {
// Задача №340. Делители числа
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int end = scan.nextInt();

        for (int start = 1; end >= start ; start++) {
            if (end % start == 0)
                System.out.print(start + " ");
            }
        }
    }


