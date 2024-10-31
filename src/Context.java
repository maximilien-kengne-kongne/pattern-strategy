import java.util.Arrays;

public class Context {

    private SortStrategy sortStrategy = new SortMergeImpl();

    public void sort() {

        int[] numbersArray = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("input data " + Arrays.toString(numbersArray));
        System.out.println("output data " + Arrays.toString(sortStrategy.sort(numbersArray)));;
    }

    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }
}
