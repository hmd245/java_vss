package exam2v3.Interface;

import exam2v3.model.Student;

import java.util.List;

public interface interfaceStudent {
    public void enterStudent();
    public void getStudentInfo();
    public void editStudent();
    public void deleteStdudent();
    public List<Student> serachStudentByName();
    public void sortByNameStudent();
    public void searchStudentByBirthDay();
}
