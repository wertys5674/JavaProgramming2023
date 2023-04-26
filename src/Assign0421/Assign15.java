package Assign0421;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Assign15 {
    public static void main(String[] args) {
        //TODO:: 정수 몇개 저장할지 입력받아(<100) 배열생성, 1~100까지의 난수 랜덤저장. 같은 숫자 ㄴㄴ 저장된 배열 출력

        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of elements : ");
        int sizeOfArray = scanner.nextInt();
        int[] array = new int[sizeOfArray];
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < sizeOfArray; i++) {
            int randNum;
            do {
                randNum = (int)(Math.random() * 100 + 1); // 0부터 size * 2 - 1까지의 난수 생성
            } while (set.contains(randNum)); // 중복되는 난수가 나오면 다시 생성
            array[i] = randNum;
            set.add(randNum);
        }

        System.out.print("배열: ");
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
