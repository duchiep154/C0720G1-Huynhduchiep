package _06_ke_thua.baiTap.circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle=new Circle();
        System.out.println(circle);

        circle=new Circle();
        System.out.println(circle);

        circle = new Circle(5,"red");
        System.out.println(circle);
    }
}
