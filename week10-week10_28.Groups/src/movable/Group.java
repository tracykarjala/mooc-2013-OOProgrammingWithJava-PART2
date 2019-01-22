package movable;

import java.util.ArrayList;
import java.util.List;

public class Group implements Movable {
    private List<Movable> movables;

    public Group() {
        this.movables = new ArrayList<Movable>();
    }

    public void addToGroup(Movable movable) {
        movables.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable movable : movables) {
            movable.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String outputString = "";
        for (Movable movable : movables) {
            outputString += movable.toString() +"\n";
        }
        return outputString;
    }
}
