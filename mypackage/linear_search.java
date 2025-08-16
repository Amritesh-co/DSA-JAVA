package mypackage;
import java.util.*;
public class linear_search {
boolean linear(int arr[],int key){
    for(int i=0;i<arr.length;i++){
        if(arr[i]==key)
        return true;
    }
    return false;
}
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    linear_search ls= new linear_search();
    System.out.println("enter the value to be search");
    int key=sc.nextInt();
    int arr[]={10,20,30,40,50,60};
    if (ls.linear(arr,key)){
        System.out.println("found");
    }
    else{
        System.out.println("not found");
    }
    sc.close();
}
}