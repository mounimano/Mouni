 import java.util.Scanner;
 public class moujam{
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};

        segregateZerosAndOnes(arr);

        System.out.println("Output array = " + Arrays.toString(arr));
    }

    // Function to segregate 0s and 1s
    public static void segregateZerosAndOnes(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Move left forward if it's already 0
            while (arr[left] == 0 && left < right) {
                left++;
            }

            // Move right backward if it's already 1
            while (arr[right] == 1
 {
    
}
