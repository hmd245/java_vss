package day8.testDay8;

import java.util.*;

public class TestIterator {

    public static void main(String[] args){
        Collection collection = new ArrayList();
        collection.add("New York");
        collection.add("Atlanta");
        collection.add("Dallas");
        collection.add("Madison");

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next().toString().toUpperCase() + " ");
            System.out.println("###");
            //System.out.print(((String) (iterator.next())).toUpperCase() + " ");
        }
        System.out.println();

        // Vi du su dung Map
        HashMap<String, Integer> customers = new HashMap<>();
        customers.put("John", 30);
        customers.put("Mike", 28);
        customers.put("Bill", 32);
        customers.put("Maria", 27);

        Set<String> keys = customers.keySet();
        for (String key: keys){
            System.out.println("Key: " + key + ": " + customers.get(key));
        }

    }
}

