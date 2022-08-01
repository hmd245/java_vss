package day8.testDay8.viettuts;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String args[]) {
        List<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add(1, "Python");
        System.out.println("Phan tu co index = 2 la: " + list.get(2));
        System.out.println(list);
        // show list
        for (String s : list) {
            System.out.println(s);
        }

        List<Integer> listInt = new ArrayList<Integer>();
        listInt.add(1);
        listInt.add(3);
        listInt.add(5);
        System.out.println("ArrayList kieu int: ");
        System.out.println(listInt);
        for (Integer lstInt: listInt) {
            System.out.print(lstInt + "    ");
        }

        // Tao mot array moi
        System.out.println("\nArray kieu int: ");
        int[] arr = {1,4,7};
        //System.out.println(arr);
        System.out.println(arr[0]);


    }
}