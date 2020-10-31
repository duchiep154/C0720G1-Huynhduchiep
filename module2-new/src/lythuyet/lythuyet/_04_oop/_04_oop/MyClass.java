package lythuyet.lythuyet._04_oop._04_oop;

public class MyClass {
    private int age;

    public  MyClass(int age){
        this.age = age;

    }

    public  MyClass(int a, int b){
        this(15);
        System.out.println(a);
        System.out.println(b);
    }

    public MyClass(){
        this(10, 11);
    }

//alt + insert : phim tat tao constructor, getter, setter

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
