package homework.figures;

public class Rectangle extends Figures {
    private   double wight;
    private double height;

    public Rectangle( double wight, double height) {

        this.height = height;
        this.wight = wight;
    }

    public double area() {
        return  height * wight;
    }

    public double perimeter() {
        return (int) (height + wight) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                " perimeter= " +  perimeter() +
                ", area= " + area() +
                '}';
    }
}

