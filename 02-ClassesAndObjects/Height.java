// 21.	A variable contains your height in cm.
// Write a program that calculates and displays your height both in cm and in feet and inches.
public class Height {
    public static void main(String[] args) {
        int heightCm = 164;
        int heightFeet = (int) (heightCm / 30.48f);
        int heightInch = Math.round((heightCm - heightFeet * 30.48f) / 2.54f);

        System.out.println("I am " + heightCm + " cm tall, i.e. " + heightFeet + " feet and " + heightInch + " inches");
    }
}