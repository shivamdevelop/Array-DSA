//1. Find teh maximum and minimum element in an array:

// import java.util.Arrays;
// public class array1 {
// public static void main(String[] args) {
//   int a[]={3,5,6,4,2,3,5};
//   int   max=Arrays.stream(a).max().getAsInt();
//   int  min=Arrays.stream(a).min().getAsInt();
//   System.out.println("maximum element is"+max+"and minimum element is"+min);
// }
// }

// 2.Reverse teh Array:

// import java.util.Arrays;
// public class array1 {
//     void reverse(int a[]) {
//     int start=0;
//     int end=a.length-1;
//     while (start<end){
//       int temp=a[start];
//       a[start]=a[end];
//       a[end]=temp;
//       start++;
//       end--;
//     }
//  }
//   public static void main(String[] args) {
//     int a[]={3,5,6,4,2,3,5};
//     array1 a1=new array1();
//     a1.reverse(a);
//     System.out.println("reversed array is "+Arrays.toString(a));
// }
// }

// 3.Find second Largest and second smallest element in an array:

// public class array1 {
//  void second_largest( int a[]) {
//   int largest=Integer.MIN_VALUE;
//   int secondlargest=Integer.MIN_VALUE;
//   for(int i=0;i<a.length;i++){
//   if(largest<a[i]){
//       secondlargest=largest;
//       largest=a[i];
//     }else if(a[i]>secondlargest && a[i]!=largest){
//        secondlargest=a[i];
//        System.out.println("Second largest element is"+secondlargest);
//       }
//   }
// }
// public static void main(String[] args) {
//   int a[]={3,5,6,4,2,3,5};
//   array1 a1=new array1();
//   a1.second_largest(a);
// }
// }


// 4.Check whether arrays is sorted or not;

// public class array1 {

//   public static void main(String[] args) {
//     int a[]={3,5,6,4,2,3,5};
//     for(int i=0;i<a.length;i++){
//       if(a[i]<a[i+1]){
//         System.out.println("Array is sorted");
//       }
//       else{
//         System.out.println("Array is not sorted");
//       }
//     } 
//   }
// }


// 5.Remove duplicate element from an array:

// import java.util.Arrays;
// import java.util.HashSet;

// public class array1 {

//   int duplicate(int a[]){
    
//     HashSet <Integer>hs =new HashSet<>();
//     for(int i=0;i<a.length;i++){
//       if(hs.contains(a[i])){
//         return i;
//       }else{
//         hs.add(a[i]);
//       }
//     }
//     return 0;
//   }
//   public static void main(String[] args) {
//     array1 a1=new array1();
//     int a[]={3,5,6,4,2,3,5};
//     int duplicates= a1.duplicate(a);
//     System.out.println("new array is"+duplicates);
//   }
// }


// 6.Find teh number of even and odd element present in array:

// public class array1 {

//       public static void main(String[] args) {
//                 int even=0;
//                 int odd=0;
//                 int a[]={3,5,6,4,2,3,5};
//         for(int i=0;i<a.length;i++){
//             if(a[i]%2==0){
//             even++;
//             }else{
//             odd++;
//             }
//         }
//             System.out.println("total even are"+even+"total odd are"+odd);
//     }
// }


// 7.Find the missing number in ana array:
 class array1 {
    public void missing(){
        int a[]={1,2,4,5,6};
        int n=a.length+1;
        System.out.println(n);
        int expextecd_sum=n*(n+1)/2;
        System.out.println(expextecd_sum);
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=sum;
        };
        int missing_number= expextecd_sum-sum;
        System.out.println("missing number"+missing_number);
    }
}
    public static void main(String[] args){
        array1 a1=new array1();
        a1.missing();    
}