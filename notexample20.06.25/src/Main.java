import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;
        for (int i = 0; i < 10; i++) {
            System.out.println(sum(scan.nextInt(), scan.nextInt()));

        }
        sayHello("Timofei");
        sayHello("Sergei");
        sayHello("Anamalya");

    }

    public static void test1(int a) {
        a = 5;
    }

    public static void test2(int[] a) {
        a[0] = 100;
    }


    public static void sayHello(String name) {
        System.out.println("Hello " + name + "!");
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }

    }

    public static void printArray1(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

            }
        }
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int[] fillRandomInt(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 100) * 1.5);
        }
        return array;
    }

}


