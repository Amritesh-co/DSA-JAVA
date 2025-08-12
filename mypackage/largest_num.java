package mypackage;

class largest_num {
    void large(int arr[]){
        int large=arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]>large){
                large=arr[i];
            }
        }
        System.out.println("the largest number in the array is :"+large);
    }
    public static void main(String[] args) {
        largest_num ln= new largest_num();
        int arr[]={10,12,13,1,1456778,678,123353,5};
        ln.large(arr);
    }
    
}