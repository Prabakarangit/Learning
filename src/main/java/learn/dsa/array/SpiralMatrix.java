package learn.dsa.array;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int u=0, l=0, r=matrix[0].length-1, d=matrix.length-1;

        List<Integer> res = new ArrayList<>();
        int n = matrix.length;
        int T=0;
        while(u<=d && l<=r){

            if(T==0){
                for(int j=l;j<=r;j++){
                    res.add(matrix[u][j]);
                }
                u++;
                T++;
                T = T%4;
            }

        else if(T==1){
            for(int j=u;j<=d;j++){
                res.add(matrix[j][r]);
            }
            r--;
            T++;
            T=T%4;
        }else if(T==2){
            for(int j=r;j>=l;j--){
                res.add(matrix[d][j]);
            }
            d--;
            T++;
            T=T%4;
        }else if(T==3){
            for(int j=d;j>=u;j--){
                res.add(matrix[j][l]);
            }
            l++;
            T++;
            T=T%4;
        }

    }
        System.out.println(res);





    }
}
