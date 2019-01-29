package farmsimulator;

import java.util.Collection;

public class Barn {
    private BulkTank bulkTank;
    private MilkingRobot milkingRobot;

    public Barn(BulkTank bulkTank) {
        this.bulkTank = bulkTank;
    }

    public void installMilkingRobot(MilkingRobot milkingRobot) {
        this.milkingRobot = milkingRobot;
        milkingRobot.setBulkTank(bulkTank);
    }

    public BulkTank getBulkTank() {
        return bulkTank;
    }

    public MilkingRobot getMilkingRobot() {
        return milkingRobot;
    }

    public void takeCareOf(Cow cow) {
        if (getMilkingRobot() == null) {
            noMilkingRobot();
        } else {
            milkingRobot.milk(cow);
        }
    }

    public void takeCareOf(Collection<Cow> cows) {
        if (getMilkingRobot() == null) {
            noMilkingRobot();
        } else {
           for (Cow cow : cows) {
               milkingRobot.milk(cow);
           }
        }

    }

    public void noMilkingRobot() {
        throw new IllegalStateException("MilkingRobot has not been installed");
    }

    @Override
    public String toString() {
        return "Barn: " + bulkTank;
    }
}
