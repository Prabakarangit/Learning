package learn.dsa.array;

public class SetMatrixZeroes {


    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int m = matrix.length;
        int n = matrix[0].length;

        int c0=1;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    if(j==0){
                        c0=0;
                    }else {
                        matrix[0][j] = 0;
                    }
                }
            }
        }

        for(int i=1; i<matrix.length; i++){
            for(int j=1; j<matrix[0].length; j++){
                if(matrix[i][0] ==0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        if(matrix[0][0] == 0){
            for(int j=0;j<n;j++){
                matrix[0][j] = 0;
            }
        }

        if(c0==0){
            for(int i=0; i<m; i++){
                matrix[i][0] = 0;
            }
        }


        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
