package Assign0507;

interface Shape {
    final double PI = 3.14;

    void draw();

    double getArea();

    default public void redraw() {
        System.out.print("-- Redraw : ");
        draw();
    }
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Circle with radius " + radius);
    }

    public double getArea() {
        return PI * radius * radius;
    }
}

class Assign4 {
    public static void main(String[] args) {
        Shape donut = new Circle(10);
        donut.redraw();
        System.out.println("Area : " + donut.getArea());
    }
}