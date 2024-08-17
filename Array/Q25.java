/*
   14/07/2024
   Write a Java program to reverse the element of an integer 1-D array
*/
class Q25 {
   public static void main(String args[]){
      int i, arr[]={1,8,1,9,8,4};
      System.out.println("Array before reversing : ");
      for( i=0 ; i<arr.length ; i++ )
         System.out.print(arr[i]+" ");
      for( i=0 ; i<arr.length/2 ; i++ ){
         int temp = arr[i];
         arr[i] = arr[arr.length-1-i];
         arr[arr.length-1-i] = temp;
      }
      System.out.println("Array after reversing : ");
      for( i=0 ; i<arr.length ; i++ )
         System.out.print(arr[i]+" ");
   }
}