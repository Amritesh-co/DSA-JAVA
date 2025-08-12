import java.util.*;
public class binomial {
    int fact(int num){
        int fact=1;
        while (num>0){
            fact= fact*num--;
        }
        return fact;
    }
    public static void main(String[] args) {
        binomial b= new binomial();
        Scanner sc = new Scanner(System.in);
        System.out.println("the Value of N of nCr: ");
        int n = sc.nextInt();
        System.out.println("the Value of R of nCr: ");
        int r = sc.nextInt();
        System.out.println(n+"C"+r+"="+(b.fact(n)/(b.fact(r)*b.fact(n-r))));
    }
}
