public class overloading {
    void sum(int a, int b){
        System.out.println(a+b);
    }
    void sum(int a,int b, int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        overloading o= new overloading();
        o.sum(2,5);
        o.sum(5, 6, 9);
    }
}
