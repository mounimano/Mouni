public import java.util.Scanner;

public class gobs{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Declare and input array elements
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input the element to search
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        // Search for the element
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                index = i;
                break; // stop after finding the first match
            }
        }

        // Output result
        System.out.println("Index of searched element: " + index);
    }
}
 {
    
}
