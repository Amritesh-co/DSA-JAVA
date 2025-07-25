public class average {
    public int average(int a1,int a2, int a3) {
        return (a1 + a2 + a3) / 3;
    }
    public static void main(String[] args) {
        average avg= new average();
        int result = avg.average(10, 20, 30);
        System.out.println("The average is: " + result);
    }
}
