import java.util.Scanner;

    public class Main {
// Задача №355. Симметричная ли матрица?
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            boolean flag = true;

            int num = scan.nextInt();
            int[][] array = new int[num][num];

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    array[i][j] = scan.nextInt();
                }
            }
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (array[i][j] != array[j][i]) {
                        flag = false;
                    }
                }
            }
            if (flag) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }

