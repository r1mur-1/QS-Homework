import java.util.Scanner;

public class Side1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        boolean flag = false;
        int place = num;

        int[] height = new int[num];

        for (int i = 0; i < height.length; i++) {
            height[i] = scan.nextInt();
        }
        int petyaHeight = scan.nextInt();

        for (int i = 0; i < height.length; i++) {
            if (petyaHeight > height[i]) {
                place = 1;
                System.out.println(place + 1);
                return;
            }
        }
        System.out.println(place);
    }
}
