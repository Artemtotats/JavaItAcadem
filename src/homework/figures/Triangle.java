package homework.figures;

import homework.figures.Figures;

public class Triangle extends Figures {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double halfPerimeter = perimeter() / 2;
        return (int)( Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c)));

    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                " perimeter= " + perimeter() +
                ",  area= " + area() +
                +'}';
    }
}
