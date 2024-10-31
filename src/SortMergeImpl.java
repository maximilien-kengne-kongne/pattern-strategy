public class SortMergeImpl implements SortStrategy {

    @Override
    public int[] sort(int[] array) {
        System.out.println("running sort merge implementation");

        int n = array.length;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (array[i] > array[i + 1]) {

                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);

        return array;
    }

}
