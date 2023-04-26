package Assign0421;

import java.util.Scanner;

public class Assign2 {
    public static void main(String[] args) {
        //TODO : 2자리 정수 입력받고, 10의 자리와 1의 자리 같은지 판별하여 출력

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input 2-digit integer(10-99) >> ");
        int i = scanner.nextInt();

        if(i<10){
            System.out.println("Error!");
        }else if(CheckFunc(i)){
            System.out.println("Yes! The digit of 10 and the digits of 1 are the same.");
        }else{
            System.out.println("No! The digits of 10 and the digits of 1 are different.");
        }
    }

    public static boolean CheckFunc(int i){
        if(i/10 == i %10){
            return true;
        }else{
            return false;
        }

    }
}
