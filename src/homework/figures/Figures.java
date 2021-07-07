package homework.figures;

public   abstract class Figures {
    public abstract double area();
    public abstract double perimeter();

    @Override
    public String toString() {
        return "Figures{}";
    }
}
