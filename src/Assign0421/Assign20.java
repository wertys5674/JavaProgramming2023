package Assign0421;

import java.util.Scanner;

public class Assign20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input math, science, english >> ");
        int math = scanner.nextInt();
        int science = scanner.nextInt();
        int english = scanner.nextInt();

        Grade me = new Grade(math,science,english);
        System.out.println("Average : "+ me.average());
        scanner.close();
    }
}

class Grade {
    private int math = 0;
    private int science = 0;
    private int english = 0;

    public Grade(int a, int b, int c){
        this.math = a;
        this.science = b;
        this.english = c;
    }

    public int average(){
       return (this.math + this.english + this.science)/3;
    }
}
