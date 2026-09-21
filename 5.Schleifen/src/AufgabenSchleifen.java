// import java.util.Scanner;

// public class AufgabenSchleifen {
//     public static void main(String[] args) {
        
    //1 Aufgabe

    // Scanner scanner = new Scanner(System.in);
    // System.out.print("Bitte gib eine Zahl ein: ");
    // int number = scanner.nextInt();
    // int sum = 0;

    // for (int i = 1; i <= number; i++){
    //     sum += i;
    // }
    // System.out.println("Summe von 1 bis "+ number + " ist " + sum);

    // 2 Aufgabe

    // Scanner scanner = new Scanner(System.in);
    // System.out.print("Bitte gib eine Zahl ein: ");
    // int number2 = scanner.nextInt();
    // int product = 1;

    // for (int i = 1; i <= 10; i++){
    //     product = number2 * i;
    //     System.out.printf("%d x %d = %d%n",i , number2, product);
    // }

    // 3 Aufgabe

    // for(int i = 1; i <= 100; i++){

    //     if (i % 15 == 0){
    //         System.out.println("FizzBuzz");

    //     }else if (i % 3 == 0){
    //         System.out.println("Fizz");

    //     }else if(i % 5 == 0){
    //         System.out.println("Buzz");

    //     }else{
    //     System.out.println(i);
    //     }
    // }

    // 4 Aufgabe

    // Scanner scanner = new Scanner(System.in);
    // String passwordFromInput;
    // String savedPassword = "Moin!";

    // do{
        
    //     System.out.print("Bitte Passwort eingeben: ");
    //     passwordFromInput = scanner.next();
    //     System.out.println("Nope, versuche es erneut.");

    // }while(!savedPassword.equals(passwordFromInput));
    // System.out.println("Passwort korrekt!");


    // 5 Aufgabe
    
    // int counter = 3;
    
    // while (counter > 0) {
        
    //     Scanner scanner = new Scanner(System.in);
    //     String userNameFromInput;
    //     String userNameSaved = "Santa";
        
    //     int passwordSaved = 12345;
    //     int passwordFromInput;
    //     System.out.println("Versuche verblieben: " + counter);
    //     System.out.print("Benutzername: ");
    //     userNameFromInput = scanner.next();
    //     System.out.print("Password: ");
    //     passwordFromInput = scanner.nextInt();

        
    //     if(passwordFromInput == passwordSaved && userNameFromInput.equals(userNameSaved)) {
    //         System.out.println("Willkommen, Santa!");
    //         break;
    //     }else{
    //         System.out.println("Fehler: Benutzername oder Passwort falsch.");
    //     }
        
        
    //     counter --;
    //     if (counter == 0){
            
    //         System.out.println("Konto gesperrt. Zu viele Fehlversuche.");
    //     }
    // }

    


//     }
// }
