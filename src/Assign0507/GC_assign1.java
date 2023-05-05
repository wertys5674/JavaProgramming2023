package Assign0507;

import java.util.Scanner;
import java.util.Vector;

public class GC_assign1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<Integer> numArray = new Vector<Integer>();

        System.out.print("Enter integer(-1 to quit)>> ");
        int num = scanner.nextInt();

        while (num != -1) {
            numArray.add(num);
            num = scanner.nextInt();
        }

        int max = numArray.get(0);
        for (int i = 1; i < numArray.size(); i++) {
            int temp = numArray.get(i);
            if (temp > max) {
                max = temp;
            }
        }

        System.out.println("Maximum number is " + max);
        scanner.close();
    }
}
