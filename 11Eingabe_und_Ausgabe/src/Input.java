

import java.io.FileReader;
import java.io.IOException;

public class Input {
    public static void main(String[] args) throws IOException {
        String path = "./output.txt";
        FileReader nameOfNewReader = new FileReader(path);
        int data = 0;
        while ((data = nameOfNewReader.read()) != -1) {
            System.out.print((char) data);
        }
        nameOfNewReader.close();
    }
}
