package containers;

import java.util.ArrayList;
import java.util.List;

public class ContainerHistory {
    private List<Double> history;

    public ContainerHistory() {
        this.history = new ArrayList<Double>();
    }

    public void add(double situation) {
        history.add(situation);
    }

    public void reset() {
        history.clear();
    }

    public double maxValue() {
        double max = history.get(0);
        for (double number : history) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public double minValue() {
        double min = history.get(0);
        for (double number : history) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public double average() {
        if (history.isEmpty()) {
            return 0;
        }
        double total = 0;
        for (double number : history) {
            total += number;
        }
        return total / history.size();
    }

    public double greatestFluctuation() {
        if (history.isEmpty() | history.size() == 1) {
            return 0;
        }
        double priorNumber = history.get(0);
        double fluctuation = 0.0;
        for (double number : history) {
            if (Math.abs(number - priorNumber) > fluctuation) {
                fluctuation = Math.abs(number - priorNumber);
            }
            priorNumber = number;
        }
        return fluctuation;
    }

    public double variance() {
        if (history.isEmpty() || history.size() == 1) {
            return 0;
        }
        double average = average();
        double total = 0.0;
        for (double number : history) {
            total += Math.pow(number - average, 2);
        }
        return total / (history.size() - 1);
    }

    @Override
    public String toString() {
        return String.valueOf(history);
    }
}
