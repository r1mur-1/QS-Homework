public class Main {
    public static void main(String[] args) {
        double a = (int) (Math.random() * 100);
        double b = (int) (Math.random() * 100);

        Rectangle rec = new Rectangle(a, b);
        double p = rec.rectangleP(a, b);
        double s = rec.rectangleS(a, b);

        System.out.println("Периметр прямоугольника: " + p);
        System.out.println("==============================");
        System.out.println("Площадь прямоугольника: " + s);


    }
}










// 1. Создать класс прямоугольник.
//Поля класса: стороны А и Б.
//Методы класса: подсчет площади и подсчет периметра.