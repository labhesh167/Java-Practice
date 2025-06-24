//Program to sort an array
import java.util.Arrays;
public class SortArr {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};
        System.out.println("Original array: " + Arrays.toString(arr));
        
        Arrays.sort(arr);
        
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
