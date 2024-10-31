public class SortInsertImpl implements SortStrategy {

    @Override
    public int[] sort(int[] array) {
        System.out.println("running sort insert implementation");
        for (int i = 1; i < array.length; i++) {
            int currentValue = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > currentValue) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = currentValue;
        }

        return array;
    }
}
