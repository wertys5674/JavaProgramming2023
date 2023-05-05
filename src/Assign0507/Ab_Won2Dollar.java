package Assign0507;

// Abstraction Class

import java.util.Scanner;

abstract class Converter {
    abstract protected double convert(double src);

    abstract protected String getSrcString();

    abstract protected String getDestString();

    protected double ratio;

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Convert " + getSrcString() + " to " + getDestString());
        System.out.print("Enter " + getSrcString() + " >>> ");
        double val = scanner.nextDouble();
        double res = convert(val);
        System.out.print(val + " " + getSrcString() + " is converted to " + res + " " + getDestString());
        scanner.close();
    }
}

class Won2Dollar extends Converter {
    public Won2Dollar(double ratio) {
        this.ratio = ratio;
    }

    protected double convert(double src) {
        return src / ratio;
    }

    protected String getSrcString() {
        return "KRW";
    }

    protected String getDestString() {
        return "USD";
    }

    public static void main(String[] args) {
        Won2Dollar assign1 = new Won2Dollar(1200.0);
        assign1.run();
    }
}