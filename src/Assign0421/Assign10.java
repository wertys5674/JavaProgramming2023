package Assign0421;

import java.util.Scanner;

public class Assign10 {
    public static void main(String[] args) {
        //TODO:: 사칙연산을 입력받아 계산. 연산자는 사칙연산, 피연산자는 더블형 / 0 나누기시 에러출력
        //TODO :: 문자열 비교는 equals 함수를 사용하는것 알기. (switch문 사용가능)

        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER >> ");
        double operand1 = scanner.nextDouble();
        String operator = scanner.next();
        double operand2 = scanner.nextDouble();


        if (operator.equals("+")) {
            System.out.println(operand1 + operator + operand2 + " = " + (operand1 + operand2));
        } else if (operator.equals("-")) {
            System.out.println(operand1 + operator + operand2 + " = " + (operand1 - operand2));
        } else if (operator.equals("*")) {
            System.out.println(operand1 + operator + operand2 + " = " + (operand1 * operand2));
        } else if (operator.equals("/")) {
            if (operand2 == 0)
                System.out.println("Divide by 0 Error.");
            else
                System.out.println(operand1 + operator + operand2 + " = " + (operand1 / operand2));
        } else
            System.out.println("INPUT ERROR");


        // Switch 문으로 구현

//        switch (operator) {
//            case "+":
//                System.out.println(operand1 + operator + operand2 + " = " + (operand1 + operand2));
//                break;
//            case "-":
//                System.out.println(operand1 + operator + operand2 + " = " + (operand1 - operand2));
//                break;
//            case "*":
//                System.out.println(operand1 + operator + operand2 + " = " + (operand1 * operand2));
//                break;
//            case "/":
//                if (operand2 == 0) {
//                    System.out.println("Divide by 0 Error.");
//                    break;
//                }
//                System.out.println(operand1 + operator + operand2 + " = " + (operand1 / operand2));
//                break;
//            default:
//                System.out.println("Input ERROR");
//        }

    }
}
