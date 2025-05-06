// factrial of large number =LEFT
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class  factorialoflargenumber {
    public static ArrayList<BigInteger> computefactorial(int n){
        ArrayList<BigInteger> factoArrayList=new ArrayList<>();
        BigInteger result=BigInteger.ONE;

        factoArrayList.add(result);
        for(int i=1;i<=n;i++){
            result=result.multiply(BigInteger.valueOf(i));
            factoArrayList.add(result);
        }
        return factoArrayList;
    }
    

public static void main(String[] args) {
    Scanner sc=new Scanner("enter the number");
    int n=sc.nextInt();
    ArrayList<BigInteger> factorials=computefactorial(n);
    System.out.println("factorial from 0 to"+n+"!");
    for(int i=0;i<=n;i++){
        System.out.println(i+"!="+factorials.get(i));
    }
    
}
};
