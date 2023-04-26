package Assign0331;

public class assign3 {
    public static void main(String[] args) {
        int[][] arr = new int[4][3];

        //배열 생성
        /*
        * 홀수번째랑 짝수번째로 따로 선언함으로 값 조절
       *
        * */

        for (int i = 0; i < arr.length; i+=2) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (i + 1) * 10 + j;
            }
        }

        for (int i = 1; i < arr.length; i+=2) {
            for (int j = 0; j < arr[i].length - 1; j++) {
                arr[i][j] = (i + 1) * 10 + j;
            }
        }


        // if-else 사용해서 20 21 0 이라고 뜨는것을 0을 제거.

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == 0 )
                    System.out.print("");
                else
                    System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
