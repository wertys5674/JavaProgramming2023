package Assign0421;

import java.util.Scanner;

public class Assign18 {
    public static void main(String[] args) {
        //TODO: 문자열 비교해서 해당 주소 찾기 -> 점수뽑기.
        String course[] = {"Java", "C++", "HTML", "Kotlin" ,"Python"};
        int score[] = {95,88,76,62,55};
        Scanner scanner = new Scanner(System.in);
        int index = -1;

        while(true) {
            System.out.print("Subject >> ");
            String input = scanner.nextLine();
            if(input.equalsIgnoreCase("quit"))
                break;
            for (int i = 0; i < course.length; i++) {
                if (input.equals(course[i])) {
                    index = i;
                }
            }

            System.out.println("Score is " + score[index]);
        }
    }
}
