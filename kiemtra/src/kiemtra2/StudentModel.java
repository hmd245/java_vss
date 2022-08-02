package kiemtra2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StudentModel {
    // Property
    private static int ID = 0;
    private String name;
    private String formatID;
    private Date birthDay;
    private float grade = 0;

    // Constructor
    public StudentModel() {
        ID++;
        if (ID < 10) {
            this.formatID = "HS00" + ID;
        }
        else if (ID >= 10) {
            this.formatID = "HS0" + ID;
        }
        else if (ID >= 100) {
            this.formatID = "HS" + ID;
        }
    }

    public StudentModel(String name, String birthDay) {
        this.name = name;
        this.birthDay = new Date(birthDay);
        ID++;
        this.formatID = "HS" + ID;
        if (ID < 10) {
            this.formatID = "HS00" + ID;
        }
        else if (ID >= 10) {
            this.formatID = "HS0" + ID;
        }
        else if (ID >= 100) {
            this.formatID = "HS" + ID;
        }
    }

    public StudentModel(String name, String formatID, String birthDay) {
        this.name = name;
        this.formatID = formatID;
        this.birthDay = new Date(birthDay);
    }

    // Getters, setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFormatID() {
        return formatID;
    }

    public void setFormatID(String formatID) {
        this.formatID = formatID;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", formatID='" + formatID + '\'' +
                ", birthDay='" + birthDay + '\'' +
                '}';
    }
}
