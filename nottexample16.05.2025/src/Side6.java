import java.util.Scanner;

public class Side6 {
//Задача №2943. Число десятков

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, total;

        num = sc.nextInt();

        total = ((num / 10) % 10);

        System.out.println(total);
    }
}
