package moving.logic;

import moving.domain.Box;
import moving.domain.Thing;

import java.util.ArrayList;
import java.util.List;

public class Packer {
    private int boxesVolume;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }

    public List<Box> packThings(List<Thing> things) {
        List<Box> boxList = new ArrayList<Box>();
        boxList.add(new Box(boxesVolume));
        for (Thing thing : things) {
            boolean added = false;
            for (Box box : boxList) {
                if (box.addThing(thing)) {
                    added = true;
                    break;
                }
            }
            if (!added) {
                Box newBox = new Box(boxesVolume);
                newBox.addThing(thing);
                boxList.add(newBox);
            }
        }
        return boxList;
    }
}
