package Assign0507;

import java.util.HashMap;
import java.util.Scanner;

public class GC_assign3 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        Scanner scanner = new Scanner(System.in);
        boolean isStop = false;
        boolean isExit = false;

        System.out.println("Enter nation & population (Ex: Korea 5000)");

        while (!isStop) {
            System.out.print("Nation & Population >> ");
            String[] keyValue = scanner.nextLine().split(" ");
            if (keyValue[0].equalsIgnoreCase("stop"))
                isStop = true;
            else
                hashMap.put(keyValue[0], Integer.parseInt(keyValue[1]));
        }

        while (!isExit) {
            System.out.print("Search Population of ");
            String str = scanner.next();
            if (str.equalsIgnoreCase("exit"))
                isExit = true;
            else {
                if (hashMap.containsKey(str)) {
                    System.out.println("Population of " + str + " is " + hashMap.get(str));
                } else
                    System.out.println("Cannot find " + str);
            }
        }
    }
}
