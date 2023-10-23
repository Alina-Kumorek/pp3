public class Counter {
    int initialValue = 0;
    int value = initialValue;

    void incOne() {
        value ++;
    }

    void decOne() {
        value --;
    }

    void incTen() {
        value += 10;
    }

    void decTen() {
        value -= 10;
    }

    void reset() {
        value = initialValue;
    }
}