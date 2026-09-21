import java.util.Scanner;

public class AufgabenEingaben {
    public static void main(String[] args) {
        
        // 1 Aufgabe

        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Wie heisst du?");
        // String name = scanner.next();
        // System.out.println("wie alt bist du?");
        // int alter = scanner.nextInt();

        // System.out.printf("Hallo %s, du bist %d Jahre alt!%n", name, alter);
    
        // 2 Aufgabe

        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Welchen Artikel moechtest du kaufen?");
        // String atrikel = scanner.next();
        // System.out.println("Was kostet der Artikel?");
        // double preis = scanner.nextDouble();
        // System.out.println("Wie viele Stueck moechtest du kaufen?");
        // int menge = scanner.nextInt();

        // double gesamtPreis = menge * preis;

        // System.out.printf("Du hast %dx %s gekauft.%n", menge, atrikel);
        // System.out.printf("Der Gesamtpreis ist %.2f EUR", gesamtPreis);

        // 3 Aufgabe

        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Gib drei Noten ein und ich berechne den Durchschnitt");
        // System.out.println("Note 1:");
        // double note1 = scanner.nextDouble();
        // System.out.println("Note 2:");
        // double note2 = scanner.nextDouble();
        // System.out.println("Note 3:");
        // double note3 = scanner.nextDouble();

        // double durchschnitt = (note1 + note2 + note3)/3;

        // System.out.printf("Der Durchschnitt ist: %.2f%n", durchschnitt);

        // 4 Aufgabe

        String textAlter = "28";
        String textGroesse = "1.75";
        String textAktiv = "true";

        int alter = Integer.parseInt(textAlter);
        double groesse = Double.parseDouble(textGroesse);
        boolean isActive = Boolean.parseBoolean(textAktiv);

        int geburtsJahr = 2026 - alter;
        double groesse2 = groesse * groesse;

        System.out.printf("|%-20s|%d|%n", "Alter:", alter); // hier Frage zu Positionierung
        // System.out.printf("%-20s%-17.2f%n", "Groesse:", groesse);
        // System.out.printf("%-20s%-17s%n", "Aktiv:", isActive);
        // System.out.printf("%-20s%-17d%n", "Geburtsjahr:", geburtsJahr);
        // System.out.printf("%-20s%-17.4f%n", "Groesse^2:", groesse2);
        // System.out.println();

        // 5 Aufgabe

        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Willkommen beim Bandnamen-Generator!");
        // System.out.println("In welcher Stadt bist du aufgewachsen?");
        // String stadt = scanner.next();
        // System.out.println("Was ist dein Lieblingstier (auf Englisch)?");
        // String tier = scanner.next();

        // System.out.printf("Dein moeglicher Bandname ist: %ser %ss", stadt, tier);

        // 6 Aufgabe

        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Gewicht in kg:");
        // int gewicht = scanner.nextInt();
        // System.out.println("Groesse in m:");
        // double groesse = scanner.nextDouble();

        // double bmi = gewicht / (groesse * groesse);

        // System.out.printf("Dein BMI betraegt: %.2f", bmi);


        // 7 Aufgabe
        
        // var1
        // long maxInteger = Integer.MAX_VALUE;
        // long minInteger = Integer.MIN_VALUE;
        // long anzahlInteger = minInteger * -1 + maxInteger + 1;
        
        // var2
        // int maxInteger = Integer.MAX_VALUE;
        // int minInteger = Integer.MIN_VALUE;
        // long anzahlInteger = (long) minInteger * -1 + maxInteger + 1;
      
        // long maxLong = Long.MAX_VALUE;
        // long minLong = Long.MIN_VALUE;

        // String maxDouble = Double.toString(Double.MAX_VALUE);
        // String minDouble = Double.toString(Double.MIN_VALUE);

        // System.out.println();
        // System.out.println("=== Wertebereiche ===");
        // System.out.printf("%-10s%d\tbis\t%d\n", "Integer:", minInteger, maxInteger);
        // System.out.printf("%-10s%d\tbis\t%d\n", "Long:", minLong, maxLong);
        // System.out.printf("%-10s%s\tbis\t%s\n", "Double:", minDouble, maxDouble);
        // System.out.println();

        // System.out.println("Anzahl moeglicher Integer-Werte: " + anzahlInteger);
        // System.out.println();


        

        



    }

}
