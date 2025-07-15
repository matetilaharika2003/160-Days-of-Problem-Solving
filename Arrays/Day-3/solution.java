import java.util.Scanner;

public class solution {

    public static void reverseArray(int arr[]) {

        // using two pointers to reverse the array
        int start = 0;
        int end = arr.length - 1;
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
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        reverseArray(arr);

        // printing an updated array

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
