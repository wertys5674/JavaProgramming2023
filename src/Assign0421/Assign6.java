package Assign0421;

import java.util.Scanner;

public class Assign6 {
    public static void main(String[] args) {
        //TODO: (100,100) 과 (200,200) 사이에 있는지 확인하기.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input (x,y) >> ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if(100 <= x && x <= 200 && 100 <= y && y <= 200){
            System.out.println("Point (" + x +"," + y + ") is in the rectangle");
        }else{
            System.out.println("Point (" + x +"," + y + ") is not in the rectangle");
        }
    }
}
