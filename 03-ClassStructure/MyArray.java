// 13.	Define a MyArray class with some static methods.
// Then, write a program in which use all defined methods. Display results.

public class MyArray {
    // a.	even(int[] array) that returns the number of even values in the array
    static int even(int[] array) {
        int count = 0;
        for (int a: array) {
            if (a % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    // b.	positiveOdd(int[] array) that returns the number of positive odd numbers in the array
    static int positiveOdd(int[] array) {
        int count = 0;
        for (int a: array) {
            if (a % 2 != 0 && a > 0) {
                count++;
            }
        }
        return count;
    }

    // c.	reverse(int[] array) that returns the array in reverse order
    static int[] reverse(int[] array) {
        int n = array.length;
        int[] rev = new int[n];
        for (int i = 0; i < n; i++) {
            rev[i] = array[n - i - 1];
        }
        return rev;
    }

    // d.	compare(int[] array1, int[] array2) that returns ‘ture’ if both arrays are identical or ‘false’ otherwise
    static boolean compare(int[] array1, int[] array2) {
        boolean isIdentical = true;
        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    isIdentical = false;
                    break;
                }
            }
        } else {
            isIdentical = false;
        }
        return isIdentical;
    }

    // e.	different(int[] array1, int[] array2) that returns numbers from the first array that do not appear in the second array
    static int[] different(int[] array1, int[] array2) {
        int[] dif;
        int count = 0;
        for (int a: array1) {
            for (int b: array2) {
                if (a == b) {
                    count++;
                    break;
                }
            }
        }

        if (count > 0) {
            dif = new int[count];
            int i = 0;
            for (int a: array1) {
            for (int b: array2) {
                if (a == b) {
                    dif[i] = a;
                    i++;
                    break;
                }
            }
        }
        }   else {
            dif = new int[0];
        }

        return dif;
    }

    // f.	exist(int number, int[] array) that returns ‘true’ if the number is present in the array or ‘false’ otherwise
    static boolean exist(int number, int[] array) {
        boolean isPresent = false;
        for (int a: array) {
            if (a == number) {
                isPresent = true;
                break;
            }
        }
        return isPresent;
    }

    // g.	secondMax(int[] array) that returns the second largest number in the array
    static int secondMax(int[] array) {
        int max = array[0];
        for (int a: array) {
            if (a > max) {
                max = a;
            }
        }
        int sMax = max;
        for (int a: array) {
            if (a != max) {
                sMax = a;
                break;
            }
        }
        if (sMax != max) {
            for (int a: array) {
                if (a < max && a > sMax) {
                    sMax = a;
                }
            }
        }
        return sMax;
    }

    // h.	lastColumn(int[][] array) that returns the sum of values in the last column
    static int lastColumn(int[][] array) {
        int sum = 0;
        for (int[] row: array) {
            sum += row[row.length - 1];
        }
        return sum;
    }

    // i.	swap(int[][] array) that returns the array with the first and last column swapped
    static int[][] swap(int[][] array) {
        int rows = array.length;
        int columns = array[0].length;
        int[][] swapped = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (j == 0) {
                    swapped[i][columns - 1] = array[i][j];
                } else if (j == columns - 1) {
                    swapped[i][0] = array[i][j];
                } else {
                    swapped[i][j] = array[i][j];
                }
            }
        }
        return swapped;
    }

    // j.	two2one(int[][] array) that returns the 2D array converted to 1D array
    static int[] two2one(int[][] array) {
        int[] oneD = new int[array.length * array[0].length];
        int count = 0;
        for (int[] a: array) {
            for (int i: a) {
                oneD[count] = i;
                count++;
            }
        }
        return oneD;
    }
}