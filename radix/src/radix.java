public class radix{

    void sort(int[] numbers) {
        int maximumNumber = findMaximumNumberIn(numbers);
        int numberOfDigits = calculateNumberOfDigitsIn(maximumNumber);
        int placeValue = 1;
        while (numberOfDigits-- > 0) {
            applyCountingSortOn(numbers, placeValue);
            placeValue *= 10;
        }
    }


    void applyCountingSortOn(int[] numbers, int placeValue) {

        int range = 10 // decimal system, numbers from 0-9

        // ...

        // calculate the frequency of digits
        for (int i = 0; i < length; i++) {
            int digit = (numbers[i] / placeValue) % range;
            frequency[digit]++;
        }

        for (int i = 1; i < range; i++) {
            frequency[i] += frequency[i - 1];
        }

        for (int i = length - 1; i >= 0; i--) {
            int digit = (numbers[i] / placeValue) % range;
            sortedValues[frequency[digit] - 1] = numbers[i];
            frequency[digit]--;
        }

        System.arraycopy(result, 0, numbers, 0, length);

    }

    public static void main(String[] args) {
        int[] numbers = {387, 468, 134, 123, 68, 221, 769, 37, 7};
        RadixSort.sort(numbers);
        int[] numbersSorted = {7, 37, 68, 123, 134, 221, 387, 468, 769};
        assertArrayEquals(numbersSorted, numbers);

    }
}