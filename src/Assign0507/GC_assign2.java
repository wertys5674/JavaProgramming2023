package Assign0507;

import java.util.ArrayList;
import java.util.Scanner;

public class GC_assign2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> gradeArray = new ArrayList<String>();
        System.out.print("Enter grades of 6 students (A/B/C/D/F)>> ");

        for (int i = 0; i < 6; i++) {
            String grade = scanner.next();
            gradeArray.add(grade);
        }

        double sum = 0;
        boolean hasError = false;

        for (int i = 0; i < 6; i++) {
            switch (gradeArray.get(i)) {
                case "A":
                    sum += 4.0;
                    break;
                case "B":
                    sum += 3.0;
                    break;
                case "C":
                    sum += 2.0;
                    break;
                case "D":
                    sum += 1.0;
                    break;
                case "F":
                    sum += 0.0;
                    break;
                default:
                    hasError =true;
            }
        }

        if(hasError)
            System.out.println("Invalid");
        else
            System.out.println(sum/gradeArray.size());
    }
}
