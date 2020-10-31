package _11_map_tree;

import java.util.LinkedHashMap;
import java.util.Map;

public class MyLinkedHashMap {
    public static void main(String[] args) {
        Map<Student, String> myMap = new LinkedHashMap<>();
        myMap.put(new Student(1, "Tu_1"), "C07");
        myMap.put(new Student(2, "Tu_2"), "C07");
        myMap.put(new Student(3, "Tu_3"), "C07");
        myMap.put(new Student(4, "Tu_4"), "C07");

        for(Map.Entry<Student, String> entryStudent: myMap.entrySet()){
            System.out.println("key: "+entryStudent.getKey() + " value: "+entryStudent.getValue());
        }
    }
}
