import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AufgabenArrayList {

    public static void main (String[] args){
  

        // 1 Aufgabe

        ArrayList<Double> list = new ArrayList<>();

        list.add(23.05);
        list.add(50.9);
        list.add(12.5);
        list.add(10.0);
        list.add(-5.4);
        // list.add((double)-45); // int -> double casting

        double sum = 0;
        for (double item: list){
            sum += item;
        }

        System.out.println("Die Summe aller Zahlen ist: " + sum);


        //2 Aufgabe

        // ArrayList<Integer> scores = new ArrayList<>();

        // scores.add(850);
        // scores.add(1200);
        // scores.add(430);
        // scores.add(975);
        // scores.add(1500);
        // scores.add(620);

        // System.out.println(("Liste Unsortiert: " + scores));

        // Collections.sort(scores);
        // System.out.println(("Aufsteigend sortiert: " + scores));
   
        // Collections.reverse(scores);
        // // Collections.sort(scores, Comparator.reverseOrder());
        // System.out.println(("Absteigend sortiert: " + scores));

        // int value = scores.get(3);
        // int index = scores.indexOf(850);

        // System.out.println("Index von " + value + " (absteigend): " + index);
        
        // scores.set(3, 900);
        // System.out.println("Nach set(): " + scores);












    }
    
}
