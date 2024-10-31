public class Main {
    public static void main(String[] args) {
        System.out.println("***** Welcome to sort App! *****");

        Context context = new Context();
        context.sort();

        context.setSortStrategy(new SortBubbleImpl());
        context.sort();

        context.setSortStrategy(new SortInsertImpl());
        context.sort();
    }
}