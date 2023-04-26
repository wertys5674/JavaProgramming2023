package Assign0331;

import java.util.Scanner;

public class assign2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[5];
        int inputCount = 0;

        while (inputCount < 5) {
            System.out.print("Enter Integer Value >> ");
            int a = scanner.nextInt();

            if (a >= 0) {
                arr[inputCount] = a;
                inputCount++;
            } else {
                System.out.println(a + " is invalid.");
            }
        }

        //평균값 찾기
        int sum = 0;
        int avg = 0;
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = sum / arr.length;

        //출력부

        System.out.print("The Array is ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("--> Average value is : " + avg);

    }
}

