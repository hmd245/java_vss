package exam2v3.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    // property
    public static int id = 0;
    private int idStudent;
    private String studentName;
    private int day;
    private int month;
    private int year;
    private Date birthDay;
    private ClassRoom classRoom;

    // constructor
    public Student() {
        id++;
        idStudent = id;
    }

    public Student(String studentName, String birthDay, ClassRoom classRoom) {
        id++;
        idStudent = id;
        this.studentName = studentName;
        this.birthDay = new Date(birthDay);
        this.classRoom = classRoom;
    }

    // getters, setters
    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // !!!!!!!!!!!!! String to Date
    public void setBirthDay(String datebirthDay) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            date = formatter.parse(datebirthDay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.birthDay = date;
    }

    // !!!!!!!!!!! Date to String
    public String getBirthDay() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return formatter.format(birthDay);
    }

    public ClassRoom getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idStudent=" + idStudent +
                ", studentName='" + studentName + '\'' +
                ", birthDay=" + getBirthDay() +
                ", classRoom=" + classRoom +
                '}';
    }
}
