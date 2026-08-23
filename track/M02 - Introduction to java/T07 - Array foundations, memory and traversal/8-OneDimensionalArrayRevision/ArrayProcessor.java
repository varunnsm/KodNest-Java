
class ArrayProcessor {

    int calculateTotal(int[] values) {
        int total = 0;
        for (int value : values) {
            total = total + value;
        }
        return total;
    }

    void increaseOddValues(int[] values) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 != 0) {
                values[i] = values[i] + 1;
            }
        }
    }
}
