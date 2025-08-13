public class prefix_sum_max_sum_subarray {
    int [] prefixSum(int arr[]){
        int prefix[]= new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        return prefix;
    }
    public static void main(String[] args) {
        prefix_sum_max_sum_subarray ps= new prefix_sum_max_sum_subarray();
        int arr[]={10,2,4,-9};
        int curr=0,max=arr[0];
        int prefix[]=ps.prefixSum(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
               curr=i==0?prefix[j]:prefix[j]-prefix[i-1];
               if (curr>max){
                max=curr;
            }
            }
        }   
        System.out.println("max sum ="+max);        
    }
    
}
