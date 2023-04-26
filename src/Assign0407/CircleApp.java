package Assign0407;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Circle c = new Circle();
        Scanner scanner = new Scanner(System.in);

        c.radius =scanner.nextDouble();
        System.out.println(c.getArea());
        scanner.close();
    }
}

class Circle{

    public double radius;

    public double getArea(){
        double area = 3.14*radius*radius;
        return area;
    }
}
