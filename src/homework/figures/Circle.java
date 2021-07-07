package homework.figures;

public class Circle extends Figures {

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return (int)r * r * Math.PI;
    }

    @Override
    public double perimeter() {
        return (int)2 * Math.PI * r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                " perimeter= " + perimeter()+" area= " +area()+
                '}';
    }
}
