package Assign0421;

public class Assign19 {
    public static void main(String[] args) {
        //TODO: 클래스 만들어서 출력하기.

        TV myTV = new TV("LG", 2021, 85);
        myTV.show();

    }
}

class TV {
    private String name = "default";
    private int year = 0;
    private int inch = 0;

    public TV(String name, int year, int inch) {
        this.name = name;
        this.year = year;
        this.inch = inch;
    }

    public void show() {
        System.out.println("My Tv is " + inch + " inches manufactured by " + name + " in " + year + ".");
    }

}
