import java.util.*;
public class binary_decimal {
    void bin(String str){
       str=new StringBuilder(str).reverse().toString();
       System.out.println(str); 
       int binary=Integer.parseInt(str);
       int decimal = 0;
        int pos=0;
       while(binary>0){
        int last=binary%10;
        if(last!=0)
        decimal=decimal+(int) Math.pow(2,pos);
        pos++;
        binary=binary/10;
       }System.out.println("decimal Equivalent is : "+decimal);
    }
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      String str=sc.nextLine();
      binary_decimal bi= new binary_decimal();
      bi.bin(str); 
      sc.close();
    }
}