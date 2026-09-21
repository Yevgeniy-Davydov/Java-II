
import java.util.Arrays;
import java.util.Scanner;

public class AufgabenArrays {
    public static void main(String[] args) {
        
    // 1 Aufgabe

    // String[] colors = {"Rot", "Blau", "Gruen"};
   
    // for (int i = 0; i < colors.length; i++){

    //     System.out.printf("Index %d: %s%n", i, colors[i]);
    // }

    // 2 Aufgabe

    // int[] numbers = {2, 4, 6, 8, 10};
    // int sum = 0;

    // for (int i = 0; i < numbers.length; i++){
    //     sum += numbers[i];
    // }
    
    // System.out.println("Die Summe aus allen Elementen ist " + sum);

    //3 Aufgabe

//     while(true){
//     Scanner scanner = new Scanner(System.in);

//     System.out.print("Bitte gib einen Namen ein: ");
//     String nameFromInput = scanner.next();

//     String[] names = {"Anna", "Max", "Tom", "Lisa"};
//     Boolean isFound = false;

//     for (String name : names){
//         if(name.equals(nameFromInput)){
//             isFound = true;
//         }
//     }
//     if(isFound){
//         System.out.printf("%s wurde im Array gefunden", nameFromInput);
//         System.out.println("\n");
//     }else{
//         System.out.println("nope");
//     }
//  }

    // 4 Aufgabe
    // int[][] numbers = {
    // {1, 2, 3},
    // {4, 5, 6},
    // {7, 8, 9}
    // };

    // int[][] transportedNumbers = new int[3][3];

    // for (int i = 0; i < numbers.length; i++) {
    //     for (int j = 0; j < numbers[i].length; j++) {
    //       transportedNumbers[j][i] =  numbers[i][j];
            
    //     }
        
    // }


    // System.out.println("Vorher");
    // for (int i = 0; i < numbers.length; i++) {
    //     System.out.println(Arrays.toString(numbers[i]));
        
    // }

    
    // System.out.println("Nachher:");
    // for (int i = 0; i < transportedNumbers.length; i++) {
    //      System.out.println(Arrays.toString(transportedNumbers[i]));
        
    // }

    
    // 5 Aufgabe - Bubblesort

    // int[] numbers = {5, 3, 8, 1, 9, 2, 7, 4};


    // boolean swapped;


    //     for (int i = 0; i < numbers.length - 1; i++) {
    //         swapped = false;
    //         for (int j = 0; j < numbers.length - i - 1; j ++) {
                
    //             if (numbers[j] > numbers[j + 1]){
                    
    //                 int variable = numbers[j];
    //                 numbers[j] = numbers[j + 1];
    //                 numbers[j + 1] = variable;
    //                 swapped = true;
    //             }

              
    //         }
        
            
    //         if(!swapped){
    //             break;
    //         }
    //         System.out.println("Durchlauf "+ (i + 1) + ": "+ Arrays.toString(numbers));
    //     }
    //     System.out.print("Sortiert: ");
    //     System.out.println(Arrays.toString(numbers));
        
    
   


    }
    
}
