import java.util.ArrayList;

public class Changer {
    private ArrayList<Change> changeList;

    public Changer() {
        this.changeList = new ArrayList<Change>();
    }

    public void addChange(Change change) {
        changeList.add(change);
    }

    public String change(String characterString) {
        String myString = characterString;
        for (Change change: changeList) {
            myString = change.change(myString);
        }
        return myString;
    }
}
