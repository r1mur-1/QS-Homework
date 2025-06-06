import java.util.Scanner;

public class Side4 {
    // Задача №67. Есть ли два элемента с одинаковыми знаками
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = new int[scan.nextInt()];

        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        int num = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i]) {

            }
        }
    }
}