public class binary_search {
   void bin_search(int arr[],int key){
    int start=0,end=arr.length-1;
    while(start<=end){
        int mid=(start+end)/2;
        if (arr[mid]==key){
            System.out.println("found");
            return;
        }
        else if(arr[mid]<key){
            start=mid+1;
        }
        else if(arr[mid]>key){
            end=mid-1;
        }
    }System.out.println("not found");
    }
    public static void main(String[] args) {
        int arr[]={12,14,16,17,19,123,126,129,147};
        int key=11;
        binary_search bs= new binary_search();
        bs.bin_search(arr, key);
    }
}
