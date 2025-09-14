import java.util.Arrays;
import java.util.Scanner;
public class kumari
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input original array size and elements
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] original = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            original[i] = scanner.nextInt();
        }

        // Input position to delete
        System.out.print("Enter the position to delete (0 to " + (size - 1) + "): ");
        int position = scanner.nextInt();

        // Validate position
        if (position < 0 || position >= size) {
            System.out.println("Invalid position!");
            return;
        }

        // Create new array of size - 1
        int[] newArray = new int[size - 1];

        // Copy elements except the one at the given position
        for (int i = 0, j = 0; i < size; i++) {
            if (i == position) continue; // skip the element at delete position
            newArray[j++] = original[i];
        }

        // Print result
        System.out.println("Array after deletion: " + Arrays.toString(newArray));
    }
}

