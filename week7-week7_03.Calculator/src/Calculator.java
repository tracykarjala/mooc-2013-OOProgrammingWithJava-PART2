public class Calculator {
    private Reader reader;
    private int numCalculations;

    public Calculator() {
        this.reader = new Reader();
        this.numCalculations = 0;
    }

    private void sum() {
        int[] values = getValues();
        System.out.println("sum of the values " + (values[0] + values[1]));
        numCalculations++;
    }

    private void product() {
        int[] values = getValues();
        System.out.println("product of the values " + (values[0] * values[1]));
        numCalculations++;
    }

    private void difference() {
        int[] values = getValues();
        System.out.println("difference of the values " + (values[0] - values[1]));
        numCalculations++;
    }

    private void statistics() {
        System.out.println("Calculations done " + numCalculations);
    }

    private int[] getValues() {
        int[] valueArray = new int[2];
        System.out.print("value1: ");
        valueArray[0] = reader.readInteger();
        System.out.print("value2: ");
        valueArray[1] = reader.readInteger();
        return valueArray;
    }

    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }
}
