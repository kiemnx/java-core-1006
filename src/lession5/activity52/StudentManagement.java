package lession5.activity52;

public class StudentManagement {

    private Student[] students;
    private int numberOfStudents;

    public StudentManagement(Student[] students) {
        this.students = students;
        numberOfStudents = students.length;
    }

    public StudentManagement() {
    }

    public CheckResult checkPassOrFail() {
        int numberOfPass = 0;
        for (Student student : students) {
            if (student.pass())
                numberOfPass++;
        }

        int numberOfFail = numberOfStudents - numberOfPass;
        CheckResult checkResult = new CheckResult(numberOfPass, numberOfFail);
        String name = "Nguyen Van A";
        checkResult.setNameOfHighestStudent(name);

        return checkResult;
    }

    /*public int numberOfFail() {
        int cnt = 0;
        for (Student student : students) {
            if (!student.pass())
                cnt++;
        }
        return cnt;
    }*/

    public Student highestStudent() {
        float max = students[0].getGpa();
        Student result = students[0];
        for (Student student : students)
            if (student.getGpa() > max) {
                result = student;
                max = student.getGpa();
            }
        return result;
    }

    public Student lowestStudent() {
        float min = students[0].getGpa();
        Student result = students[0];
        for (Student student : students)
            if (student.getGpa() < min) {
                result = student;
                min = student.getGpa();
            }
        return result;
    }
}
