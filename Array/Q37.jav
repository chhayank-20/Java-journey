/*
    16/17/2024
    Write a java progrtam to implement insertion sort algorithm
*/
class Q37{
	public static void main(String args[]){
		int i,j,arr[]={4,9,8,4,3,2};
		for( i=0 ; i<arr.length-1 ; i++ ){
			if(arr[i]>arr[i+1]){
				for( j=i+1 ; j>0 ; j-- ){
					if(arr[j-1]>arr[j]){
						int temp = arr[j];
						arr[j] = arr[j-1];
						arr[j-1] = temp;
					}
				} 
			}
		}
		for( i=0 ; i<arr.length ; i++ )
			System.out.print(arr[i]+" ");
	}
}	