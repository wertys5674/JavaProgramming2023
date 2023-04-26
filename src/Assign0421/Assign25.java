package Assign0421;

import java.util.Scanner;

public class Assign25 {
    public static void main(String[] args) {
        //TODO :: 일정관리 어플리케이션 : 주의하세요 input 값 넣을때.

        Scanner scanner = new Scanner(System.in);
        Day day[] = new Day[30];
        for (int i = 0; i < day.length; i++) {
            day[i] = new Day();
        }
        System.out.println("Monthly schedule management system");
        boolean quit = true;
        while (quit) {
            int input = 0;
            System.out.print("Todo  (Input:1 , Show:2 , Quit:3) >> ");
            input = scanner.nextInt();
            // 입력 값을 공백으로 분리하여 배열에 저장

            int date = -1;
            switch (input) {
                case 1:
                    System.out.print("Date(1-30) >> ");
                    date = scanner.nextInt();
                    System.out.print("Todo (Enter string without space) ? ");
                    scanner.nextLine(); // 엔터키 처리
                    String str = scanner.nextLine();
                    day[date - 1].set(str);
                    System.out.println("");
                    break;
                case 2:
                    System.out.print("Date(1-30) >> ");
                    date = scanner.nextInt();
                    day[date - 1].show();
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Quit Program.");
                    quit = false;
                    break;
                default:
                    break;
            }
        }
    }
}

class Day {
    private String todo;

    public void set(String todo) {
        this.todo = todo;
    }

    public String get() {
        return todo;
    }

    public void show() {
        if (todo == null)
            System.out.println("Nothing to do");
        else
            System.out.println(todo);
    }
}
