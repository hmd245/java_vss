package test_compare;

import java.util.Comparator;

public class IdComparator implements Comparator<Student> {
    @Override
    public int compare(Student st1, Student st2) {
        if (st1.getId() >  st2.getId()) {
            return 1;
        } else if (st1.getId() == st2.getId()) {
            return 0;
        }
        else {
            return -1;
        }
    }
}
