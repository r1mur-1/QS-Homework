import java.util.Scanner;

public class Side1 {
// Задача №64. Вывести четные элементы
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = new int[scan.nextInt()];

        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        for (int elem : array) {
            if (elem % 2 == 0) {
                System.out.print(elem + " ");
                }
            }
        }
    }