import java.util.*;
public class sub_array {
    void sub(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        sub_array sa= new sub_array();
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        sa.sub(arr);
    }
    
}
