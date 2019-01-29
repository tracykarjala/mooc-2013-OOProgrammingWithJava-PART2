package farmsimulator;

public class BulkTank {
    private double capacity;
    private double volume;

    public BulkTank(double capacity) {
        this.capacity = capacity;
        this.volume = 0.0;
    }

    public BulkTank() {
        this.capacity = 2000;
        this.volume = 0.0;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getVolume() {
        return volume;
    }

    public double howMuchFreeSpace() {
        return capacity - volume;
    }

    public void addToTank(double amount) {
        if (amount + volume > capacity) {
            volume = capacity;
        } else {
            volume += amount;
        }
    }

    public double getFromTank(double amount) {
        if (volume - amount < 0.0) {
            double returned = volume;
            volume = 0.0;
            return returned;
        } else {
            volume -= amount;
            return amount;
        }
    }

    @Override
    public String toString() {
        return String.valueOf(Math.ceil(volume)) + "/" + String.valueOf(Math.ceil(capacity));
    }
}
