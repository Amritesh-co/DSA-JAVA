public class even {
    public boolean isEven(int n){
        return n % 2 == 0;
    }
    public static void main(String[] args) {
        int number = 10; // Example number
        even e = new even();
        if (e.isEven(number)) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
}