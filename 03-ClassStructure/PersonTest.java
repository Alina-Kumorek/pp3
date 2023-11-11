public class PersonTest {
    public static void main (String[] args) {
        Person p1 = new Person("Jane", 65, 164);
        p1.displayRecord();

        Person p2 = new Person("Peter", 60, 185);
        p2.displayRecord();

        Person p3 = new Person("Anne");
        p3.setWeightAndHeight(80, 170);
        p3.displayRecord();
    }
}
