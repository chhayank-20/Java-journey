public class Majority_element {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,4,4,4,4};
        int count=0;
        int n = arr.length;
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>n/2){
                if(k!=arr[i]){
                    System.out.println("found "+arr[i]);
                    k=arr[i];
                }
            } count=0;
        }
    }
}
