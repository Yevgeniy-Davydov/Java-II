import java.lang.reflect.Array;
import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {4,5};

        int[] ab = mergeArray(a,b);

        System.out.println("Array a: " + Arrays.toString(a));
        System.out.println("Array b: " + Arrays.toString(b));
        System.out.println("Kombiniert: " + Arrays.toString(ab));



    }

    public static int[] mergeArray(int[] a, int[] b){
        int[] merged = new int[a.length + b.length];

        int counter = 0;
        for (int number : a){
            merged[counter++] = number;
        }
        for (int number : b){
            merged[counter++] = number;
        }

        return merged;

    }


}
