package exam2v3;

import exam2v3.controller.StudentController;
import exam2v3.model.ClassRoom;
import exam2v3.model.Student;
import exam2v3.view.ViewStudent;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ViewStudent view = new ViewStudent();

        StudentController studentController = new StudentController(view);
        //StudentController studentController = new StudentController();

        studentController.studentList.add(new Student("duchm3", "3/4/2000", new ClassRoom("1A", "Nguyen Thi Huyen")));
        studentController.studentList.add(new Student("duchm4", "4/4/2000", new ClassRoom("1B", "Nguyen Thi Thom")));
        studentController.studentList.add(new Student("duchm5", "5/4/2000", new ClassRoom("1B", "Nguyen Thi Lan")));

        StudentController control = new StudentController(view);
        //StudentController control = new StudentController();
        control.enterStudent();
    }
}
