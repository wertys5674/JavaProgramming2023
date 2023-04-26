package Assign0421;

import java.util.Scanner;

public class Assign1 {
    public static void main(String[] args) {
        //TODO : 원화를 입력받아 달러로 바꾸는 프로그램
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input KRW >> ");
        int KRW = scanner.nextInt();
        System.out.println(KRW + " KRW is " + KRW / 1100.0 + " USD");
        scanner.close();
    }
}
