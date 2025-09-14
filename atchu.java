import java.util.Arrays;

public class atchu{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        // Calculate total sum of array
        int totalSum = 0;
        for (int value : arr) {
            totalSum += value;
        }

        // Replace each element with totalSum - element
        for (int i = 0; i < arr.length; i++) {
            arr[i] = totalSum - arr[i];
        }

        // Print the modified array
        System.out.println("Modified array: " + Arrays.toString(arr));
    }
}

