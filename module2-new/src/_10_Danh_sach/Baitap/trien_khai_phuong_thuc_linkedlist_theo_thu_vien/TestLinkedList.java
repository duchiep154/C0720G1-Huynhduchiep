package _10_Danh_sach.Baitap.trien_khai_phuong_thuc_linkedlist_theo_thu_vien;

public class TestLinkedList {
    public static void main(String[] args) {
        class Student{
            private int id;
            private String name;

            public Student() {
            }

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
        }
        MyLinkedList<Student> myLinkedList=new MyLinkedList<>();
        Student student1 = new Student(1,"hiep");
        Student student2 = new Student(2,"long");
        Student student3 = new Student(3,"tuan");
        Student student4 = new Student(4,"hai");
        Student student5 = new Student(5,"ha2");

        myLinkedList.addFirst(student1);
        myLinkedList.addFirst(student2);
        myLinkedList.addlast(student3);
        myLinkedList.add(2,student4);

        MyLinkedList<Student>cloneLinkedList=myLinkedList.clone();
       // System.out.println(myLinkedList.constains(student2));
       // System.out.println(myLinkedList.constains(student5));
       // System.out.println(myLinkedList.indexof(student1));





    }

}
