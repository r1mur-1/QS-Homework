import java.util.Scanner;

public class Main {
// Задача №292. Максимум из двух чисел

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, b;

        a = in.nextInt();
        b = in.nextInt();

       if(a > b)
           System.out.println(a);

       else
           System.out.println(b);
    }
}
