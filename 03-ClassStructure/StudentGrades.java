// 16.	The following definition of the StudentGrades class allows the storage of a student's grades.
//         public class StudentGrades {

//             String studentName;
//             double[] grades;

//             StudentGrades(String name, double[] grades) {
//                 this.studentName = name;
//                 this.grades = grades;
//             }
//         }
// Complete the class with methods that:
//     a.	calculates of the lowest grade
//     b.	calculates of the highest grade
//     c.	calculates of the number of grades
//     d.	calculates of the grade point average
//     e.	displays student’s record with student’s name, a list of the student's grades, number of grades,
//         lowest grade, highest grade, and grade point average
// Then, write a program that creates grades for two students:
//     f.	Amanda: 3.5, 4.5, 4.0, 2.0, 5.0, 3.5, 3.5
//     g.	James: 2.0, 3.0, 2.0, 4.5, 4.5
// Tip: pass student's grades to the constructor, as an array.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class StudentGrades {

    String studentName;
    double[] grades;

    StudentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
    }

    // 17.	Add the constructor StudentGrades(String name, int numberOfGrades) to the StudentGrade class,
    // which allows you to randomly create the given number of student grades.
    // Tip: use the random number generator, which is available in the Random class. See the manual for more information.

    StudentGrades(String name, int numberOfGrades) {
        this.studentName = name;
        this.grades = new double[numberOfGrades];
        Random random = new Random();
        for (int i = 0; i < numberOfGrades; i++) {
            grades[i] = (double) random.nextInt(4, 11) / 2;
        }
    }

    // 18.	Add the constructor StudentGrades(String name) that allows you to enter student’s grades from the keyboard.
    // Tip: use the Scanner class. See the course textbook for more information.
 
    StudentGrades(String name) {
        this.studentName = name;
        Scanner in = new Scanner(System.in);
        int numberOfGrades;
        System.out.print("How many grades do you want to input?: ");
        numberOfGrades = in.nextInt();
        this.grades = new double[numberOfGrades];
        for (int i = 0; i < numberOfGrades; i++) {
            System.out.print("Input a grade: ");
            grades[i] = in.nextDouble();
        }
        in.close();
    }

    double lowestGrade() {
        double min = grades[0];

        for (double g: grades) {
            if (g < min) {
                min = g;
            }
        }

        return min;
    }

    double highestGrade() {
        double max = grades[0];

        for (double g: grades) {
            if (g > max) {
                max = g;
            }
        }

        return max;
    }

    int numberOfGrades() {
        return grades.length;
    }

    double gradePointAverage() {
        double sum = 0;
        for (double g: grades) {
            sum += g;
        }
        return (double) Math.round(sum * 100 / numberOfGrades()) / 100;
    }

    void displayRecord() {
        System.out.println("Name:\t\t\t" + studentName);
        System.out.println("List of grades:\t\t" + Arrays.toString(grades));
        System.out.println("Number of grades:\t" + numberOfGrades());
        System.out.println("Lowest grade:\t\t" + lowestGrade());
        System.out.println("Highest grade:\t\t" + highestGrade());
        System.out.println("Grade point average:\t" + gradePointAverage());
        System.out.println("-----");
    }
}