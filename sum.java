import java.util.Scanner;

public class sum {
    void cal_sum(int a, int b){
        int sum= a+b;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the value of A: ");
        int a= sc.nextInt();
        System.out.println();
        System.out.print("Enter the value of B: ");
        int b= sc.nextInt();
        sum s= new sum();
        s.cal_sum(a, b);
    }
}
