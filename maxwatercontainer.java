// Container with max water leetcoe -11;   problem
public class maxwatercontainer {
  private static void maxwater(int h[]){
    int left=0;
    int right=h.length;
    int maxarea=0;
    while(left<=right){
      int Minarea=Math.min(h[left],h[right]);
      int width=right-left;
      int  currarea=Minarea*width;
      int Maxarea=Math.max(currarea,maxarea);
      if(h[left]<=h[right]){
        right--;
      }else{
        left++;
      }
    }
return;
 }
  public static void main(String[] args) {
    int h[]={2,4,5,6,7,8,9,99};
    maxwatercontainer mwc= new maxwatercontainer();
    maxwatercontainer.maxwater(h);
    
  }
}