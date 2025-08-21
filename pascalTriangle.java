import java.util.*;
public class pascalTriangle {
    int fact(int num){
        int fact=1;
        for (int i=1;i<=num;i++){
            fact=fact*i;
        }
        return fact;
    }
    int nCr(int n,int r){
        int value=fact(n)/(fact(r)*fact(n-r));
        return value;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        pascalTriangle pt= new pascalTriangle();
        System.out.println("enter the vlaue:");
        int limit=sc.nextInt();
        for(int i=0;i<=limit;i++){
            for(int j=limit-i;j>=0;j--)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print(pt.nCr(i, k)+" ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
