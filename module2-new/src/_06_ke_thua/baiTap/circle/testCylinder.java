package _06_ke_thua.baiTap.circle;

public class testCylinder {
    public static void main(String[] args) {
        Cylinder cylinder=new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(2);
        System.out.println(cylinder);


        cylinder =new Cylinder(5,5,"black");
        System.out.println(cylinder);

    }
}
