public class Spiralmatrix {
        public int spiral(int [][]mat){
        int n=mat.length;
        int m=mat[0].length;
        int left =0;
        int right=m-1;
        int top=0;
        int bottom=n-1;
        while(left<=right && top<=bottom)
        {
            for(int i=left;i<right;i++){
                System.out.print(mat[top][i]+" ");
            };
            top++;
            for(int i=top;i<bottom;i++){
                System.out.print(mat[right][i]+" ");
            };
            right--;
            for(int i=right;i>left;i--){
                System.out.print(mat[bottom][i]+" ");
            }; 
            bottom--;
            for(int i=bottom;i>top;i--){
                System.out.print(mat[left][i]);
               
            };
            left++;
        }
        return bottom;
     }
            public static void main(String[] args) {
            int mat[][]={
                         {1,2,3,4,5},
                         {6,7,8,9,10},
                         {11,12,13,14,15},
                         {16,17,18,19,20,21},
                         {22,23,24,25,26,27}};
                         Spiralmatrix sp=new Spiralmatrix();
                         sp.spiral(mat) ;  
                             
        }
    }