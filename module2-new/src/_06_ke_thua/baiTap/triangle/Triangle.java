package _06_ke_thua.baiTap.triangle;

import _06_ke_thua.thuchanh.he_cac_doi_tuong_hinh_hoc.Shape;
  // Thiết kế lớp đối tượng Triangle kế thừa lớp Shape

public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;


   // Một phương thức khởi tạo không có tham số giúp tạo nên tam giác mặc định
    public Triangle() {
    }


   // Một phương thức khởi tạo tạo ra ba tham số với độ dài ba cạnh cho trước.

    public Triangle(double side1, double side2, double side3,String color, boolean filled) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    // lấy Các phương thức truy cập cho ba trường dữ liệu.

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    // sử dụng công thức heron tính diệc tích tam giác khi biết 3 cạnh
    public double getArea() {
        double haftPerimeter = getPerimeter()/2;
        return Math.sqrt(haftPerimeter * (haftPerimeter- this.side1) * (haftPerimeter - this.side2) * (haftPerimeter - this.side3));
    }

    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    @Override
    public String toString(){
        return "3 cạnh của tam giác: " + this.side1 + ", " + this.side2 + ", " + this.side3
                + " _ Chu Vi Tam Giác: " + this.getPerimeter()
                + " _ Diện tích Tam Giác: " + this.getArea()
                + super.toString();
    }
}