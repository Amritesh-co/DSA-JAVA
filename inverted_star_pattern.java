// This code is intended to print an inverted star pattern using '@' characters.
public class inverted_star_pattern {
    public static void main(String args[]){
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("@");
            }
            System.out.println();
        }
    }
}