import java.util.Scanner;
public class hems {
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

        // Input value to insert and position
        System.out.print("Enter the value to insert: ");
        int value = scanner.nextInt();

        System.out.print("Enter the position to insert (0 to " + size + "): ");
        int position = scanner.nextInt();

        // Validate position
        if (position < 0 || position > size) {
            System.out.println("Invalid position!");
            return;
        }

        // Create a new array with size + 1
        int[] newArray = new int[size + 1];

        // Copy elements and insert value
        for (int i = 0; i < newArray.length; i++) {
            if (i < position) {
                newArray[i] = original[i];
            } else if (i == position) {
                newArray[i] = value;
            } else {
                newArray[i] = original[i - 1];
            }
        }

        // Print result
        System.out.println("Array after insertion: " + Arrays.toString(newArray));
    }
}

