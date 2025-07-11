import java.util.Scanner;

public class Side2 {
// Задача №68. Количество элементов больших обоих соседей
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int[] array = new int[num];

        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        int count = 0;

        for (int i = num - (num - 1); i < num - 1; i++) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
