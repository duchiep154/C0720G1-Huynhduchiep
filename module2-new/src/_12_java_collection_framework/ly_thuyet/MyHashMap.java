package _12_java_collection_framework.ly_thuyet;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
    public static void main(String[] args) {
        Map<Student, String> myMap = new HashMap<>();
        myMap.put(new Student(1, "Tu_1"), "C07");
        myMap.put(new Student(2, "Tu_2"), "C07");
        myMap.put(new Student(3, "Tu_3"), "C07");
        myMap.put(new Student(4, "Tu_4"), "C07");


//        for (Student student : myMap.keySet()) {
//            System.out.println(student.toString() + "value:" +myMap.get(student));
//        }

        for(Map.Entry<Student, String> entryStudent: myMap.entrySet()){
            System.out.println("key: "+entryStudent.getKey() + " value: "+entryStudent.getValue());
        }
    }
}
