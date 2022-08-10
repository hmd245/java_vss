package set_test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CreateSet {
      class Animal{

    }
    public static void main(String[] args) {

        Set<String> setA = new HashSet<>();
//        Set<String> setA = new LinkedHashSet<>();
        setA.add("1");
        setA.add("6");
        setA.add("4");
        setA.add("9");
        setA.add("5");
        setA.add("10");
        setA.add("11");
        setA.add("3");
        setA.add("a");
        setA.add("7");
        setA.add("8");
        setA.add("15");
        setA.add("12");

        System.out.println("Số phần tử của setA: " + setA.size());
        System.out.println("Các phần tử của setA: " + setA);

    }
}
