package lession3;

import java.util.Scanner;

public class IfElseIfExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 9;

        if(b%2 == 0 && a%2==0 && a>10 && b>0){
            System.out.println("A va B cung chia het cho 2");
        } else if(a%2==0){
            System.out.println("A chia het cho 2");
        } else {
            System.out.println("Ket thuc");
        }
    }
}
