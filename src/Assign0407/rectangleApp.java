package Assign0407;

import java.util.Scanner;

public class rectangleApp {
    public int squareSide1;
    public int squareSide2;

    public rectangleApp(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of base of the rectangle : ");
        int ss1 = sc.nextInt();
        System.out.println("Enter the value of height side of the rectangle : ");
        int ss2 = sc.nextInt();
        squareSide1 = ss1;
        squareSide2 = ss2;
    }

    public int getArea(){
        System.out.print("Area of your rectangle : ");
        return squareSide1 * squareSide2;
    }



    public static void main(String[] args) {
        rectangleApp rec1 = new rectangleApp();
        System.out.println(rec1.getArea());
    }
}
