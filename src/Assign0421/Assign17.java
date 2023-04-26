package Assign0421;

public class Assign17 {
    public static void main(String[] args) {
        //TODO: 4*4배열에 1~10 범위의 랜덤정수 10개 생성 후 임의의 위치에 저장. 나머지 6개는 0으로 저장.
        int[][] array = new int[4][4];
        int count = 0;

        while(count <10){
            int x = rand4();
            int y = rand4();
            if(isEmpty(array,x,y)){
                array[x][y] = rand10();
                count ++;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i][j]);
                System.out.print("\t");
            }
            System.out.println("");
        }

    }

    public static boolean isEmpty(int arr[][], int x, int y) {
        if (arr[x][y] == 0)
            return true;
        else
            return false;
    }

    public static int rand4() {
        return (int) (Math.random() * 4);
    }

    public static int rand10() {
        return (int) (Math.random() * 10 + 1);
    }

}
