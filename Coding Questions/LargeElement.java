//Program to find the largest element in an array
public class LargeElement {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 8, 6};
        int largest = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        
        System.out.println("The largest element in the array is: " + largest);
    }
}
