import java.util.Scanner;
public class practice{
    public static int findMinimum(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty or null.");
        }

        int min = arr[0]; // Assume the first element is the minimum

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i]; // Update min if current element is smaller
            }
        }

        return min;
    }

    public static void main(String[] args) {
        // Example array
        int[] array = {10, 3, 5, 8, 2, 7, 1};

        // Find and print the minimum
        int minimum = findMinimum(array);
        System.out.println("Minimum element in the array: " + minimum);
    }
}
 {
    
}
