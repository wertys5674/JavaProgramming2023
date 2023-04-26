package practiceJAVA;

public class MyClass {
    public static void main(String[] args) {
        int yyyy=2020;
        Car c = new Car("SUV","흰색",yyyy++);
        System.out.print(", year : " + c.yyyy);

    }
}

class Car{
    String model;
    String color;
    int yyyy;
    Car(){
        this.model = "승용차";
        this.color="검정";
        this.yyyy=2020;
        System.out.print("Model : " + model);
    }

    Car(String model, String color, int yyyy){
        this.model = model;
        this.color= color;
        this.yyyy= yyyy;
        System.out.print("Model : " + model);
    }
}
