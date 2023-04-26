package Assign0407;

public class CircleApp3 {
    public double radius;

    public CircleApp3(double val) {
        radius = val;
    }

    public double getArea3(){
        double area = 3.14 * radius * radius;
        return area;
    }

    public static void main(String[] args) {
        CircleApp3 c1 = new CircleApp3(5.0);
        CircleApp3 c2 = new CircleApp3(6.0);

        System.out.println(c1.getArea3());
        System.out.println(c2.getArea3());
    }
}

