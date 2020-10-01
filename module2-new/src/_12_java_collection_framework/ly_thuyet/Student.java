package _12_java_collection_framework.ly_thuyet;

public class Student implements Comparable<Student>{
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


//    @Override
////    public int compareTo(Student otherStudent) {
////        return this.id - otherStudent.getId();
////    }

    @Override
    public int compareTo(Student otherStudent) {
        return otherStudent.getName().compareTo(this.name);
    }
}