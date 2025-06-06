import java.util.Scanner;

public class Side3 {
    // Задача №66. Количество элементов, больших предыдущего
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = new int[scan.nextInt()];

        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        int num = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                num++;
            }
        }
        System.out.println(num);
    }
}
