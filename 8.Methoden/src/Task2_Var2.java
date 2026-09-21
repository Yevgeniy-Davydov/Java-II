public class Task2_Var2 {
    public static void main(String[] args) {
        celsiusToFahrenheit(0.0);
        celsiusToFahrenheit(25.0);
        celsiusToFahrenheit(100.0);
    }
    public static void celsiusToFahrenheit(double celsius){
        double fahrenheit = celsius * 1.8 + 32;
        System.out.printf("%.1f Grad C entsprechen %.1f Grad F%n", celsius, fahrenheit);

    }
}
