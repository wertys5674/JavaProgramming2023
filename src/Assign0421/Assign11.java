package Assign0421;

import java.util.Scanner;

public class Assign11 {
    public static void main(String[] args) {
        //TODO:: 정수를 입력받고 * 찍는 프로그램

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Integer >> ");
        int i = scanner.nextInt();

        for(int a=0; a<i;a++){
            for(int b=0;b<i-a;b++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
