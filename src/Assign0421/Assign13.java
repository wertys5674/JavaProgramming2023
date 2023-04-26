package Assign0421;

import java.util.Scanner;

public class Assign13 {
    public static void main(String[] args) {
        //TODO:: 배열 만들고 3의 배수 찾기.

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        System.out.print("Input 10 positive integers >> ");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if(array[i]%3 == 0)
                System.out.print(array[i] + " ");
        }
    }
}
