public class array_create {
    public static void main(String[] args) {
        int arr[] = new int[50];
        for (int i=1;i<51;i++){
            arr[i-1]=i;
            System.out.println(arr[i-1]);
        }
    }
    
}
