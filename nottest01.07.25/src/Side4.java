import java.util.Scanner;

public class Side4 {
// Задача 1. Физ-ра
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] height = new int[n];

        for (int i = 0; i < height.length; i++) {
            height[i] = scan.nextInt();
        }
        int valeryaHeight = height[1];
        for (int i = 0; i < height.length; i++) {
            if (valeryaHeight > height[i]) {
                valeryaHeight = height[i];
            }
        } System.out.println(valeryaHeight);
    }
}


//Известно, что в классе n школьников (n вводится с клавиатуры). Также известен рост каждого из
//всех n учеников (вводится n целочисленных значений – рост каждого).
//На уроке по физической культуре при построении по росту, в порядке убывания, Валера стоит
//последним в строю.
//Необходимо вывести на экран рост Валеры.