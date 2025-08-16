import java.util.Scanner;
public class mult {
    void muiltiply(int a,int b){
        System.out.println(a*b);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of A:");
        int a = sc.nextInt();
        System.out.println("enter the value of B:");
        int b = sc.nextInt();
        mult m= new mult();
        m.muiltiply(a, b);
        sc.close();
    }
}
