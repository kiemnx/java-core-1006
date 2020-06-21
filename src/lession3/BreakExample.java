package lession3;

import java.util.Scanner;

public class BreakExample {
    public static void main(String[] args) {
        int number, sum = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số:");
            number = scanner.nextInt();
            /*
             * Nếu số nhập < 0 thì sẽ kết thúc vòng lặp
             * và thực hiện câu lệnh bên ngoài vòng lặp.
             */
            if (number < 0) {
                break;
            }
            sum += number;
        } while (number >= 0);    // i còn lớn hơn hoặc bằng 0 thì còn tiếp tục

        System.out.println("Kết quả = " + sum);
    }

}
