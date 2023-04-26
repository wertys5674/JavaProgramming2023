package Assign0421;

import java.util.Scanner;

public class Assign27 {
    //TODO :: 예약 시스템
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SABClass sabclass[] = new SABClass[3];

        for (int i = 0; i < sabclass.length; i++) {
            sabclass[i] = new SABClass(i + 1);
        }
        int pick = -1;
        boolean quit = false;


        System.out.println("DK Concert hall reservation system");

        while (!quit) {
            printList();
            pick = scanner.nextInt();
            switch (pick) {
                case 1: //Reservation
                    int c = chooseClass(scanner); //class type
                    sabclass[c].printSeat(); // 자리 예약 현황 출력
                    String n = checkName(scanner); // 이름 받고
                    int seatNum = seatNum(scanner); // 번호받고
                    sabclass[c].modifySeat(seatNum, n);
                    break;

                case 2: //Status
                    sabclass[0].printSeat();
                    sabclass[1].printSeat();
                    sabclass[2].printSeat();
                    break;
                case 3: // Cancel
                    int cancelClass = chooseClass(scanner); //class type
                    String cancelName = checkName(scanner); // 이름 받고
                    sabclass[cancelClass].cancelSeat(cancelName);
                    break;
                case 4:
                    quit = true;
                    break;
                default:
                    System.out.println("PICK ERROR! (1-4)");

            }
            System.out.println("");
        }


    }

    public static void printList() {
        System.out.println("1 : Reservation");
        System.out.println("2 : Status");
        System.out.println("3 : Cancel");
        System.out.println("4 : Quit");
        System.out.print(">>> ");
    }

    public static int chooseClass(Scanner sc) {
        System.out.print("Class S(1), A(2), B(3) >> ");
        int i = sc.nextInt();
        return i - 1;
    }

    public static String checkName(Scanner sc) {
        System.out.print("Name >> ");
        String name = sc.next();
        return name;
    }

    public static int seatNum(Scanner sc) {
        System.out.print("sheet number >>");
        int seatnumber = sc.nextInt();
        return seatnumber;
    }

}


class SABClass {
    private String classType;
    private String one;
    private String two;
    private String three;
    private String four;
    private String five;
    private String six;
    private String seven;
    private String eight;
    private String nine;
    private String ten;

    public SABClass(int num) {
        switch (num) {
            case 1:
                this.classType = "S";
                break;
            case 2:
                this.classType = "A";
                break;
            case 3:
                this.classType = "B";
                break;
            default:
                System.out.println("ERROR : Class input Error! ");
        }

        this.one = "-1-";
        this.two = "-2-";
        this.three = "-3-";
        this.four = "-4-";
        this.five = "-5-";
        this.six = "-6-";
        this.seven = "-7-";
        this.eight = "-8-";
        this.nine = "-9-";
        this.ten = "-10-";
    }

    public void printSeat() {
        System.out.println("Class " + classType + " >> " + one + "\t" + two + "\t" + three + "\t" + four + "\t" + five + "\t"
                + six + "\t" + seven + "\t" + eight + "\t" + nine + "\t" + ten);
    }

    public void modifySeat(int num, String name) {
        switch (num) {
            case 1:
                if (this.one == "-1-") {
                    this.one = name;
                    System.out.println(name + " Completed reserving > " + classType + " < class sheet #1");
                }
                else
                    System.out.println(classType + " class sheet #1 already reserved for " + this.one);
                break;
            case 2:
                if (this.two == "-2-") {
                    this.two = name;
                    System.out.println(name + " Completed reserving > " + classType + " < class sheet #2");

                }
                else
                    System.out.println(classType + " class sheet #2 already reserved for " + this.two);
                break;
            case 3:
                if (this.three == "-3-") {
                    this.three = name;
                    System.out.println(name + " Completed reserving > " + classType + " < class sheet #3");
                }
                else
                    System.out.println(classType + "class sheet #3 already reserved for" + this.three);
                break;
            case 4:
                if (this.four == "-4-") {
                    this.four = name;
                    System.out.println(name + " Completed reserving > " + classType + " < class sheet #4");
                }
                else
                    System.out.println(classType + " class sheet #4 already reserved for " + this.four);
                break;
            case 5:
                if (this.five == "-5-") {
                    this.five = name;
                    System.out.println(name + " Completed reserving > " + classType + " < class sheet #5");
                }
                else
                    System.out.println(classType + " class sheet #5 already reserved for " + this.five);
                break;
            case 6:
                if (this.six == "-6-") {
                    this.six = name;
                    System.out.println(name + " Completed reserving > " + classType + " < class sheet #6");
                }
                else
                    System.out.println(classType + " class sheet #6 already reserved for " + this.six);
                break;
            case 7:
                if (this.seven == "-7-") {
                    this.seven = name;
                    System.out.println(name + " Completed reserving > " + classType + " < class sheet #7");
                }
                else
                    System.out.println(classType + " class sheet #7 already reserved for " + this.seven);
                break;
            case 8:
                if (this.eight == "-8-") {
                    this.eight = name;
                    System.out.println(name + " Completed reserving > " + classType + " < class sheet #8");
                }
                else
                    System.out.println(classType + " class sheet #8 already reserved for " + this.eight);
                break;
            case 9:
                if (this.nine == "-9-") {
                    this.nine = name;
                    System.out.println(name + " Completed reserving > " + classType + " < class sheet #9");
                }
                else
                    System.out.println(classType + " class sheet #9 already reserved for " + this.nine);
                break;
            case 10:
                if (this.ten == "-10-") {
                    this.one = name;
                    System.out.println(name + " Completed reserving > " + classType + " < class sheet #10");
                }
                else
                    System.out.println(classType + " class sheet #10 already reserved for " + this.ten);
                break;
            default:
                System.out.println("ERROR");
        }
    }

    void cancelSeat(String name) {
        //이름이 데이터 안에 존재하면 취소하고 안내문구 출력
        if (name.equalsIgnoreCase(this.one)) {
            this.one = "-1-";
            System.out.println("Reservation for " + name + ", Class " + classType + " #1 cancelled");
        } else if (name.equalsIgnoreCase(this.two)) {
            this.two = "-2-";
            System.out.println("Reservation for " + name + ", Class " + classType + " #2 cancelled");
        } else if (name.equalsIgnoreCase(this.three)) {
            this.two = "-3-";
            System.out.println("Reservation for " + name + ", Class " + classType + " #3 cancelled");
        } else if (name.equalsIgnoreCase(this.four)) {
            this.two = "-4-";
            System.out.println("Reservation for " + name + ", Class " + classType + " #4 cancelled");
        } else if (name.equalsIgnoreCase(this.five)) {
            this.two = "-5-";
            System.out.println("Reservation for " + name + ", Class " + classType + " #5 cancelled");
        } else if (name.equalsIgnoreCase(this.six)) {
            this.two = "-6-";
            System.out.println("Reservation for " + name + ", Class " + classType + " #6 cancelled");
        } else if (name.equalsIgnoreCase(this.seven)) {
            this.two = "-7-";
            System.out.println("Reservation for " + name + ", Class " + classType + " #7 cancelled");
        } else if (name.equalsIgnoreCase(this.eight)) {
            this.two = "-8-";
            System.out.println("Reservation for " + name + ", Class " + classType + " #8 cancelled");
        } else if (name.equalsIgnoreCase(this.nine)) {
            this.two = "-9-";
            System.out.println("Reservation for " + name + ", Class " + classType + " #9 cancelled");
        } else if (name.equalsIgnoreCase(this.ten)) {
            this.two = "-10-";
            System.out.println("Reservation for " + name + ", Class " + classType + " #10 cancelled");
        } else
            System.out.println("예약 내역이 없습니다.");
    }
}
