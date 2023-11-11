// 18.	Define a class Counter that allows you to create a counter of integer type.
// The initial value of the counter is 0.
// The class includes an increase() method that increases the value of the counter by 1
// and a decrease() method that decreases the value of the counter by 1.
// Also create the overloaded methods increase(int n) and decrease(int n)
// that allow you to increase or decrease the value of the counter by the value of n.
// Add a value() method in the class that returns a counter value. Sample result:
//         Counter c = new Counter()
//         c.value() returns 0
//         c.increase()
//         c.increase()
//         c.decrease()
//         c.increase(5)
//         c.decrease(2)
//         c.value() returns 4

public class Counter {
    private int value;

    public Counter() {
        this.value = 0;
    }

    public void increase() {
        value++;
    }

    public void increase(int n) {
        value += n;
    }

    public void decrease() {
        value--;
    }

    public void decrease(int n) {
        value -= n;
    }

    public int value() {
        return value;
    }
}
