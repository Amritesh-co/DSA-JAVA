import java.util.Scanner;

public class pair {
    void pairs(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=(i+1);j<arr.length;j++){
               System.out.print("(" + arr[i] + "," + arr[j] +")");
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]={10,12,14,16,18,21,45};
        pair p= new pair();
        p.pairs(arr);
    }
}
