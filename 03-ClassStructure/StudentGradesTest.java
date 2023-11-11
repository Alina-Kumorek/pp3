public class StudentGradesTest {
    public static void main(String[] args) {
        Ex18();
    }

    static void Ex16() {
        double[] g1 = {3.5, 4.5, 4.0, 2.0, 5.0, 3.5, 3.5};
        StudentGrades s1 = new StudentGrades("Amanda", g1);
        s1.displayRecord();

        double[] g2 = {2.0, 3.0, 2.0, 4.5, 4.5};
        StudentGrades s2 = new StudentGrades("James", g2);
        s2.displayRecord();
    }

    static void Ex17() {
        StudentGrades s3 = new StudentGrades("Jane", 100);
        s3.displayRecord();
    }

    static void Ex18() {
        StudentGrades s4 = new StudentGrades("Anne");
        s4.displayRecord();
    }
}