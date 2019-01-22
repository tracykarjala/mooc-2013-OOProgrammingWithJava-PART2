import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    private HashMap<String, String> dict;

    public Dictionary() {
        this.dict = new HashMap<String, String>();
    }

    public void add(String word, String translation) {
        dict.put(word, translation);
    }

    public String translate(String word) {
        if (dict.containsKey(word)) {
            return dict.get(word);
        }
        return null;
     }

     public int amountOfWords() {
        return dict.size();
     }

     public ArrayList<String> translationList() {
        ArrayList<String> translations = new ArrayList<String>();
        for (String key : dict.keySet()) {
            translations.add(key + " = " + dict.get(key));
        }
        return translations;
     }
}
