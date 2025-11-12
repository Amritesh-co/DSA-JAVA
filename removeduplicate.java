import java.util.Scanner;
class removeduplicate{
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;      
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements: ");
    int n = sc.nextInt();
    int[] nums = new int[n];
    System.out.println("Enter the elements (sorted):");
    for (int i = 0; i < n; i++) {
        nums[i] = sc.nextInt();
    }
    removeduplicate rd = new removeduplicate();
    int newLength = rd.removeDuplicates(nums);
    System.out.println("Array after removing duplicates:");
    for (int i = 0; i < newLength; i++) {
        System.out.print(nums[i] + " ");
    }
    System.out.println();
    sc.close();
   }
}