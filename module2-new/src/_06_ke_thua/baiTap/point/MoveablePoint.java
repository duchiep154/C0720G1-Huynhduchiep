package _06_ke_thua.baiTap.point;

  // khai báo class con

public class MoveablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    // constructor mặc đinhk

    public MoveablePoint() {
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
     // lấy kế thừa thuốc tính của  classs cha

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }

    @Override
    public String toString() {
        return "(" + this.getX() + "," + this.getY() + ")" + ", speed = " + "(" + this.xSpeed + ", " + this.ySpeed + ")";
    }

    public MoveablePoint move() {
        float x = this.getX();
        float y = this.getY();
        setX(x += this.xSpeed);
        setY(y += this.ySpeed);
        return this;
    }
}
