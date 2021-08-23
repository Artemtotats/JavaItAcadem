package task17;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Start {
    public static void main(String[] args) {
        Annotation annotation = new Annotation();
        Class clas = annotation.getClass();
        Method[] methods = clas.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
            Annotation.AcademyInfo annotations = method.getAnnotation(Annotation.AcademyInfo.class);
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println(parameter.getName());
                System.out.println(parameter.getType().getAnnotations());


            }


        }
    }
}