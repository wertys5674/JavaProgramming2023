package Assign0507;

public interface Shape2 {
    final double PI = 3.14;

    void draw();

    double getArea();

    default public void redraw() {
        System.out.print("-- Redraw : ");
        draw();
    }
}

class Circle2 implements Shape2 {
    private double radius;

    public Circle2(double radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Circle with radius " + radius);
    }

    public double getArea() {
        return PI * radius * radius;
    }
}

class Rect implements Shape2 {
    private double width;
    private double height;

    public Rect(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void draw() {
        System.out.println("Rectangle with size " + width + " * " + height);
    }

    public double getArea() {
        return width * height;
    }
}

class Assign5 {
    public static void main(String[] args) {
        Shape2[] list = new Shape2[2];
        list[0] = new Circle2(10); // Circle with Radius 10
        list[1] = new Rect(10, 40); // 10x40 Rectangle
        for (int i = 0; i < list.length; i++) list[i].redraw();
        for (int i = 0; i < list.length; i++)
            System.out.println("Area : " + list[i].getArea());
    }
}