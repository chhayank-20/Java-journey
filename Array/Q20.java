/*
    12/07/2024
    Longest consecutive sequence.
    Given an array of positive integers. Find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order.
     
    Example 1:
    Input:
    N = 7
    a[] = {2,6,1,9,4,5,3}
    Output:
    6
*/
class Q20 {
    public static void main(String args[]) {
        int i, j, max = 0, temp = 0, count, arr[] = { 2, 6, 1, 9, 4, 5, 3 };
        for (i = 0; i < arr.length; i++) {
            for (j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (i = 0; i < arr.length; i++) {
            for (j = i, count = 1; j < arr.length - 1; j++) {
                if (arr[j] - arr[j + 1] == -1)
                    count++;
                else
                    break;
            }
            if (max < count)
                max = count;
        }
        System.out.print(max);
    }
}