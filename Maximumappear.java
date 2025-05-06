// 2.Find the maximum appearing element in an array

 import java.util.*;

 public class Maximumappear {
     public static int[] maxappear(int a[]){
         HashMap <Integer,Integer>map=new HashMap<>();
         int n=a.length;
         for(int i=0;i<n;i++){
             if(map.containsKey(a[i])){
                 return new int[]{
                     map.put(a[i], map.get(a[i]+1))
                 };
             }else{
                 map.put(a[i], i);
             }
         }
         for(int val:map.keySet()){
             if(map.get(val)>n/3){
                 System.out.println("Maximum frequency of"+a[val]+"is"+val);
             }
         }
             return null;
     }
         public static void main(String[] args) {
         int a[]={2,3,5,3,2,2,5,6,3,3,7,5,3,2};
         maxappear(a);
    }
 }
