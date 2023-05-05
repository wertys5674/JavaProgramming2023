package Assign0507;

import java.util.Scanner;
import java.util.Vector;

public class GC_assign4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<Integer> rainArray = new Vector<Integer>();
        boolean isZero = false;
        double sum = 0;

        while (!isZero) {
            System.out.print("\nEnter amount of rainfall (0 to quit)>> ");
            int rain = scanner.nextInt();
            if (rain == 0) {
                isZero = true;
            } else {
                rainArray.add(rain);
                sum += rain;
                printVector(rainArray);
                System.out.println();
                System.out.println("Current Average : " + sum / rainArray.size());
            }
        }
    }

    public static void printVector(Vector<Integer> vector) {
        for (int i = 0; i < vector.size(); i++)
            System.out.print(vector.get(i) + " ");
    }
}
