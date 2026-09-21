public class Task3 {
    public static void main(String[] args){
        max(5,3);
        max(2.5, 7.8);
        max(4, 9, 2);

    }

    public static void max(int a, int b){
        int biggest = 0;
        if (a > b){
            biggest = a;
        }else{
            biggest = b;
        }
        System.out.printf("Groesseres von %d und %d: %d%n", a, b, biggest);
    }
    public static void max(double a, double b){
        double biggest = 0.0;
        if (a > b){
            biggest = a;
        }else{
            biggest = b;
        }
        System.out.printf("Groesseres von %.1f und %.1f: %.1f%n", a, b, biggest);

    }
    public static void max(int a, int b, int c){
        int biggest = 0;
        if (a > b && a > c){
            biggest = a;
        }else if (b > a && b > c){
            biggest = b;
        }else{
            biggest = c;
        }
        System.out.printf("Groesseres von %d, %d und %d: %d%n", a, b, c, biggest);
    }
}
