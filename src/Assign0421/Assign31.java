package Assign0421;

import java.awt.*;

public class Assign31 {
    public static void main(String[] args) {
        ColorPoint2 zeroPoint = new ColorPoint2(); // Set BLACK on (0, 0)
        System.out.println(zeroPoint.toString());
        ColorPoint2 cp = new ColorPoint2(10, 10);
        cp.setXY(5, 5);
        cp.setColor("RED");
        System.out.println(cp.toString());
    }
}

class Point2 {
    private int x, y;

    public Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    protected void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class ColorPoint2 extends Point2 {
    private String color;

    public ColorPoint2(int x, int y) {
        super(x, y);
        this.color = color;
    }

    public ColorPoint2() {
        super(0, 0);
        this.color = "BLACK";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setXY(int x, int y) {
        super.move(x, y);
    }

    @Override
    public String toString() {
        return getColor() + " color on " + "(" + getX() + ", " + getY() + ")";
    }
}



//////


