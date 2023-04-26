package Assign0421;

import java.util.Arrays;
import java.util.Scanner;

public class Assign4 {
    public static void main(String[] args) {
        //TODO: 삼각형 만들수있는지

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[3];
        System.out.print("Input 3 Integers : ");


        for(int i = 0; i <3; i++){
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);

        if(array[2] >= array[0] + array[1]){
            System.out.println("NO!");
        }else{
            System.out.println("YES");
        }

    }
}
