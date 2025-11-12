public class containWithMostWater {
    public int maxArea(int[] height) {
        int maxarea=0;
        int area=0;
        int i=0;
        int j=height.length-1;
        while (i<j) {
            area=(j-i)*(Math.min(height[i],height[j]));
            if(area>maxarea){
                maxarea=area;
            }
            if(height[i]<height[j]){
                i++;
            }
            else
                j--;            
        }
        return  maxarea;
    }
    public static void main(String[] args) {
    containWithMostWater solution = new containWithMostWater();
    int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
    int result = solution.maxArea(height);
    System.out.println("The maximum area is: " + result);
}
}
