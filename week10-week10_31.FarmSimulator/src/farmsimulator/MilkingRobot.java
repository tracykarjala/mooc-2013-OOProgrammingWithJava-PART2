package farmsimulator;

public class MilkingRobot {
    private BulkTank bulkTank;

    public MilkingRobot() {
    }

    public void setBulkTank(BulkTank bulkTank) {
        this.bulkTank = bulkTank;
    }

    public BulkTank getBulkTank() {
        return bulkTank;
    }

    public void milk(Milkable milkable) {
        if (getBulkTank() == null) {
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        }
        bulkTank.addToTank(milkable.milk());
    }
}
