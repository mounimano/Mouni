import java.util.Scanner;
public class maraja{

    // Function to count elements less than the key
    public static int countLessThanKey(int[] arr, int key) {
        int count = 0;
        for (int value : arr) {
            if (value < key) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Example unsorted array
        int[] array = {10, 3, 5, 8, 2, 7, 1};
        
        // Key element
        int key = 6;

        // Count and print the result
        int result = countLessThanKey(array, key);
        System.out.println("Number of elements less than " + key + ": " + result);
    }
}
