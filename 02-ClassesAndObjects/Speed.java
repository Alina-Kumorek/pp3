// 22.	The speed of vehicles on a highway in Poland must be between 40 and 140 km/h.
// Write a program that checks whether the vehicle speed saved in a variable is correct.
public class Speed {
     public static void main(String[] args) {
          int vechSpeed = 158;
          int maxSpeed = 140;
          int minSpeed = 40;

          String check = vechSpeed >= minSpeed && vechSpeed <= maxSpeed ? "True" : "False";

          System.out.println("Vehicle speed:\t" + vechSpeed);
          System.out.println("Speed is valid:\t" + check);
     }
}
