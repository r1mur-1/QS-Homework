import java.util.Scanner;

public class Side5 {
    //Задача №255. Слон

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vert1, horiz1, vert2, horiz2, pos1, pos2;

        horiz1 = sc.nextInt();
        vert1 = sc.nextInt();
        horiz2 = sc.nextInt();
        vert2 = sc.nextInt();

        pos1 = Math.abs(horiz1 - horiz2);
        pos2 = Math.abs(vert1 - vert2);

        if (pos1 == pos2) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
