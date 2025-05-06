// 5.Trapping rain water leetcode-42
public class trappingrainwater {
    public int waterheight(int []height){
        int n=height.length;
        if(n==0){
            return 0;
        };
        int water=0;
        int [] leftmax=new int[n];
        int [] rightmax=new int[n];

        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(leftmax[i-1],height[i]);
        };

        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1], height[i]);
        };
        for(int i=0;i<n;i++){
            water+=Math.min(leftmax[i],rightmax[i])-height[i];
        };
        return water;
 


    }
    public static void main(String[] args) {
        
        int []height={4,2,1,0,7,9};
        trapwater tw=new trapwater();
        System.out.println(tw.waterheight(height));


    }
}