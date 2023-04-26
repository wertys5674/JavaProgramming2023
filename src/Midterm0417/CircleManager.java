package Midterm0417;

import java.util.Scanner;

public class CircleManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c[] = new Circle[3];
        for(int i=0; i<c.length; i++){
            System.out.print("x, y, radius >> ");
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            int radius = sc.nextInt();
            c[i] = new Circle(x,y,radius);
        }

        for(int i=0;i<c.length;i++){
            c[i].show();
        }

        int temp = 0;
        int index = -1;
        for(int i=0;i<c.length;i++){
            if(temp < c[i].showRadius()) {
                temp = c[i].showRadius();
                index = i;
            }
        }
        System.out.print("Biggest circle info is ");
        c[index].show();

        sc.close();
    }
}


class Circle{
    private double x,y;
    private int radius;
    public Circle (double x, double y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public int showRadius(){
        return this.radius;
    }

    public void show(){
        System.out.println("(" + this.x + ", " + this.y + ") r = " + this.radius);
    }
}