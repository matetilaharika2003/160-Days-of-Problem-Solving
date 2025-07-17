import java.util.Scanner;

public class solution {

    public static void nextPermutation(int[] arr) {
        int n = arr.length;
        int idx = -1;
        // Step 1: Find the largest index i such that arr[i] < arr[i + 1]
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                idx = i;
                break;
            }
        }
        // If no such index exists, the array is in descending order
        if (idx == -1) {
            reverse(arr, 0, n - 1);
            return;
        }
        // Step 2: Find the largest index j such that arr[i] > arr[idx]
        for (int i = n - 1; i > idx; i--) {
            if (arr[i] > arr[idx]) {
                // Step 3: Swap the values at indices idx and j
                swap(arr, idx, i);
                // After swapping, we can break out of the loop
                break;
            }
        }
        // Step 4: Reverse the subarray from idx + 1 to the end of the array
        reverse(arr, idx + 1, n - 1);
    }
public static void swap(int arr[], int start, int end){ 
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            // Swapping the elements at start and end
            swap(arr, start, end);
            // Moving the pointers towards the center
            start++;
            end--;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Reading the size of the array
        int n = sc.nextInt();
        int[] arr = new int[n];
        // Reading the elements of the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Calling the function to find the next permutation
        nextPermutation(arr);
        
        // Printing the updated array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
}
