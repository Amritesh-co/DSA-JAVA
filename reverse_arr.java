import java.util.Scanner;

public class reverse_arr {
    void swap(int arr[],int start,int end){
        arr[start]=arr[start]+arr[end];
        arr[end]=arr[start]-arr[end];
        arr[start]=arr[start]-arr[end];
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        reverse_arr ra= new reverse_arr();
        int arr[]={10,12,14,15,19,10,18,13};
        int start=0;
        int end=arr.length-1;
        while (start<end) {
            ra.swap(arr,start++,end--);
        }
        System.out.print("{");
for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i]);
    if (i < arr.length - 1) { 
        System.out.print(",");
    }
}
System.out.println("}");
sc.close();
    }
}