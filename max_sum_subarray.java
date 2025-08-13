public class max_sum_subarray {
    void sub_max(int arr[]){
        int max=0;
        int start=0;
        int end=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int curr=0;
                for(int k=i;k<=j;k++){
                    curr=curr+arr[k];
                }
                if(curr>=max){
                    start=i;
                    end=j;
                    max= curr;
                }
            }
        }
        System.out.println(max);
        System.out.print("{");
        for (int i = start; i <=end;i++) {
            System.out.print(arr[i]);
            if (i < end) { // no comma after last element
                System.out.print(",");
            }
        }       
        System.out.println("}");
    }
    public static void main(String[] args) {
        int arr[]={12,13,15,1,-8,-98,-86,7,5};
        max_sum_subarray msa= new max_sum_subarray();
        msa.sub_max(arr);
    }
}