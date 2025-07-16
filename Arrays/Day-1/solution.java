import java.util.Scanner;

class Solution {
    public static int getSecondLargest(int[] arr) {
        
        int n = arr.length;
      
        int largest = -1, secondLargest = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                // If current element is greater than largest,
                // update second largest and largest
                secondLargest = largest;
                largest = arr[i];


            } else if (arr[i] < largest && arr[i] > secondLargest) {
                // If current element is between largest and second largest,
                // update second largest    
                secondLargest = arr[i];

            }
        }
        return secondLargest;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Reading the size of the array
        // and the elements of the array
        int n = sc.nextInt();
        // If the size of the array is less than 2,
        // we cannot find the second largest element
        // so we return -1
        // This is a guard clause to handle edge cases
        if (n < 2) {
            System.out.println("-1");
            return;

        }
        // Initializing the array with the given size
        // and reading the elements of the array        
        int[] arr = new int[n];
        // Reading the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        // Calling the function to get the second largest element
        // and printing the result      
       
         System.out.println(getSecondLargest(arr));
    }
}