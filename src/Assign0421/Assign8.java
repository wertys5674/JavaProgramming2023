package Assign0421;

import java.util.Scanner;

public class Assign8 {
    public static void main(String[] args) {
        //TODO:: 원끼리 겹치는지 판단.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first center point & radius (x y radius) >> ");
        double centerX_1 = scanner.nextInt();
        double centerY_1 = scanner.nextInt();
        double radius_1 = scanner.nextDouble();

        System.out.print("Input second center point & radius (x y radius) >> ");
        double centerX_2 = scanner.nextInt();
        double centerY_2 = scanner.nextInt();
        double radius_2 = scanner.nextDouble();

        double distance = Math.sqrt((centerX_1 - centerX_2) * (centerX_1 - centerX_2)
                + (centerY_1 - centerY_2) * (centerY_2 - centerY_2));

        if (distance < radius_1 + radius_2) {
            System.out.println("OVERLAPPED");
        } else if(distance > radius_1 + radius_2)
            System.out.println("NOT OVERLAPPED");
        else{
            System.out.println("접해있다.");
        }
    }
}
