public class search_in_rotated_sorted_array {
    void binarysearch(int arr[], int key) {
        int left = 0;
        int c=0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == key) {
                System.out.println("found at " + mid+"no. of operation needed"+c);
                return;
            }
            if (arr[left] <= arr[mid]) {
                if (key >= arr[left] && key < arr[mid]) {
                    right = mid - 1;
                    c++;
                } else {
                    left = mid + 1;
                    c++;
                }
            }
            else {
                if (arr[right] >= arr[mid]) {
                    if (key > arr[mid] && key <= arr[right]) {
                        left = mid + 1;
                        c++;
                    } else {
                        right = mid - 1;
                        c++;
                    }
                }
            }
        }
        System.out.println("not found");
    }
    public static void main(String[] args) {
        search_in_rotated_sorted_array si= new search_in_rotated_sorted_array();
        int arr[] = {30, 35, 40, 45, 50, 5, 10, 15, 20, 25}; // sorted but rotated
        si.binarysearch(arr, 25);
    }
}