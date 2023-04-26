package Assign0421;

import java.util.Scanner;

public class Assign26 {
    public static void main(String[] args) {
        //TODO:: 전화번호 찾아주기.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of persons : ");
        int number = scanner.nextInt();

        Phone phone[] = new Phone[number];
        for(int i =0; i< phone.length;i++){
            System.out.print("Input name & Phone number >> ");
            String name = scanner.next();
            String tel = scanner.next();
            phone[i] = new Phone(name, tel);
        }
        System.out.println("Saved...");


        while(true) {
            System.out.print("Search >> ");
            String searchString = scanner.next();
            if(searchString.equalsIgnoreCase("quit")) {
                break;
            }

            boolean found = false;
            for(int i = 0; i < phone.length; i++) {
                if(phone[i].isStored(searchString)) {
                    System.out.println(phone[i].getNum());
                    found = true;
                    break;
                }
            }
            if(!found) {
                System.out.println("Not found");
            }
        }





    }
    }


class Phone{
    public String name = "";
    public String tel = "";

    public Phone(String str, String tel){
        this.name =str;
        this.tel = tel;
    }

    public boolean isStored(String name){
        return this.name.equals(name);
    }
    public String getNum(){
        return this.tel;
    }
}
