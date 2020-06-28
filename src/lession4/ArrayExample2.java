package lession4;

public class ArrayExample2 {
    public static void main(String[] args) {


        // 3x2 (mxn) Hang x cot
        int[][] array = new int[][]{{4,5}, {2,4}, {6,7}};

        //  4 5
        //  2 4
        //  6 7

        /*int a = array[1][2];
        System.out.println(a);*/

        for(int i=0; i<3; i++){
            for (int j=0; j<2; j++){
                System.out.println(array[i][j] + " ");
            }
        }

    }
}


class Diem{
    private int toan;
    private int ly;
    private int van;
}