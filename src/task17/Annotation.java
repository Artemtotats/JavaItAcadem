package task17;

public class Annotation {
    @interface AcademyInfo {
        int ear() default 1;
    }

    @AcademyInfo
    public static void MethodAnnotation(int i) {
        int w = 1;
    }

    public static void MethodAnnotation1() {

    }
}
