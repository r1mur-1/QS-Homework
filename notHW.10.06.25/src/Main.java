import java.util.Scanner;


public class Main {
// Задача №72. Максимум в массиве
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = new int[scan.nextInt()];

        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
