import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

         a = a + a % 2;

        for (; a <= b; a+= 2) {
                System.out.print(a + " ");
            }
        }
    }


