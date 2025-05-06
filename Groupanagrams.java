
// 4.Intersection of two arrays

// import java.util.HashSet;

// public class TwoSumProblem {
//     public static int intersection(int a[],int b[]){
        
//         HashSet <Integer> set1=new HashSet<>();
//         int count =0;
//         int na=a.length;
//         int nb=b.length;

//         for(int i=0;i<na;i++){
//             set1.add(a[i]);
//         }
//         for(int j=0;j<nb;j++){
//             if(set1.contains(b[j])){
//                 count+=count;
//                 set1.remove(b[j]);
//             }
//         }
//         return count;
    
    
        
// }

//     public static void main(String[] args) {
//         int a[]={2,3,4,2,3,4,2,2};
//         int b[]={2,3,5,3,2,5,5,4};
        
//         System.out.println(intersection(a, b));
//     }
// }

// import java.util.HashMap;
// public class TwoSumProblem {
//     public static   int[] twosum(int a[],int target){
//         HashMap<Integer ,Integer> map=new HashMap<>();
//         for(int i=0;i<a.length;i++){
//             int elem=target-a[i];
//             if(map.containsKey(elem)){
//               return new int[]{
//                 map.get(elem),i
//               };
                
//             }else{
//                 map.put(a[i],i);
//             } 
//         }
//         return null;
//       }
//     public static void main(String[] args) {
//     int target=10;
//     int a[]={2,4,8,3,12};
//     int [] result=  twosum(a, target);
    
//     System.out.println("Indices are"+result[0]+" and  "+result[1]);
//   }
// }



// 1.Two sum problem on leetcode
// import java.util.*;
// public class TwoSumProblem {
//     public static int[] towsum(int a[], int target){
//         HashMap <Integer,Integer>map=new HashMap<>();
//         for(int i=0;i<a.length;i++){
//             int elem=target-a[i];
//             if(map.containsKey(elem)){
//                 return  new int[]{
//                     map.get(elem),i
//                 };
//                 }else{
//                 map.put(a[i],i);
//             }
//         }
//         return null;
//     }
//     public static void main(String[] args) {
//         int a[]={3,5,6,2,7};
//         int target=8;
//         int []result=towsum(a, target);
//         System.out.println("Indices are"+result[0]+"and"+result[1]);
//     }
// }

// 2.Find the maximum appearing element in an array

// import java.util.*;

// public class TwoSumProblem {
//     public static int[] maxappear(int a[]){
//         HashMap <Integer,Integer>map=new HashMap<>();
//         int n=a.length;
//         for(int i=0;i<n;i++){
//             if(map.containsKey(a[i])){
//                 return new int[]{
//                     map.put(a[i], map.get(a[i]+1))
//                 };
//             }else{
//                 map.put(a[i], i);
//             }
//         }
//         for(int val:map.keySet()){
//             if(map.get(val)>n/3){
//                 System.out.println("Maximum frequency of"+a[val]+"is"+val);
//             }
//         }
//             return null;
//     }
//         public static void main(String[] args) {
//         int a[]={2,3,5,3,2,2,5,6,3,3,7,5,3,2};
//         maxappear(a);
//    }
// }

// 3.Union of Two arrays 

// import java.util.*;
// public class TwoSumProblem {
//     public static int[] union(int a[],int b[]){
//         HashSet <Integer> set=new HashSet<>();
//         for(int i=0;i<a.length;i++){
//             set.add(a[i]);
//         };
//         for(int i=0;i<b.length;i++){
//             set.add(b[i]);
//         };
//         int result=  set.size();     
//         System.out.println(result);   
//         return null;
//     }
//         public static void main(String[] args) {
//         int a[]={2,3,4,2,3,4,2,2};
//         int b[]={2,3,5,3,2,5,5,4};
//         int[] show=union(a, b);
//         System.out.println(show);
//     }
// }


// 5.Trapping rain water leetcode-42
// public class trapwater {
//     public int waterheight(int []height){
        // int n=height.length;
//         if(n==0){
//             return 0;
//         };
//         int water=0;
//         int [] leftmax=new int[n];
//         int [] rightmax=new int[n];

//         leftmax[0]=height[0];
//         for(int i=1;i<n;i++){
//             leftmax[i]=Math.max(leftmax[i-1],height[i]);
//         };

//         rightmax[n-1]=height[n-1];
//         for(int i=n-2;i>=0;i--){
//             rightmax[i]=Math.max(rightmax[i+1], height[i]);
//         };
//         for(int i=0;i<n;i++){
//             water+=Math.min(leftmax[i],rightmax[i])-height[i];
//         };
//         return water;
 


//     }
//     public static void main(String[] args) {
        
//         int []height={4,2,1,0,7,9};
//         trapwater tw=new trapwater();
//         System.out.println(tw.waterheight(height));


//     }
// }



// factrial of large number =LEFT
// import java.math.BigInteger;
// import java.util.ArrayList;
// import java.util.Scanner;

// public class trapwater {
//     public static ArrayList<BigInteger> computefactorial(int n){
//         ArrayList<BigInteger> factoArrayList=new ArrayList<>();
//         BigInteger result=BigInteger.ONE;

//         factoArrayList.add(result);
//         for(int i=1;i<=n;i++){
//             result=result.multiply(BigInteger.valueOf(i));
//             factoArrayList.add(result);
//         }
//         return factoArrayList;
//     }
    

// public static void main(String[] args) {
//     Scanner sc=new Scanner("enter the number");
//     int n=sc.nextInt();
//     ArrayList<BigInteger> factorials=computefactorial(n);
//     System.out.println("factorial from 0 to"+n+"!");
//     for(int i=0;i<=n;i++){
//         System.out.println(i+"!="+factorials.get(i));
//     }
    
// }
// };


// public class Spiralmatrix {
//     public int spiral(int [][]mat){
//     int n=mat.length;
//     int m=mat[0].length;
//     int left =0;
//     int right=m-1;
//     int top=0;
//     int bottom=n-1;
//     while(left<=right && top<=bottom)
//     {
//         for(int i=left;i<right;i++){
//             System.out.print(mat[top][i]+" ");
//         };
//         top++;
//         for(int i=top;i<bottom;i++){
//             System.out.print(mat[right][i]+" ");
//         };
//         right--;
//         for(int i=right;i>left;i--){
//             System.out.print(mat[bottom][i]+" ");
//         }; 
//         bottom--;
//         for(int i=bottom;i>top;i--){
//             System.out.print(mat[left][i]);
           
//         };
//         left++;
//     }
//     return bottom;
//  }
//         public static void main(String[] args) {
//         int mat[][]={
//                      {1,2,3,4,5},
//                      {6,7,8,9,10},
//                      {11,12,13,14,15},
//                      {16,17,18,19,20,21},
//                      {22,23,24,25,26,27}};
//                      Spiralmatrix sp=new Spiralmatrix();
//                      sp.spiral(mat) ;  
                         
//     }
// }

// Container with max water leetcoe -11;   problem
// public class Maxwatercontainer {
//   private static void maxwater(int h[]){
//     int left=0;
//     int right=h.length;
//     int maxarea=0;
//     while(left<=right){
//       int Minarea=Math.min(h[left],h[right]);
//       int width=right-left;
//       int  currarea=Minarea*width;
//       int Maxarea=Math.max(currarea,Maxarea);
//       if(h[left]<=h[right]){
//         right--;
//       }else{
//         left++;
//       }
//     }
// return;
//  }
//   public static void main(String[] args) {
//     int h[]={2,4,5,6,7,8,9,99};
//     Maxwatercontainer mwc= new Maxwatercontainer();
//     mwc.maxwater(h);
    
//   }
// }




// Sort the matrix diagonally leetcode-1329;
// import java.util.Arrays;
// import java.util.HashMap;
// import java.util.PriorityQueue;
// public class sortDiagonally {
//         public static int [][] Diagonally(int mat[][]){
//                 HashMap<Integer,PriorityQueue<Integer>> map =new HashMap<>();
//                 int n=mat.length;
//                 int m=mat[0].length;
//                 for(int i=0;i<n;i++){
//                         for(int j=0;j<m;j++){
//                                 int key=i-j;
//                                 map.computeIfAbsent(key, k->  new PriorityQueue<>()).add(mat[i][j]);
//                         }
//                 };
//                 for(int i=0;i<n;i++){
//                         for(int  j=0;j<m;j++){
//                                 int key=i-j;
//                               mat[i][j]= map.get(key).poll();
//                               for(int[] row:mat){
//                                 System.out.println(Arrays.toString(row));
//                               }
//                         }
//                 }
// return mat;
// }
// public static void main(String[] args){
//  int mat[][]={{0,3,2,1},
//                     {2,1,3,0},
//                     {2,3,0,1},
//                     {1,0,3,2},};
//                   int [][] result=Diagonally(mat);
//                   System.out.println(result);
        
// }
// }

