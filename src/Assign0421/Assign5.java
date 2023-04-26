package Assign0421;

import java.util.Scanner;

public class Assign5 {
    public static void main(String[] args) {
        //TODO: Simple 369

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\nInput integer(1-99) >> ");
            int i = scanner.nextInt();

            if (CheckNum(i) == 0) {
                scanner.close();
                break;
            } else {
                for (int j = 0; j < CheckNum(i); j++) {
                    System.out.print("Clap! ");
                }
            }

        }
    }

    public static int CheckNum(int i) {
        int count = 0;
        if (i / 10 == 3 || i / 10 == 6 || i / 10 == 9)
            count++;
        if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9)
            count++;
        return count;
    }
}
