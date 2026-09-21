import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {

        int array1[] = {3, 7, 2, 9, 4};
        int array2[] = {-5, -2, -8, -1};
        int array3[] = {-3, 0, 5, -7, 2};

        System.out.println(" Max aus " + Arrays.toString(array1) + ": " + findMax(array1));
        System.out.println(" Max aus " + Arrays.toString(array2) + ": " + findMax(array2));
        System.out.println(" Max aus " + Arrays.toString(array3) + ": " + findMax(array3));


    }

    public static int findMax(int[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length -1];
        }
    }

