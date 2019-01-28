package containers;

import java.sql.Array;

public class ProductContainerRecorder extends ProductContainer {
    private ContainerHistory history;

    public ProductContainerRecorder(String productName, double tilavuus, double initialVolume) {
        super(productName, tilavuus);
        this.history = new ContainerHistory();
        addToTheContainer(initialVolume);
    }

    @Override
    public void addToTheContainer(double amount) {
        super.addToTheContainer(amount);
        history.add(getVolume());
    }

    @Override
    public double takeFromTheContainer(double amount) {
        history.add(getVolume() - amount);
        return super.takeFromTheContainer(amount);
    }

    public void printAnalysis() {
        System.out.println("Product: " + getName());
        System.out.println("History: " + history());
        System.out.println("Greatest product amount: " + history.maxValue());
        System.out.println("Smallest product amount: " + history.minValue());
        System.out.println("Average: " + history.average());
        System.out.println("Greatest change: " + history.greatestFluctuation());
        System.out.println("Variance: " + history.variance());
    }

    public String history() {
        return history.toString();
    }
}
