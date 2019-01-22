import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Thing> things;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.things = new ArrayList<Thing>();
        this.maxWeight = maxWeight;
    }

    public void addThing(Thing thing) {
        if (thing.getWeight() + totalWeight() <= maxWeight) {
            things.add(thing);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Thing thing: things) {
            totalWeight += thing.getWeight();
        }
        return totalWeight;
    }

    public void printThings() {
        System.out.println("Your suitcase contains the following things:");
        for (Thing thing: things) {
            System.out.println(thing.getName() + " (" + thing.getWeight() + " kg)");
        }
    }

    public Thing heaviestThing() {
        if (things.size() == 0) {
            return null;
        } else {
            Thing heaviest = things.get(0);
            for (Thing thing: things) {
                if (thing.getWeight() > heaviest.getWeight()) {
                    heaviest = thing;
                }
            }
            return heaviest;
        }
    }

    @Override
    public String toString() {
        String word = "";
        if (things.size() == 0) {
            word = "empty";
        } else if (things.size() == 1) {
            word = "1 thing";
        } else {
            word = things.size() + "things ";
        }
        return word +"(" + totalWeight() + " kg)";
    }
}
