public class buy_sell_stocks {
    void sell(int[] arr){
        int buying=Integer.MAX_VALUE;
        int max_profit=0;
        for(int i=0;i<arr.length;i++){
            if(buying<arr[i]){
                int profit=arr[i]-buying;
                max_profit=Math.max(max_profit,profit);
            }
            else {
                buying=arr[i];
            }
        }
        System.out.println("maximun profit"+max_profit);
    }
    public static void main(String[] args) {
        buy_sell_stocks bs= new buy_sell_stocks();
        int prices[]={7,1,5,3,6,4};
        bs.sell(prices);
    }
}
