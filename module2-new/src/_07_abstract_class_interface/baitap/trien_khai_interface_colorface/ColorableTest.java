package _07_abstract_class_interface.baitap.trien_khai_interface_colorface;

import _07_abstract_class_interface.baitap.trien_khai_interface_rezieable.Circle;
import _07_abstract_class_interface.baitap.trien_khai_interface_rezieable.Rectangle;
import _07_abstract_class_interface.baitap.trien_khai_interface_rezieable.Shape;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Square();
        shapes[1] = new Circle();
        shapes[2] = new Rectangle();
        for (Shape shape : shapes) {
            if (shape instanceof Colorable) {
                Square square = (Square) shape;
                System.out.print(shape.getArea() + " ");
                square.howToColor();
            } else {
                System.out.println(shape.getArea());
            }
        }
    }

}