import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Problems pr1 = new Problems(
                "Уравнение",
                "2x = 100",
                "15.07.2025"
        );
        Problems pr2 = new Problems(
                "Квадратное уравнение",
                "x² = 100",
                "15.07.2025"
        );

        Problems[] problem = new Problems[]{pr1, pr2};

        System.out.println("Введите название задачи: ");
        Scanner scan = new Scanner(System.in);
        String findName = scan.next();
        for (int i = 0; i < problem.length; i++) {
            if (problem[i].nameComparison(findName)) {
                problem[i].printInfo();
            }
        }
    }
}
// 1. Написать класс для хранения задач.
//Задача включает: Краткое название, Описание, Дату выполнения
//Методы: печать задачи на консоль, проверка содержится ли в названии задачи слово