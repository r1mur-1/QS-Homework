import java.util.Scanner;

public class Side7 {
//Задача №2944. Сумма цифр

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,last,second,first,sum;

        num = sc.nextInt();

        last = num % 10;
        second = (num / 10) % 10;
        first = (num - (second * 10 + last)) / 100;

        sum = first + second + last;

        System.out.println(sum);


    }


}
