package synchronised;

class DataHolder {
    private int value = 0;

    public int getValue() {
        return value;
    }

    public synchronized void increment() {
        this.value++;
    }
}
