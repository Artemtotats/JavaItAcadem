package homework.figures;

public class TestFigures {
    public static void main(String[] args) {
        Figures circle = new Circle(6);
        Figures rectangle = new Rectangle(12, 23);
        Figures triangle = new Triangle(12, 9, 8);

        System.out.println(circle);
        System.out.println(triangle);
        System.out.println(rectangle);


    }
}
