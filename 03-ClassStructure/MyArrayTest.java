import java.util.Arrays;

public class MyArrayTest {
    public static void main(String[] args) {
        int[] array1 = {2, -3, 4, 6, 3, 1, 8};
        int[] array2 = {2, -3, 4};
        int[] array3 = {2, -3, 4, 6, 3, 1, 8};
        int[] array4 = {2, -3, 6, 6, 3, 1, 8};
        int[][] array5 = {{2, 3, 4}, {4, 3, 1}, {8, 6, 2}};
        System.out.println(MyArray.even(array1));
        System.out.println(MyArray.positiveOdd(array1));
        System.out.println(Arrays.toString(MyArray.reverse(array1)));
        System.out.println(MyArray.compare(array1, array4));
        System.out.println(Arrays.toString(MyArray.different(array1, array2)));
        System.out.println(MyArray.exist(2, array3));
        System.out.println(MyArray.secondMax(array3));
        System.out.println(MyArray.lastColumn(array5));
        int[][] array6 = MyArray.swap(array5);
        for (int[] a: array6) {
            System.out.println(Arrays.toString(a));
        }
        System.out.println(Arrays.toString(MyArray.two2one(array5)));
    }
}
