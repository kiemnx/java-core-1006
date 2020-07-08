package lesson6.animals;

import java.util.Scanner;

public class AppTest {

    public static void main(String[] args) {

        NhanVien[] nhanViens = new NhanVien[10];

        Scanner scanner = new Scanner(System.in);

        // for 10 vong
        for(int i=0; i<10; i++){
            System.out.println("Nhap nv partime/fulltime");
            int option = scanner.nextInt();
            NhanVien nv = null;
            if(option == 1){
                nv = new NhanVienFullTime();
            } else {
                nv = new NhanVienPartTime();
            }

            nhanViens[i] = nv;
        }



    }

}

class NhanVien{
    private String hoTen;
    public int tinhLuong(){
        return 1600000;
    }
}
class NhanVienFullTime extends NhanVien{
    private String type;
    private int soNgayLamThem;

    public int tinhLuong(){
        int luong = 0;
        if(type.equals("SEP")){
            luong = 2000000 + soNgayLamThem * 800;
        } else {
            luong = 10000000 + soNgayLamThem * 800;
        }
        return luong;
    }
}
class NhanVienPartTime extends NhanVien{

}
