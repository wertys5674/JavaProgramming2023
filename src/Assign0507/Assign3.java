package Assign0507;

import java.util.Scanner;

abstract class Calc {
    protected int a;
    protected int b;

    protected void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    abstract protected int calculate();

}

class Add extends Calc {
    public int calculate() {
        return this.a + this.b;
    }
}

class Sub extends Calc {
    public int calculate() {
        return this.a - this.b;
    }
}

class Div extends Calc {
    public int calculate() {

        if (b == 0)
            throw new ArithmeticException("Divide by Zero");

        return this.a / this.b;
    }
}

class Mul extends Calc {
    public int calculate() {
        return this.a * this.b;
    }
}

public class Assign3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This is + - / * Calculator. Input String example : 10 + 3 or 12 / 3");
        System.out.print("Enter 2 Operands & Operator >>> ");
        String str = scanner.nextLine();
        String[] strArr = str.split(" ");
        int operand1 = Integer.parseInt(strArr[0]);
        int operand2 = Integer.parseInt(strArr[2]);
        String operator = strArr[1];

        switch (operator) {
            case "+":
                Add add = new Add();
                add.setValue(operand1,operand2);
                System.out.println(add.calculate());
                break;
            case "-":
                Sub sub = new Sub();
                sub.setValue(operand1,operand2);
                System.out.println(sub.calculate());
                break;
            case "/":
                Div div = new Div();
                div.setValue(operand1,operand2);
                System.out.println(div.calculate());
                break;
            case "*":
                Mul mul = new Mul();
                mul.setValue(operand1,operand2);
                System.out.println(mul.calculate());
                break;
            default:
                System.out.println("INPUT ERROR!!");
        }


    }
}
