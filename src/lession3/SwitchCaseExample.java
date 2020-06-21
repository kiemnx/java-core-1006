package lession3;

import java.util.Scanner;

public class SwitchCaseExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao lua chon cua ban");
        System.out.println("1. Dang ky");
        System.out.println("2. Dang nhap");
        System.out.println("3. Reset mat khau");

        Integer option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Nhap vao thong tin dang ky");
                break;
            case 2:
                System.out.println("Nhap vao username, password");
                break;
            case 3:
                System.out.println("Nhap vao email cua ban");
                break;
            default:
                System.out.println("Xin cam on");
        }

        if(option == 1){
            System.out.println("Nhap vao thong tin dang ky");
        } else if(option == 2){
            System.out.println("Nhap vao username, password");
        } else if(option == 3){
            System.out.println("Nhap vao email cua ban");
        } else {
            System.out.println("Xin cam on");
        }




        System.out.println("Ket thuc");
    }
}
