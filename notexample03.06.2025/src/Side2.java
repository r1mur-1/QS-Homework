import java.util.Scanner;

public class Side2 {
// Задача №65. Количество положительных элементов
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = new int[scan.nextInt()];

        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        int num = 0;
        for (int elem : array) {
            if (elem > 0) {
                num++;
            }
        }
        System.out.print(num);
    }
}