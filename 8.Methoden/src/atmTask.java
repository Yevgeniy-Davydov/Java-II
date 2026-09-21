import java.util.Scanner;

public class atmTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean on = true;
        double balance = 10.00;

        while(on){

            // block with looong sout:)
            System.out.println();
            System.out.println("# # # # # # # # # # # #");
            System.out.println("#    BANK AUTOMAT     #");
            System.out.println("# # # # # # # # # # # #");
            System.out.println();
            System.out.println("1. Kontostand anzeigen");
            System.out.println("2. Einzahlung");
            System.out.println("3. Auszahlung");
            System.out.println("4. Beenden");
            System.out.println();
            System.out.print("Was moechten Sie tun?: ");


            int number = scanner.nextInt();
            switch (number){

                case 1:
                    showBalance(balance);
                    break;
                case 2:
                    balance += deposit(scanner);
                    showBalance(balance);
                    break;
                case 3:
                    balance -= withdraw(scanner, balance);
                    showBalance(balance);
                    break;
                case 4:
                    System.out.println("Auf Wiedersehen");
                    on = false;
                    break;
                default:
                    System.out.println("Ungültige Eingabe. Zahlen 1-4 wählen");
                    break;
            }

    }

    }
    // methods

        public static void showBalance(double balance){
            System.out.println();
            System.out.println("Hier ist ihr aktueller Kontostand:");
            System.out.println("# # # # # # # # # # # #");
            System.out.printf("#   %10.2f €   #%n", balance);
            System.out.println("# # # # # # # # # # # #");

        }

        public static double deposit(Scanner scanner){
            System.out.print("Wieviel moechten sie einzahlen?: ");
            double deposit = scanner.nextDouble();
            if (deposit > 0){

                System.out.println("Ihre Einzahlund beträgt " + deposit + " €");

            } else{
                System.out.println("Ihre Einzahlung ist nicht moeglich!");
                deposit = 0;

            }
            return deposit;
        }

        public static double withdraw(Scanner scanner, double balance){
            System.out.print("Wieviel moechten sie abheben?: ");
            double amount = scanner.nextDouble();
            if (amount <= balance){
                System.out.println("Ihre Auszahlung beträgt " + amount + " €");

            }else {
                System.out.println("Vorgang nicht moeglich. Nicht genug auf dem Konto!");
                amount = 0;
            }

            return amount;
        };
}
