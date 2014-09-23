package es.upm.miw.pd.doo.cohesion.lackOf;

public class Point {
    private int x, y;

    private double angle;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double angle) {
        this.angle = angle;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public double getAngle() {
        return angle;
    }

    public double module() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public double module(int x, int y) {
        return Math.sqrt(x * x + y * y);
    }

    public int mayor(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    public void addAngle(double angle) {
        this.angle += angle;
    }

    @Override
    public String toString() {
        return "Point[" + x + "," + y + "]";
    }

}
