package Assign0421;

import java.util.Scanner;

public class Assign24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle1 c[] = new Circle1[3];
        for(int i=0; i<c.length; i++){
            System.out.print("x, y, radius >> ");
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            int radius = sc.nextInt();
            c[i] = new Circle1(x,y,radius);
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

class Circle1{
    private double x,y;
    private int radius;
    public Circle1 (double x, double y, int radius){
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
