// 29.	Design a simple counter. The initial value of the counter is 0.
// The counter can be increased or decreased by one, and increased and decreased by 10.
// It is possible to reset the counter to its initial value. Then, define a class for counters with five methods.
// Based on the class definition, create two counters. Finally, using the defined methods,
// set the value for the first counter to 23 and for the second one to -47. Display results.

public class CounterTest {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();

        c1.incTen();
        c1.incTen();
        c1.incOne();
        c1.incOne();
        c1.incOne();

        for (int i = 0; i < 5; i++) {c2.decTen();}
        for (int i = 0; i < 3; i++) {c2.incOne();}

        System.out.println("Counter 1:\t" + c1.value);
        System.out.println("Counter 2:\t" + c2.value);
    }
}