import java.sql.SQLOutput;

public class Task2 {
    public static void main(String[] args) {


        double value1 = celsiusToFahrenheit(0.0);
        double value2 = celsiusToFahrenheit(25.0);
        double value3 = celsiusToFahrenheit(100.0);
//
        System.out.printf("%.1f Grad C entsprechen %.1f Grad F%n", 0.0, value1);
        System.out.printf("%.1f Grad C entsprechen %.1f Grad F%n", 25.0, value2);
        System.out.printf("%.1f Grad C entsprechen %.1f Grad F%n", 100.0, value3);


    }
    public static double celsiusToFahrenheit(double celsius){
        return celsius * 1.8 + 32;
    }
}
