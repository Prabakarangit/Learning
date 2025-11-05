package learn.dsa.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SubMatrixGenerator {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                matrix[i][j] = new Random().nextInt(1,3);
            }
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        List<int[][]> subMatrices = new ArrayList<>();
        for(int r1=0; r1<rows; r1 ++){
            for(int c1=0; c1<cols; c1++){
                for(int r2 = r1; r2<rows; r2++){
                    for(int c2 = c1; c2<cols; c2++){
                        int subRows = r2-r1+1;
                        int subCols = c2-c1+1;
                        int[][] subMatrix = new int[subRows][subCols];
                        for(int r3=0;r3<subRows; r3++){
                            for(int c3=0; c3<subCols; c3++){
                                subMatrix[r3][c3] = matrix[r3+r1][c3+c1];
                            }
                        }
                        subMatrices.add(subMatrix);
                    }
                }

            }
        }
        for(int[][] subMatrix : subMatrices){
            for(int i=0; i<subMatrix.length; i++){
                for(int j=0; j<subMatrix[0].length; j++){
                    System.out.print(subMatrix[i][j]+ " ");
                }
                System.out.println(" ");
            }
        }
    }
}
