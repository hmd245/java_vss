package thuchanh8.bai1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {

        // Tạo HashMap trong main để lưu danh sách sinh viên
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);
        hashMap.put("Cook", 28);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");

        // Tạo TreeMap trong main để lưu key theo thứ tự tăng dần
        Map<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(8,3);
        treeMap.put(9,3);
        treeMap.put(7,3);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        // Tạo LinkedHashMap trong main lưu danh sách sinh viên và hiển thị dữ liệu
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\n" + linkedHashMap);
        System.out.println("The age for " + "Lewis is " + linkedHashMap.get("Lewis"));
        System.out.println("The age for " + "Smith is " + linkedHashMap.get("Smith"));
    }
}
