import java.util.*;
public class basicSortingAlgorithm {
    void bubblSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    arr[j]=arr[j]+arr[j+1];
                    arr[j+1]=arr[j]-arr[j+1];
                    arr[j]=arr[j]-arr[j+1];
                }
            }
        }
        for(int num: arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
    void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
        if(minIndex!=i){
            arr[i]=arr[i]+arr[minIndex];
            arr[i]=arr[i]-arr[minIndex];
            arr[i]=arr[i]-arr[minIndex];
        }
    }
        for(int num: arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
    void inbuiltSort(int[] array){
        Arrays.sort(array);
        // Arrays.sort(array,Collections.reverseOrder());
        for(int num:array){
            System.out.print(num+" ");
        }
        System.out.println();
    }
    void countSort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            largest=Math.max(largest, arr[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
           
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        basicSortingAlgorithm bsa= new basicSortingAlgorithm();
        int array[]={8, 3, 7, 4, 2, 10};
        bsa.bubblSort(array);
        bsa.selectionSort(array);
        bsa.countSort(array);
        bsa.inbuiltSort(array);
    }
}