import java.util.ArrayList;

public class Box implements ToBeStored {
    private double maxWeight;
    private ArrayList<ToBeStored> contents;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.contents = new ArrayList<ToBeStored>();
    }

    public void add(ToBeStored item) {
        if (item.weight() + this.weight() <= maxWeight) {
            contents.add(item);
        }
    }

    public double weight() {
        double weight = 0.0;
        for (ToBeStored item : contents) {
            weight += item.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + contents.size() + " things, total weight " + this.weight() + " kg";
    }
}
