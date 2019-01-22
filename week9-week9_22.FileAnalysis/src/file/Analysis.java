package file;

import java.io.File;
import java.util.Scanner;

public class Analysis {
    private File file;
    private Scanner reader;

    public Analysis(File file) {
        this.file = file;
    }

    public int lines() throws Exception {
        reader = new Scanner(file);
        int numLines = 0;
        while (reader.hasNextLine()) {
            numLines++;
            reader.nextLine();
        }
        reader.close();
        return numLines;
    }

    public int characters() throws Exception {
        reader = new Scanner(file);
        String thisFile = "";
        while (reader.hasNextLine()) {
            thisFile += reader.nextLine() + "\n";
        }
        reader.close();
        return thisFile.length();
    }
}
