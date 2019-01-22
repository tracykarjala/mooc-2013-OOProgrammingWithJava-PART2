package moving.domain;

import java.util.ArrayList;
import java.util.List;

public class Box implements Thing {
    private List<Thing> contents;
    private int maximumCapacity;

    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.contents = new ArrayList<Thing>();
    }

    public boolean addThing(Thing thing) {
        if (thing.getVolume() + getVolume() <= maximumCapacity) {
            contents.add(thing);
            return true;
        }
        return false;
    }

    @Override
    public int getVolume() {
        int currentVolume = 0;
        for (Thing thing : contents) {
            currentVolume += thing.getVolume();
        }
        return currentVolume;
    }

    @Override
    public String toString() {
        return "  things in the box: " + getVolume() + " dm^3";
    }
}