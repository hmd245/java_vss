package kiemtra2v1.model;

import java.util.Date;

public class Student {
    // property
    private static int ID = 0;
    private String name;
    private String maHs;
    private Date birthDay;
    private float grade = 0;

    // constructor


    public Student() {
        ID++;
        if (ID < 10) {
            this.maHs = "HS00" + ID;
        } else if (ID >= 10) {
            this.maHs = "HS0" + ID;
        } else if (ID >= 100) {
            this.maHs = "HS" + ID;
        }
    }

    public Student(String name, String birthDay) {
        this.name = name;
        this.birthDay = new Date(birthDay);
        ID++;
        if (ID < 10) {
            this.maHs = "HS00" + ID;
        } else if (ID >= 10) {
            this.maHs = "HS0" + ID;
        } else if (ID >= 100) {
            this.maHs = "HS" + ID;
        }
    }

    public Student(String name, String maHs, Date birthDay) {
        this.name = name;
        this.maHs = maHs;
        this.birthDay = birthDay;
    }

    // Getter, setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaHs() {
        return maHs;
    }

    public void setMaHs(String maHs) {
        this.maHs = maHs;
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
                ", maHs='" + maHs + '\'' +
                ", birthDay=" + birthDay +
                '}';
    }
}
