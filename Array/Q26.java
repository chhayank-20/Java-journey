/*
   14/07/2024
   Write a Java program to find the largest and smallest element of an array.
*/
class Q26 {
   public static void main(String args[]){
      int i, min, max, arr[]={5,13,1,8,5};
      min=max=arr[0];
      for( i=0 ; i<arr.length ; i++ ){
         if(arr[i]>max)
            max = arr[i];
         if(arr[i]<min)
            min = arr[i];
      }
      System.out.println("Smallest element : "+min);
      System.out.println("Largest element : "+max);
   }
}