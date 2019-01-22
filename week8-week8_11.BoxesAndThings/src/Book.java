public class Book implements ToBeStored {
    private String name;
    private String writer;
    private double weight;

    public Book(String writer, String name, double weight) {
        this.name = name;
        this.writer = writer;
        this.weight = weight;
    }

    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return writer + ": " + name;
    }
}
