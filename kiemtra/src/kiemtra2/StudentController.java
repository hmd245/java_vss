package kiemtra2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;
import java.util.Scanner;

public class StudentController {
    public static Scanner scanner = new Scanner(System.in);
    //private List<StudentModel> studentModelList = new ArrayList<>();
    //public List<StudentModel> studentModelList = new ArrayList<>();
    public static List<StudentModel> studentModelList = new ArrayList<>();

    //???
    private StudentRepo studentRepo;
    List<String> sameName = new ArrayList<>();

    // constructor
    public StudentController() {
        studentRepo = new StudentRepo();
    }

    // ???
    public void findAll(){
        for (StudentModel i : studentModelList){
            System.out.println(i.toString());
        }
    }

    // Ham them hoc sinh
    public void addStudent(){
        String name = inputName();
        String birthDay = inputBirthDay();
        StudentModel student = new StudentModel(name,birthDay);
        studentModelList.add(student);
    }

    // ham convert String > Date
    public Date stringToDate(String birthDay) {
        Date birthday = new Date(birthDay);
        return birthday;
    }

    // ham edit hoc sinh theo maHS
    public void edit(String formatID){
        for (int i = 0; i < studentModelList.size();i++){
            if (studentModelList.get(i).getFormatID().equalsIgnoreCase(formatID)){
                studentModelList.get(i).setName(inputName());
                String birthDay = inputBirthDay();
                Date dayOfBirth = stringToDate(birthDay);
                studentModelList.get(i).setBirthDay(dayOfBirth);
                break;
            }
        }
    }

    // ham delete hoc sinh theo maHS
    public void delete (String formatID){
        StudentModel studentDelete = null;
        for (int i = 0; i < studentModelList.size(); i++){
            if(studentModelList.get(i).getFormatID().equalsIgnoreCase(formatID)){
                studentDelete = studentModelList.get(i);
                break;
            }
        }
        if (studentDelete != null){
            studentModelList.remove(studentDelete);
        }else {
            System.out.println("ID not existed!");
        }
    }

    public void inputGradeList(){
        for (int i = 0; i < studentModelList.size(); i++){
            System.out.printf("Input grade of student id = %s", studentModelList.get(i).getFormatID());
            studentModelList.get(i).setGrade(inputGrade());
        }
        studentRepo.writeFile(studentModelList);
    }

    private float inputGrade(){
        System.out.println("Input grade : ");
        return Float.parseFloat((scanner.nextLine()));
    }

    // ham sap xep theo name, birthday, id
    public void sortStudentByName(){
        Collections.sort(studentModelList, new SortStudentByName());
    }

    public void sortStudentByAge(){
        Collections.sort(studentModelList, new SortStudentByAge());
    }

    public void sortStudentById() {
        Collections.sort(studentModelList, new SortStudentById());
    }

    // nhap name
    private String inputName(){
        char alphabet = 'A';
        System.out.println("Input student name: ");
        String name = scanner.nextLine();
        String formatName = "";
        if (!sameName.contains(name)){
            sameName.add(name);
            return name;
        }
        else {
            int count = 0;
            List<Integer> index = new ArrayList<>();
            for (int i = 0; i < studentModelList.size(); i++) {
                if (studentModelList.get(i).getName().equalsIgnoreCase(name)) {
                    index.add(i);
                }
            }
            for (int i = 0; i < index.size(); i++) {
                studentModelList.get(index.get(i)).setName(name + " " + (char) (alphabet + count));
                count++;
            }
            formatName = name + (char) (alphabet + count);
            return formatName;
        }
    }

    // nhap birthday
    private String inputBirthDay() {
        System.out.println("Input day of birth (as dd/mm/yyyy): ");
        String dayOfBirth = scanner.nextLine();
//        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
//        Date date = null;
//        try {
//            date = (Date) df.parse(dayOfBirth);
//        } catch (ParseException e) {
//            throw new RuntimeException(e);
//        }
//        return date;
        return dayOfBirth;
    }
}