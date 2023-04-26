package Assign0421;

public class Assign16 {
    public static void main(String[] args) {
        //TODO:: 4*4 배열 만들고 1~10 범위의 정수를 10개 랜덤하게 생성후  저
        //TODO: 배열 출력

        int[][] array = new int[4][4];

        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                array[x][y] =(int) (Math.random() * 10 + 1);
            }
        }

        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                System.out.print(array[x][y]);
                System.out.print("\t");
            }
            System.out.println("");
        }

    }
}
