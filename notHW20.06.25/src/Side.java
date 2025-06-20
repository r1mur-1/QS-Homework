import java.util.Scanner;

public class Side {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] array = new int[scan.nextInt()][scan.nextInt()];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (j % 2 == 0) {
                    array[i][j] = 5;
                } else {
                    array[i][j] = 0;
                }
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
//Задача простая на двумерные массивы 2:
//Заполнить двумерный массив N x M (N и M вводятся с клавиатуры) по следующему правилу:
//        - Эл-ты под четными номерами в строке заполняются 5-ками
//- Эл-ты под нечетными номерами в строке заполняются 0-ми
//Результат вывести в консоль.