public class Change {
    private char fromCharacter;
    private char toCharacter;

    public Change(char fromCharacter, char toCharacter) {
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }

    public String change(String characterString) {
        char[] stringArray = characterString.toCharArray();
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i] == fromCharacter) {
                stringArray[i] = toCharacter;
            }
        }
        return String.valueOf(stringArray);
    }
}
