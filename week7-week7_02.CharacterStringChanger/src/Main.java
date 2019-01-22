public class Main {
    public static void main(String[] args) {
        // Test your program here
        Changer test = new Changer();
        test.addChange(new Change('a', 'o'));
        test.addChange(new Change('n', 't'));
        System.out.println(test.change("banana"));

    }
}
