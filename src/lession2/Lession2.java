package lession2;

import java.util.Scanner;

public class Lession2 {

    int instanceVariable = 100;
    int b;

    static int number;
    static final int constant = 200;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao chuoi A: ");

        String name = scanner.nextLine();

        System.out.print("Chuoi ban vua nhap la: " + name);
        System.out.print("Hello");
    }












    // Phuong thuc, ham, function, method
    void printSomething(){
        int aInSomeThing = number;
        System.out.println(instanceVariable * aInSomeThing);
    }

    int getIntNumber(){
        int aInIntNumber = 10;
        return aInIntNumber * instanceVariable;
    }





}
