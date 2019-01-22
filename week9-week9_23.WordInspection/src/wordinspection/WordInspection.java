package wordinspection;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordInspection {
    private File file;
    private List<String> fileList;


    public WordInspection(File file) throws Exception {
        this.file = file;
        Scanner reader = new Scanner (file, "UTF-8");
        this.fileList = new ArrayList<String>();
        while (reader.hasNextLine()) {
            fileList.add(reader.nextLine());
        }
    }

    public int wordCount() {
        return fileList.size();
    }

    public List<String> wordsContainingZ() {
        List<String> zList = new ArrayList<String>();
        for (String word : fileList) {
            if (word.contains("z")) {
                zList.add(word);
            }
        }
        return zList;
    }

    public List<String> wordsEndingInL() {
        List<String> endList = new ArrayList<String>();
        for (String word : fileList) {
            if (word.endsWith("l")) {
                endList.add(word);
            }
        }
        return endList;
    }

    public List<String> palindromes() {
        List<String> palindromes = new ArrayList<String>();
        for (String word : fileList) {
            if (word.equals(reverseString(word))) {
                palindromes.add(word);
            }
        }
        return palindromes;
    }

    public List<String> wordsWhichContainAllVowels() {
        List<String> vowelWords = new ArrayList<String>();
        char[] vowelArray = "aeiouyäö".toCharArray();
        for (String word : fileList) {
            boolean toAdd = true;
            for (int i = 0; i < vowelArray.length; i++) {
                Character letter = vowelArray[i];
                String l = letter.toString();
                if (!word.contains(l)) {
                    toAdd = false;
                    break;
                }
            }
            if (toAdd) {
                vowelWords.add(word);
            }
        }
        return vowelWords;
    }

    public String reverseString(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }
        return reversed;
    }
}
