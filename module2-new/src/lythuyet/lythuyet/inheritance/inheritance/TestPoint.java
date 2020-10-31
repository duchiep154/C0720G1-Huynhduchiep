package inheritance;

public class TestPoint {

    public static void main(String[] args) {
        Point point = new Point(5, 6);
        System.out.println("Point " + point);

        MoveablePoint moveablePoint = new MoveablePoint(6, 8, 2, 1);
        System.out.println("Start: " + moveablePoint);
        System.out.println("End: " + moveablePoint.move());

        MoveablePoint moveablePoint2 = new MoveablePoint(5, 6);
    }
}
