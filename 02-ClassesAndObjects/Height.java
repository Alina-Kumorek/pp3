public class Height {
    
    public static void main(String[] args) {
        int heightCM = 164;
        int heightFeet = (int) (heightCM / 30.48f);
        // zaokrąglić te inch
        float heightInch = (heightCM - heightFeet * 30.48f) / 2.54f;

        System.out.println("I am " + heightCM + "cm tall, i.e. " + heightFeet + " feet and " + heightInch + "inches");
    }
}
