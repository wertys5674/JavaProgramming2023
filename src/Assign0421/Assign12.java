package Assign0421;

import java.util.Scanner;

public class Assign12 {
    public static void main(String[] args) {
        //TODO :: e 넣으면
        //TODO :: abcde ( 97 98 99 100 101)
        //TODO :: abcd 97 98 99 100
        //TODO :: abc 97 98 99
        //TODO :: ab
        //TODO :: a

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a lowercase alphabet >> ");
        //한글자씩 입력받는 법.
        char alphabet = scanner.nextLine().charAt(0);

        for (int i = 0; i <= (int) alphabet - 97; i++) {
            for (int j = 97; j <= ((int) alphabet) - i; j++) {
                System.out.print(Character.toChars(j));
            }
            System.out.println("");
        }

    }
}
