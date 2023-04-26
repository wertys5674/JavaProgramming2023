package Assign0421;

import java.util.Scanner;

public class Assign7 {
    public static void main(String[] args) {
        //TODO: 원의 중심과 반지름을 입력받고, 다른 점을 입력받아 그 안에 있는지 확인.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input center point & radius (x y radius) >> ");
        double centerX = scanner.nextInt();
        double centerY = scanner.nextInt();
        double radius = scanner.nextDouble();
        System.out.print("Input point >> ");
        double x = scanner.nextInt();
        double y = scanner.nextInt();

        //Double형은 ^2 연산이 안된다. 그래서 직접 곱해야함.
        double distance = Math.sqrt((centerX - x) * (centerX - x) + (centerY - y) * (centerY - y));
        if (distance < radius) {
            System.out.println("Point (" + x + "," + y + ") is in the circle.");
        } else
            System.out.println("Point (" + x + "," + y + ") is not in the circle.");
    }
}
