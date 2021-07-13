package generic;


public interface Filters {

    default boolean apply(Object o) {

return true;
    }

}
