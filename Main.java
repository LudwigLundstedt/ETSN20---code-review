import java.io.FileReader;
import java.io.IOException;

public class Main {

  public static void main(String[] args) {
    String wordToFind = args[0];
    String textFile = args[1];

    try {
      FileReader fr = new FileReader(textFile);
      int c;
      String rowSentence = "";

      while ((c = fr.read()) != -1) {
        char ch = (char) c;
        rowSentence += ch;

        if (c == 10) {
          if (rowSentence.contains(wordToFind)) {
            System.out.println(rowSentence);
          }
          rowSentence = "";
        }
      }

      fr.close();

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}