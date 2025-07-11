public class Rectangle {
    double a;
    double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double rectangleP(double a, double b) {
        double p = 2 * (a + b);
        return p;
    }

    public double rectangleS(double a, double b) {
        double s = a * b;
        return s;
    }
}













// 1. Создать класс прямоугольник.
//Поля класса: стороны А и Б.
//Методы класса: подсчет площади и подсчет периметра.
