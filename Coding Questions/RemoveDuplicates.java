//Program to remove duplicates from a sorted array
import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4, 3, 5, 1};

        Set<Integer> uniqueNumbers = new LinkedHashSet<>();

        for (int num : numbers) {
            uniqueNumbers.add(num);
        }

        System.out.println(uniqueNumbers);
    }
}
