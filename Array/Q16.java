/*
    DATE : 14/06/2024
    Rearrange the array in alternating positive and negative items
    Given an unsorted array Arr of N positive and negative numbers. Your task is to create an array of alternate positive and negative numbers without changing the relative order of positive and negative numbers.
    Note: Array should start with positive number.
    Arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8}
    Output:
    5 -5 2 -2 4 -8 7 1 8 0
*/
class Q16 {
    public static void main(String args[]) {
        int i, j, countpositive=0, temp = 0, arr[] = { -5, -2, 5, 2, 4, 7, 1, 8, 0, -8 };
        for (i = 0; i < arr.length - 1; i++)
            if(arr[i]%2==0)
                countpositive++;
        for()
        for (i = 0; i < arr.length; i++)
                System.out.print(arr[i] + "  ");
    }
}
class Shift{
    public int[] ShiftArray(int arr[])
}