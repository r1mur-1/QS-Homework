import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nat, del;

        nat = sc.nextInt();
        del = 2;

        while (nat % del != 0) {
            del++;
        }
        System.out.println(del);
    }
}

