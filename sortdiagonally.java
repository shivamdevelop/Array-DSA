// Sort the matrix diagonally leetcode-1329;
import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;
public class sortdiagonally {
        public static int [][] Diagonally(int mat[][]){
                HashMap<Integer,PriorityQueue<Integer>> map =new HashMap<>();
                int n=mat.length;
                int m=mat[0].length;
                for(int i=0;i<n;i++){
                        for(int j=0;j<m;j++){
                                int key=i-j;
                                map.computeIfAbsent(key, k->  new PriorityQueue<>()).add(mat[i][j]);
                        }
                };
                for(int i=0;i<n;i++){
                        for(int  j=0;j<m;j++){
                                int key=i-j;
                              mat[i][j]= map.get(key).poll();
                              for(int[] row:mat){
                                System.out.println(Arrays.toString(row));
                              }
                        }
                }
return mat;
}
public static void main(String[] args){
 int mat[][]={{0,3,2,1},
                    {2,1,3,0},
                    {2,3,0,1},
                    {1,0,3,2},};
                  int [][] result=Diagonally(mat);
                  System.out.println(result);
        
}
}

