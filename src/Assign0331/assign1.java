package Assign0331;

import java.util.Scanner;

public class assign1 {
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

        //최댓값 찾기
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        //출력부

        System.out.print("The Array is ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("--> Maximum value is : " + max);

    }
}
