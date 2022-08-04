package test_compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableExample {
    public static void main(String[] args) {
        // create list students
        List<Student> listStudents = new ArrayList<Student>();
        // add students to list
        listStudents.add(new Student(2, "Ainh", 30, "Hanoi"));
        listStudents.add(new Student(4, "Coa", 19, "Bacgiang"));
        listStudents.add(new Student(1, "Dhu", 20, "A"));
        listStudents.add(new Student(2, "Buy", 12, "C"));

        // Truoc khi sap xep
        System.out.println("Truoc khi sap xep:");
        //System.out.println(listStudents);
        for (Student student : listStudents) {
            System.out.println(student.toString());
        }

        // Sau khi sap xep
        System.out.println("Sau khi sap xep:");
        // sort list student
        Collections.sort(listStudents);
        // show list students
        for (Student student : listStudents) {
            System.out.println(student.toString());
        }

        IdComparator idCompa = new IdComparator();
        Collections.sort(listStudents,idCompa);
        System.out.println("Sap xep theo id: ");
        for (Student st : listStudents) {
            System.out.println(st.toString());
        }

    }
}