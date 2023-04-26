package Assign0421;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Assign14 {
    public static void main(String[] args) {
        //TODO:: 10개짜리 정수 배열 만들고 랜덤으로 1~10 사이의 정수를 저장해라. 이후 평균값 출력.

        int[] array = new int[10];

        for(int i = 0; i<array.length;i++){
            //정수 난수만들기
            array[i] = (int)(Math.random()*10 + 1);
        }
        double sum =0;
        System.out.print("Random numbers : ");
        for(int i = 0; i<array.length;i++){
            System.out.print(array[i] + " ");
            sum += array[i];
        }
        System.out.println("Average : " + sum/ array.length);
    }
}
