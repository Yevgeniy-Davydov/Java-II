import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        String word = "Programmierung";


        Scanner scanner = new Scanner(System.in);
        System.out.print("Gib eine Buchstabe ein: ");
        char letter = scanner.next().charAt(0);

        int counter = amountOfLetters(word, letter);
        System.out.printf("'%s' in \"Programmierung\": %d", letter, counter);


    }
    public static int amountOfLetters(String text, char letter){
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == (letter)){
                counter ++;

            }

        }
            return counter;
    }
}
