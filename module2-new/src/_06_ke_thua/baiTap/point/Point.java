package _06_ke_thua.baiTap.point;


// tạo khai báo lớp class point


public class Point {
    private float x;
    private float y;


    // constructor mặc định
    public Point() {
    }


    // constructor có tham số x,y
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }


    // getter
    public float getX() {
        return x;
    }
    // setter
    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        return new float[]{this.x, this.y};
    }

    public void setXY(float x, float y) {
        this.y = y;
        this.x = x;
    }

    @Override
    public String toString() {
        return "(x , y) = " + "(" + this.x + ", " + this.y + ")";
    }
}
