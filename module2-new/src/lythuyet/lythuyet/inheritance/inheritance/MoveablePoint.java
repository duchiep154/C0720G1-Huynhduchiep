package inheritance;

public class MoveablePoint extends Point {
    // thuoc tinh va phuong thuc cua cha
    float xSpeed;
    float ySpeed;

    public MoveablePoint() {
        super();
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public Object[] getSpeed() {
        Object[] objectArray = new Object[2];
        objectArray[0] = new float[]{this.xSpeed, this.ySpeed};
        objectArray[1] = this.xSpeed + " " + this.ySpeed;
        return objectArray;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                "} " + super.toString();
    }

    public MoveablePoint move() {
        this.x += this.xSpeed;
        this.y += this.ySpeed;

        return this;
    }

}
