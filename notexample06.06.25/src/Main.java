import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File ageList = new File("test.txt");
        Scanner scan = new Scanner(ageList);
        int count = 0;

        while (scan.hasNext()) {
            count++;
            scan.nextLine();
        }
        scan.close();

        scan = new Scanner(ageList);
        int[] age = new int[count];
        for (int i = 0; i < age.length; i++) {
            age[i] = scan.nextInt();
        }
        count = 0;
        for (int i = 0; i < age.length; i++) {
            if (age[i] >= 30 && age[i] <= 40) {
                count++;
            }
        }
        System.out.println(count);
    }
}