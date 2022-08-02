package kiemtra2;

import java.util.*;
import java.io.*;

public class StudentRepo {
    private static final String STUDENT_FILE_NAME =
            "D:\\fresher_vss\\java_vss\\kiemtra\\src\\kiemtra2\\student.txt";

    public void write(List<StudentModel> studentModelList){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(STUDENT_FILE_NAME);
            oos = new ObjectOutputStream(fos);
            for (StudentModel student : studentModelList){
                oos.writeObject(student.getName() + " " + student.getGrade());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeStream(fos);
            closeStream(oos);
        }
    }

    public void writeFile(List<StudentModel> studentModelList){
        try {
            FileWriter writer = new FileWriter(STUDENT_FILE_NAME, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (StudentModel studentModel : studentModelList){
                bufferedWriter.write(studentModel.getName() + " " +  studentModel.getGrade());
                bufferedWriter.write("\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void closeStream(OutputStream os) {
        if (os != null) {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
