import java.util.Scanner;

public class Side1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int[][] array = new int [3][4];

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = (int) (Math.random() * 100);
                }
            }

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println("\n");
            }
        }
    }
