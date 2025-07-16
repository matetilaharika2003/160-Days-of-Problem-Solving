import java.util.Scanner;

public class solution {

    // Function to rotate an array by d elements in counter-clockwise direction.
  public static void rotateArr(int arr[], int d) {
 
        int n = arr.length;
        // Handle cases where d is greater than n
        d = d % n;

        // Reverse the first d elements
        reverse(arr, 0, d - 1);
        // Reverse the remaining n - d elements
        reverse(arr, d, n - 1);
        // Reverse the entire array
        reverse(arr, 0, n - 1);

        
    }

    public static void reverse(int arr[] , int start, int end) {

        
        while (start < end) {
            // swapping the elements at start and end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // moving the pointers towards the center
            start++;
            end--;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Reading the size of the array
        // and the elements of the array
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        // Reading the elements of the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Reading the number of positions to rotate
        // the array to the left
        System.out.println("Enter the number of positions to rotate:");
        int d = sc.nextInt();

        rotateArr(arr, d);

       
        System.out.println("Array after rotation:");
        // Printing the rotated array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
}
