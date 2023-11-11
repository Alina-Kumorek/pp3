// 21.	Define a MyArrays class that contains two static methods: odd(int[] array),
// which returns the number of positive odd values in the array, and above(int[] array),
// which returns the sum of the numbers in the array that are greater than the arithmetic mean of the array elements.
// Sample result:
//         arr1 = {3,2,-5,4,1,-7}
//         arr2 = {5,2,7,4,2}
//         MyArrays.odd(arr1) returns 2
//         MyArrays.above(arr2) returns 12

public class MyArrays {
    public static int odd(int[] array) {
        int count = 0;
        for (int a: array) {
            if (a > 0 && a % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static int above(int[] array) {
        int sum = 0;
        for (int a: array) {
            sum += a;
        }
        double mean = sum / array.length;
        sum = 0;
        for (int a: array) {
            if (a > mean) {
                sum += a;
            }
        }
        return sum;
    }
}