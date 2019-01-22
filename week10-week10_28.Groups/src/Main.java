import movable.Group;
import movable.Organism;

public class Main {

    public static void main(String[] args) {
        // test your program here
        Group group = new Group();
        group.addToGroup(new Organism(5, 10));
        group.addToGroup(new Organism(2,8));
        group.move(0, 1);
        group.move(8, -3);
        group.move(11, 1);
        group.toString();
    }
}
