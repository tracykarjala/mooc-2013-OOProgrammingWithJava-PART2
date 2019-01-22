import java.util.ArrayList;

public class Container {
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;

    public Container(int maxWeight) {
        this.suitcases = new ArrayList<Suitcase>();
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() + totalWeight() <= maxWeight) {
            suitcases.add(suitcase);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Suitcase suitcase: suitcases) {
            totalWeight += suitcase.totalWeight();
        }
        return totalWeight;
    }

    public void printThings() {
        System.out.println("There are the following things in the container suitcases:");
        for (Suitcase suitcase: suitcases) {
            suitcase.printThings();
        }
    }

    @Override
    public String toString() {
        String word = "";
        if (suitcases.size() == 0) {
            word = "empty";
        } else if (suitcases.size() == 1) {
            word = "1 suitcase";
        } else {
            word = suitcases.size() + "suitcases ";
        }
        return word +"(" + totalWeight() + " kg)";
    }
}
