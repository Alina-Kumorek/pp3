public class StatisticsTest {
    public static void main(String[] args) {
        int[] range = {5, 6, 7, 8, 9, 10};
        System.out.println("Range:\t<5,10>");
        System.out.println("Number:\t" + Statistics.number(range));
        System.out.println("Sum:\t" + Statistics.sum(range));
        System.out.println("Mean:\t" + Statistics.mean(range));
    }
}
