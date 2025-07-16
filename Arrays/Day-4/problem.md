Rotate an Array by d - Counterclockwise or Left

Given an array of integers arr[] of size n, the task is to rotate the array elements to the left by d positions.

Do the mentioned change in the array in place.

Note: Consider the array as circular.

Examples:

Input: arr[] = {1, 2, 3, 4, 5, 6}, d = 2
Output: {3, 4, 5, 6, 1, 2}
Explanation: After first left rotation, arr[] becomes {2, 3, 4, 5, 6, 1} and after the second rotation, arr[] becomes {3, 4, 5, 6, 1, 2}

Input: arr[] = {1, 2, 3}, d = 4
Output: {2, 3, 1}
Explanation: The array is rotated as follows:

After first left rotation, arr[] = {2, 3, 1}
After second left rotation, arr[] = {3, 1, 2}
After third left rotation, arr[] = {1, 2, 3}
After fourth left rotation, arr[] = {2, 3, 1}

Constraints:
1 <= arr.size(), d <= 105
0 <= arr[i] <= 105

