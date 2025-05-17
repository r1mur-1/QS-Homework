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

        point = (path - Math.abs(speed * time));

        if(109>point)
            if(Math.abs(point)>0)
                System.out.println(Math.abs(point));

                else
                System.out.println("Error");

    }
}
