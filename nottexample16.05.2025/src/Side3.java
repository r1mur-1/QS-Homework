import java.util.Scanner;

public class Side3 {
//Задача №2940. МКАД
//не знаю как решить без If

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int speed, time, path, point;

        path = 109;

        speed = sc.nextInt();
        time = sc.nextInt();

        point = (path + speed * time) % path;

        System.out.println(point);
    }
}
