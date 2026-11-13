
import java.io.FileWriter;
import java.io.IOException;

public class Output {
  public static void main(String[] args) throws IOException {
    // declare new FileWriter
    FileWriter nameOfWriter = new FileWriter("output.txt");
    // declare statement

    String outputText = "It's nice to learn Java!";
    // write content to the file
    nameOfWriter.write(outputText);
    nameOfWriter.close();

  }
}
