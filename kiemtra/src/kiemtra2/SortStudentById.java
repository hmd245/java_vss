package kiemtra2;

import java.util.Comparator;

public class SortStudentById implements Comparator<StudentModel>{
    @Override
    public int compare(StudentModel o1, StudentModel o2) {
        return o1.getFormatID().compareTo(o2.getFormatID());
    }
}