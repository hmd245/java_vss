package test_sort;


// Java program to demonstrate working of Comparator
// interface and Collections.sort() to sort according
// to user defined criteria.
import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.lang.*;
import java.io.*;

// A class to represent a student.
class Student
{
    int rollno;
    String name, address;

    // Constructor
    public Student(int rollno, String name,
                   String address)
    {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Used to print student details in main()
    public String toString()
    {
        return this.rollno + " " + this.name +
                " " + this.address;
    }
}

class Sortbyroll implements Comparator<Student>
{

    // Used for sorting in ascending order of
    // roll number
    @Override
    public int compare(Student a, Student b)
    {
        //!!!!????????????
        //return a.getRollno().compareTo(b.getRollno());
        return a.rollno - b.rollno;
    }

}

// Driver class
class Main
{
    public static void main (String[] args)
    {
        Sortbyroll sortbyroll = new Sortbyroll();

        ArrayList<Student> ar = new ArrayList<Student>();
        ar.add(new Student(111, "bbbb", "london"));
        ar.add(new Student(131, "aaaa", "nyc"));
        ar.add(new Student(121, "cccc", "jaipur"));

        System.out.println(sortbyroll.compare(new Student(111, "bbbb", "london"), new Student(131, "aaaa", "nyc")));

        System.out.println("Unsorted");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));

        Collections.sort(ar, new Sortbyroll());

        System.out.println("\nSorted by rollno");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));

        System.out.println("Duyet mang dung foreach:  ");
        for (Student st : ar) {
            System.out.println(st.toString());
        }
    }
}