package generic;

import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
        Integer[] array = {1, 8, 0, 3, 7, 1};
        Integer[] newArray = filter(array, new Filters() {
            @Override
            public boolean apply(Object o) {
                return Filters.super.apply(o);
            }

        });
System.out.println(Arrays.toString(newArray));

    }

    private static Integer[] filter(Integer[] array, Filters filters) {
        return array;

}

}