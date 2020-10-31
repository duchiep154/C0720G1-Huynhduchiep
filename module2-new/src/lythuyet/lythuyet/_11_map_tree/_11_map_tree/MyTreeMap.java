package _11_map_tree;

import java.util.Map;
import java.util.TreeMap;

public class MyTreeMap {
    public static void main(String[] args) {
        Map<Student, String> myMap = new TreeMap<>();
        myMap.put(new Student(2, "Tu_2"), "C07");
        myMap.put(new Student(1, "Tu_1"), "C07");
        myMap.put(new Student(4, "Tu_4"), "C07");
        myMap.put(new Student(3, "Tu_3"), "C07");

        for (Student student: myMap.keySet()){
            System.out.println(student);
        }
    }
}
