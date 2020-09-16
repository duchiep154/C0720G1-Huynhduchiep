package _05_access_modifies_static_method_static_property.Baitap;

public class access_modified_circle {
    private double radius = 1.0;
    private String color = "red";

    public access_modified_circle(){
    }

    public void access_modified_circle(double radius){
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    public double getArea(){
        return (radius*radius*3.14);
    }
}
