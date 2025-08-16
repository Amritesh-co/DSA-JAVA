import java.util.*;
public class trapping_rainwater {
    int[] leftMax(int arr[]){
        int[]left_max=new int[arr.length];
        left_max[0]=arr[0];
        for(int i=1;i<(arr.length); i++){
            left_max[i]=Math.max(left_max[i-1],arr[i]);
        }
        return left_max;
    }
     int[] rightMax(int arr[]){
        int[]right_max=new int[arr.length];
        right_max[right_max.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0; i--){
            right_max[i]=Math.max(right_max[i+1],arr[i]);
        }
        return right_max;
    }
    void trappingRainwater(int[]left,int[]right,int[]arr,int width){
        int waterlevel=0;
        int water=0;
        for(int i=0;i<left.length;i++){
            waterlevel=Math.min(left[i],right[i]);
            water=water+((waterlevel-arr[i])*width);
        }
        System.out.println("total water traped is:"+water);
    }
    public static void main(String[] args) {
        trapping_rainwater tr= new trapping_rainwater();
        int [] bar={4,2,0,6,3,2,5};
        int left[]=tr.leftMax(bar);
        int right[]=tr.rightMax(bar);
        int width=1;
        tr.trappingRainwater(left, right, bar, width);
    }
}
