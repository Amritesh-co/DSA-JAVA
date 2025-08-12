import java.util.*;
public class fact {
    void fact1(int num){
        int fact=1;
        while (num>0){
            fact= fact*num--;
        }
        System.out.printf("factorial of the numuber is\t"+fact);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int num= sc.nextInt();
        fact f= new fact();
        f.fact1(num);
    }
}
