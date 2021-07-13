package generic.saze;

public class Start {
    public static void main(String[] args) {
        Size size = Size.XXS;
        System.out.println(size.name() + " " + size.getDescription());
        Size size1 = Size.XS;
        System.out.println(size1.name() + " " + size1.getDescription());

    }
}
