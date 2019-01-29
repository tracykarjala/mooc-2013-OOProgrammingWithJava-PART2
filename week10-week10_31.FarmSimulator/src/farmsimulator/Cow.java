package farmsimulator;

import java.util.Random;

public class Cow implements Alive, Milkable {
    private String name;
    private double amount;
    private double capacity;
    private Random random = new Random();

    public Cow() {
        this.name = NAMES[random.nextInt(NAMES.length)];
        this.amount = 0.0;
        this.capacity = 25 + (random.nextDouble() * (30 - 25));

    }

    public Cow(String name) {
        this.name = name;
        this.amount = 0.0;
        this.capacity = 25 + (random.nextDouble() * (30 - 25));
    }

    @Override
    public void liveHour() {
        double hourAmount = 0.7 + (random.nextDouble() * (2.0 - 0.7));
        if (hourAmount + amount > capacity) {
            amount = capacity;
        } else {
            amount += hourAmount;
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public double milk() {
        double milkAmount = amount;
        amount = 0.0;
        return milkAmount;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return name + " " + Math.ceil(amount) + "/" + Math.ceil(capacity);
    }

    private static final String[] NAMES = new String[]{
            "Anu", "Arpa", "Essi", "Heluna", "Hely",
            "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
            "Jaana", "Jami", "Jatta", "Laku", "Liekki",
            "Mainikki", "Mella", "Mimmi", "Naatti",
            "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
            "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
}
