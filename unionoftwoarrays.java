

import java.util.*;
public class unionoftwoarrays {
    public static int[] union(int a[],int b[]){
        HashSet <Integer> set=new HashSet<>();
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        };
        for(int i=0;i<b.length;i++){
            set.add(b[i]);
        };
        int result=  set.size();     
        System.out.println(result);   
        return null;
    }
        public static void main(String[] args) {
        int a[]={2,3,4,2,3,4,2,2};
        int b[]={2,3,5,3,2,5,5,4};
        int[] show=union(a, b);
        System.out.println(show);
    }
}

