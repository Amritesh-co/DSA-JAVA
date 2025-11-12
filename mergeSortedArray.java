public class mergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(i>=0&&j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k--]=nums1[i--];
            }
            else{
                nums1[k--]=nums2[j--];
            }
        }
        if(i>=0){
            while(i>=0){
                nums1[k--]=nums1[i--];
            }
        }
        else if(j>=0){
            while(j>=0){
                nums1[k--]=nums2[j--];
            }
        }
    }
    public static void main(String[] args) {
        mergeSortedArray msa = new mergeSortedArray();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        msa.merge(nums1, 3, nums2, 3);
        System.out.println("Merged array:");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}    
