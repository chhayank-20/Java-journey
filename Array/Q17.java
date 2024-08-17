/*
    12/07/2024
    Find it there is any subarray with sum equals to zero
    Given an array of positive and negative numbers. Find if there is a subarray (of size at-least one) with 0 sum.
    Example 1:
    Input:
    5
    4 2 -3 1 6

    Output: 
    Yes
*/
class Q17 {
    public static void main(String[] args) {
        int i, j, sum, arr[] = { 4, 2, -3, 1, 6 };
        boolean flag = false;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                flag = true;
                break;
            }
            for (j = i, sum = 0; j < arr.length; j++) {
                sum = sum + arr[j];
                if (sum == 0) {
                    flag = true;
                    break;
                }
            }
        }
        if (flag)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}