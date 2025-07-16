import java.util.Scanner;

class Solution {
    public static void pushZerosToEnd(int[] arr) {
      
    
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
           
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;

            }
        }
       
        while (j < arr.length) {
            arr[j] = 0;
            j++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Reading the size of the array
        // and the elements of the array        
        int n = sc.nextInt();
        // If the size of the array is less than 1,
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        pushZerosToEnd(arr);
        // Printing the updated array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
