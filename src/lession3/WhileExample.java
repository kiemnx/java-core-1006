package lession3;

public class WhileExample {
    public static void main(String[] args) {
        int i = 0;
        while (i < 0) {
            System.out.println("Xin chao " + i);
            i = i +1;
        }

        System.out.println("Ket thuc");

        do {
            System.out.println("Xin chao " + i);
            i = i+1;
        } while (i<0);
    }
}
