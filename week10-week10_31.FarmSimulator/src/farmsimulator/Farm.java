package farmsimulator;

import java.util.ArrayList;
import java.util.Collection;

public class Farm implements Alive {
    private String owner;
    private Barn barn;
    private Collection<Cow> cows;

    public Farm(String owner, Barn barn) {
        this.owner = owner;
        this.barn = barn;
        this.cows = new ArrayList<Cow>();
    }

    public String getOwner() {
        return owner;
    }

    public void addCow(Cow cow) {
        cows.add(cow);
    }

    public void installMilkingRobot(MilkingRobot milkingRobot) {
        barn.installMilkingRobot(milkingRobot);
    }

    @Override
    public void liveHour() {
        for (Cow cow : cows) {
            cow.liveHour();
        }
    }

    public void manageCows() {
        for (Cow cow : cows) {
            barn.takeCareOf(cow);
        }
    }

    @Override
    public String toString() {
        String farmString = "Farm owner: " + owner + "\n" + "Barn bulk tank: " + barn.getBulkTank().toString() + "\n";
        if (cows.isEmpty()) {
            farmString += "No cows.\n";
        } else {
            farmString += "Animals:\n";
            for (Cow cow : cows) {
                farmString += "  " + cow.getName() + "\n";
            }
        }
        return farmString;
    }
}

