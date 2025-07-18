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
                System.out.println("Номер задачи: " + Problems.count);
                System.out.println("===============================");
                if (Problems.count == 1) {
                    System.out.println(pr1.getName());
                    System.out.println(pr1.getInfo());
                    System.out.println(pr1.getDate());
                }
                else {
                    System.out.println(pr2.getName());
                    System.out.println(pr2.getInfo());
                    System.out.println(pr2.getDate());
                }
            }
        }
    }
}
//👉Долгожданное ДЗ:
//
//Доработать предыдущее задание.
//1. Добавить в класс для хранения задач конструктор копирования.
//        2. Добавить возможность создавать задачи без описания (только краткое название и дата выполнения)
//3. Добавить статическое поля для подсчета созданных экземпляров задач.
//        4. В методе main продемонстрировать работу дописанного кода.
//5. ДЗ сдаем как обычно через ПР на гите
