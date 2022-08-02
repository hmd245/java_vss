package kiemtra2;

import java.util.Comparator;
import java.util.Date;

public class SortStudentByAge implements Comparator<StudentModel> {
    @Override
    public int compare(StudentModel o1, StudentModel o2) {
        return o1.getBirthDay().compareTo(o2.getBirthDay());
    }
}
