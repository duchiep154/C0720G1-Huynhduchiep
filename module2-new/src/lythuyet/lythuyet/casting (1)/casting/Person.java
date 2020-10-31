package casting;

public class Person extends Animal {
    //thuoc tinh va phuong thuc Cha
    public String hands;
    public String legs;

    @Override
    public void move() {
        System.out.println("Move by legs");
    }

    public void read() {

    }
}
