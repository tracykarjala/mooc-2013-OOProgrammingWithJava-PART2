package tools;

import java.util.HashSet;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover {
    private Set<String> strings;
    private int numDuplicates;

    public PersonalDuplicateRemover() {
        this.strings = new HashSet<String>();
        this.numDuplicates = 0;
    }

    @Override
    public void add(String characterString) {
        if (strings.contains(characterString)) {
            numDuplicates++;
        }
        strings.add(characterString);
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return numDuplicates;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return strings;
    }

    @Override
    public void empty() {
        numDuplicates = 0;
        strings.clear();
    }
}
