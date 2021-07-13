package generic;

public class FilterInteger implements Filters {

    public boolean applay (Object o) {
        if ((Integer) 0 == 0) {
            return false;
        } else {
            return true;
        }
    }
}
