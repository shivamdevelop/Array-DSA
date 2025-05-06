


import java.util.HashSet;

public class Intersection {
    public static int intersection(int a[],int b[]){
        
        HashSet <Integer> set1=new HashSet<>();
        int count =0;
        int na=a.length;
        int nb=b.length;
        for(int i=0;i<na;i++){
            set1.add(a[i]);
        }
        for(int j=0;j<nb;j++){
            if(set1.contains(b[j])){
                count+=count;
                set1.remove(b[j]);
            }
        }
        return count;
}
 public static void main(String[] args) {
        int a[]={2,3,4,2,3,4,2,2};
        int b[]={2,3,5,3,2,5,5,4};
        System.out.println(intersection(a, b));
    }
}
