// 23.	A bank buys and sells Euro. Write a program that, based on the Euro buying and selling rates saved in variables,
// calculates the difference between the buying and selling rates (spread).
// Display result with 4 decimal places (you can use printf() method).
public class Bank {
    public static void main(String[] args) {
        float buyEu = 4.4080f;
        float sellEu = 4.4970f;

        float spread = sellEu - buyEu;

        System.out.printf("Bank buys EUR:\t%.4f\n", buyEu);
        System.out.printf("Bank sells EUR:\t%.4f\n", sellEu);
        System.out.printf("Spread:\t%.4f\n", spread);
    }
}
