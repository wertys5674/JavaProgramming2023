package Assign0421;

import java.util.Scanner;

public class Assign9 {
    public static void main(String[] args) {
        //TODO:: 봄여름가을겨울

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input month (1~12) >> ");
        int month = scanner.nextInt();

        if(month>0 && month<13) {
            if (month / 3 == 1) {
                System.out.println("SPRING");
            } else if (month / 3 == 2) {
                System.out.println("SUMMER");
            } else if (month / 3 == 3) {
                System.out.println("Autumn");
            } else {
                System.out.println("WINTER");
            }
        }else{
            System.out.println("INVALID");
        }
    }
}
