package Assign0507;

import java.util.Scanner;

abstract class Converter2 {
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

public class Km2Mile extends Converter2 {
    public Km2Mile(double ratio) {
        this.ratio = ratio;
    }

    protected double convert(double src) {
        return src / ratio;
    }

    protected String getSrcString() {
        return "km";
    }

    protected String getDestString() {
        return "mile";
    }

    public static void main(String[] args) {
        Km2Mile assign2 = new Km2Mile(1.6);
        assign2.run();
    }
}
