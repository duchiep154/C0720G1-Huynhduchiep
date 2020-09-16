package _05_access_modifies_static_method_static_property.Baitap;

public class test_access_modified_circle {
    public static void main(String[] args) {
        access_modified_circle circle1 = new access_modified_circle();
//        circle1.getRadius(10);
        System.out.println("Bán kính hình tròn: " + circle1.getRadius()+ "\n" + "Diện tích hình tròn: " + circle1.getArea());
    }
}
