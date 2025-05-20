import java.util.Scanner;

public class Side1 {
//Задача №2938. Дележ яблок - 1

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int apl, sch, total;

        sch = sc.nextInt();
        apl = sc.nextInt();

        total = apl / sch;

        System.out.println(total);
    }
}