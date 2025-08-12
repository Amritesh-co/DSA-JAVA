public class call_by_refernece_arr {
    void update(int arr[]){
        for (int i =0;i<arr.length;i++){
            arr[i]=++arr[i];
        }
    }

    public static void main(String[] args) {
        call_by_refernece_arr ar= new call_by_refernece_arr();
        int arr[]={10,12,13};
        ar.update(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}