import java.util.HashMap;

public class PromissoryNote {
    private HashMap<String, Double> loans;

    public PromissoryNote() {
        this.loans = new HashMap<String, Double>();
    }

    public void setLoan(String toWhom, double value) {
        loans.put(toWhom, value);
    }

    public double howMuchIsTheDebt(String whose) {
        if (this.loans.containsKey(whose)) {
            return this.loans.get(whose);
        }
        return 0;
    }
}
