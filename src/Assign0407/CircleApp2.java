package Assign0407;

import java.util.Scanner;

public class CircleApp2 {
    public double radius;

    public CircleApp2() {
        radius = 3.0;
    }

    public double getArea2(){
        double area = 3.14 * radius * radius;
        return area;
    }


    public static void main(String[] args) {
        CircleApp2 c = new CircleApp2();
        Scanner scanner = new Scanner(System.in);

        System.out.println(c.getArea2());

        c.radius = scanner.nextDouble();
        System.out.println(c.getArea2());
        scanner.close();
    }
}

