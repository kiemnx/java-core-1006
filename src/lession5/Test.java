package lession5;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so luong sinh vien:");
        int n = scanner.nextInt();
        scanner.nextLine();
        StudentOOP[] students = new StudentOOP[n];

        for(int i=0; i<n; i++){

            System.out.println("Nhap vao ten sinh vien thu " + (i+1));
            String name = scanner.nextLine();
            System.out.println("Nhap vao GPA sinh vien thu " + (i+1));
            float gpa = scanner.nextFloat();
            scanner.nextLine();
            students[i] = new StudentOOP(name, gpa);
        }

        System.out.println("BEFORE");
        for(StudentOOP st: students){
            System.out.println(st.information());
        }

        StudentOOP temp = null;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(students[i].getGpa() < students[j].getGpa()){
                    temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }

        System.out.println("AFTER");
        int hsGioi =0;
        for(StudentOOP st: students){
            if(st.checkGpa()==true){
                hsGioi ++;
            }
        }
        System.out.println("So luong hoc sinh gioi: " + hsGioi);

    }
}
