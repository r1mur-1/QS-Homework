import java.util.Scanner;

public class Side6 {
    //Задача №256. Ферзь
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horiz1, vert1, horiz2, vert2, pos1, pos2;

        horiz1 = sc.nextInt();
        vert1 = sc.nextInt();
        horiz2 = sc.nextInt();
        vert2 = sc.nextInt();

        pos1 = Math.abs(horiz1 - horiz2);
        pos2 = Math.abs(vert1 - vert2);

        if (horiz1 == horiz2 | vert1 == vert2) {
            System.out.println("YES");
        } else
            if (pos1 == pos2) {
            System.out.println("YES");
            }
            else {
            System.out.println("NO");
        }
    }
}
