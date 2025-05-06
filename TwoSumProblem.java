
 import java.util.*;
 public class TwoSumProblem {
     public static int[] towsum(int a[], int target){
         HashMap <Integer,Integer>map=new HashMap<>();
         for(int i=0;i<a.length;i++){
             int elem=target-a[i];
             if(map.containsKey(elem)){
                 return  new int[]{
                     map.get(elem),i
                 };
                 }else{
                 map.put(a[i],i);
             }
         }
         return null;
     }
     public static void main(String[] args) {
         int a[]={3,5,6,2,7};
         int target=8;
         int []result=towsum(a, target);
         System.out.println("Indices are"+result[0]+"and"+result[1]);
     }
 }

