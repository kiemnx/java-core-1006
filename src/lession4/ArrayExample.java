package lession4;

public class ArrayExample {
    public static void main(String[] args) {

        int n = 5;
        int[] array = new int[1];
        array[0] = 7;

        System.out.println("Before tham tri: " + n);
        thamTri(n);
        System.out.println("After tham tri: " + n);


        System.out.println("Before tham chieu: " + array[0]);
        thamChieu(array);
        System.out.println("After tham chieu: " + array[0]);

    }

    private static void thamTri(int n){
        n = 10;
    }

    private static void thamChieu(int[] array){
        array[0] = 20;
    }
}
