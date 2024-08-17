class Q36{
	public static void main(String args[]){
		int i,j,arr[]={14,9,9,8,4,3,2};
		for( i=0 ; i<arr.length-1 ; i++ ){
			for( j=0 ; j<arr.length-1-i ; j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for( i=0 ; i<arr.length ; i++ )
			System.out.print(arr[i]+" ");
	}
}	