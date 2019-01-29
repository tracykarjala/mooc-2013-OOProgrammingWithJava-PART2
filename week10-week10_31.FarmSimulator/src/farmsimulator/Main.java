package farmsimulator;

public class Main {
    public static void main(String[] args) {
        // Test your program here
        BulkTank bulkTank = new BulkTank();
        Barn barn = new Barn(bulkTank);
        System.out.println(barn.getBulkTank());
        MilkingRobot milkingRobot = new MilkingRobot();
        milkingRobot.setBulkTank(bulkTank);
        System.out.println(barn.getMilkingRobot());

    }
}
