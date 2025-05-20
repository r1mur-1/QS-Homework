import java.util.Scanner;

public class Side2 {
//Задача №2939. Дележ яблок - 2

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sch, apl, total;

        sch = sc.nextInt();
        apl = sc.nextInt();

        total = apl % sch;

        System.out.println(total);
    }
}
