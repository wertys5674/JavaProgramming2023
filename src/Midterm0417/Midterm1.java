package Midterm0417;

import java.util.Scanner;


public class Midterm1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Integer >> ");
        int i = scanner.nextInt();

        if(i % 2 ==0)
            System.out.println("I NEED ODD NUMBER.");
        else{
            for(int x=0;x<=i/2+1;x++){
                for(int y=0; y<=i/2-x;y++){
                    System.out.print(" ");
                }
                for(int z=0;z<x*2-1;z++){
                    System.out.print("*");
                }
                System.out.println("");
            }
        }

        scanner.close();


    }
}
