import java.io.File;
import java.util.Scanner;

public class Printer {
    private File file;
    private Scanner reader;

    public Printer(String filename) {
        this.file = new File(filename);
        this.reader = null;
    }

    public void printLinesWhichContain(String word) throws Exception {
        this.reader = new Scanner(file, "UTF-8");
        boolean allLines = false;
        if (word.isEmpty()) {
            allLines = true;
        }
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            if (allLines) {
                System.out.println(line);
            } else {
                if (line.contains(word)) {
                    System.out.println(line);
                }
            }
        }
        reader.close();
    }
}
