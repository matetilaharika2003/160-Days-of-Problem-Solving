import java.util.Scanner;

class Solution {
   public static int getSecondLargest(int[] arr) {
        int n = arr.length;
        int largest = -1, secondLargest = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];

            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];

            }
        }
        return secondLargest;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n < 2) {
            System.out.println("-1");
            return;

        }

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }

        System.out.println(getSecondLargest(arr));
    }
}