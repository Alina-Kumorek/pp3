// 12.	Create a library of methods for the calculation of basic statistics:
//     a.	Number of items within the specified range <x,y>
//     b.	Sum of numbers in the given range  <x,y>
//     c.	Arithmetic mean of the numbers in the given range  <x,y>
// Then create a program that calculates and displays the basic statistics for integers in the range <5,10>

public class Statistics {
    static int number(int[] range) {
        return range.length;
    }

    static int sum(int[] range) {
        int sum = 0;
        for (int r : range) {
            sum += r;
        }
        return sum;
    }

    static float mean(int[] range) {
        return (float) sum(range) / (float) number(range);
    }
}
