import java.util.*;
public class prime {
    boolean isPrime(int num){
        for (int i= 2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }return true;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        prime pr= new prime();
        int range=sc.nextInt();
        while(range>1){
        System.out.println("is prime "+range +": "+pr.isPrime(range--));
    }
    sc.close();
    }
}
