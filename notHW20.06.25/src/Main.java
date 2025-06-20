import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] array = new int [scan.nextInt()][scan.nextInt()];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 100 / 2);
            }
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
                if (i % 2 == 0) {
                    for (int j = 0; j < array.length; j++) {
                        sum += array[i][j];
                    }
                }
            }
        System.out.println(sum);
        }
    }
//Заполнить двумерный массив N x M (N и M вводятся с клавиатуры) случайными значениями от 1 до 50.
//Посчитать сумму значений в ячейках у строк с четными номерами. Результат вывести в консоль
