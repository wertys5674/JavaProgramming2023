package Assign0421;

import java.util.Arrays;
import java.util.Scanner;

public class Assign3 {
    public static void main(String[] args) {
        //TODO: 정수 3개 입력받고 3개의 숫자 중 중간 크기의 수를 출력하라.

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[3];
        System.out.print("Input 3 Integers : ");

        for(int i = 0; i <3; i++){
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);
        System.out.println(array[1]);
    }
}
