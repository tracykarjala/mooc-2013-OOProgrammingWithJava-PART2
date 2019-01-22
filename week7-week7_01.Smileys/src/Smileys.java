
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        // printWithSmileys("Method");
        // printWithSmileys("Beerbottle");
        // printWithSmileys("Interface");
        // printWithSmileys("dog");
        // System.out.println(smileyLine(5));
    }

    private static void printWithSmileys(String word) {
        if (word.length() % 2 == 1) {
            word += " ";
        }
        word = " " + word + " ";
        System.out.println(smileyLine((word.length() / 2) + 2));
        System.out.println(":)" + word + ":)");
        System.out.println(smileyLine((word.length() / 2) + 2));
    }

    private static String smileyLine(int numSmileys) {
        String smiley = ":)";
        String smileyLine = "";
        for (int i = 1; i <= numSmileys; i++) {
            smileyLine += smiley;
        }
        return smileyLine;
    }

}
