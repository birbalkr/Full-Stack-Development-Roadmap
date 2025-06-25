package Java.Challenge2;

class courseClass {

    static int maxCapacity = 100;

    String courseName;
    int enrollments;

    String[] enrolledStudents;

    courseClass(String courseName) {
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudents = new String[maxCapacity];>
    }

    static void setMaxCapacity(int maxCapacity) {
        courseClass.maxCapacity = maxCapacity;
    }

    void enrollStudent(String studentName) {
        enrolledStudents[enrollments] = studentName;
        enrollments++;
    }

    void unenrollStudent(String studentName) {
        System.out.println("Student removes");
        enrollments--;
    }
}
