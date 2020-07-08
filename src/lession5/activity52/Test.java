package lession5.activity52;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = 10; // Scanner

        Student[] students = new Student[n];
        for(int i=0; i<n; i++){
            String name = "";// scanner
            Float gpa = 0f; // scanner
            students[i] = new Student(name, gpa);
        }


        StudentManagement st = new StudentManagement(students);

        Student highestStudent = st.highestStudent();

        System.out.println("SV cao nhat: Ten: " + highestStudent.getName() + ", GPA: " + highestStudent.getGpa());

        CheckResult result = st.checkPassOrFail();

        System.out.println("So luong do: " + result.getNumberOfPass());
        System.out.println("So luong fail: " + result.getNumberOfFail());
        System.out.println("Ten SV cao nhat: " + result.getNameOfHighestStudent());
    }
}
