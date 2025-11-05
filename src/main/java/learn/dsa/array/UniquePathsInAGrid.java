package learn.dsa.array;

//https://www.interviewbit.com/problems/unique-paths-in-a-grid/#:~:text=Given%20a%20grid%20of%20size,are%20added%20to%20the%20grids.
public class UniquePathsInAGrid {
    // approach1: recursion + DP
    Integer[][] dp;
    public int uniquePathsWithObstacles(int[][] A) {
        int m = A.length; int n = A[0].length;
        dp = new Integer[m][n];
        return recurr(A, 0, 0, m, n);
    }
    public int recurr(int[][] A, int a, int b, int c, int d){
        if(a >= c || b >= d || A[a][b] == 1 ){
            return 0;
        }
        if(a==c-1 && b == d-1){
            return 1;
        }
        if(dp[a][b] != null) return dp[a][b];
        return dp[a][b] = recurr(A, a+1, b, c, d) + recurr(A, a, b+1, c, d);
    }

    //approach2: tabular approach
    public class Solution {
        Integer[][] dp;
        public int uniquePathsWithObstacles(int[][] A) {
            int m = A.length;
            int n = A[0].length;

            if(A[0][0] == 1 || A[m-1][n-1] == 1){
                return 0;
            }


            dp = new Integer[m][n];

            dp[m-1][n-1] = 1;
            for(int i= m-2; i>=0; i--){
                if(A[i][n-1] == 0){
                    dp[i][n-1] = dp[i+1][n-1];
                }else{
                    dp[i][n-1] = 0;
                }
            }
            for(int i= n-2; i>=0; i--){
                if(A[m-1][i] == 0){
                    dp[m-1][i] = dp[m-1][i+1];
                }else{
                    dp[m-1][i] = 0;
                }
            }

            for(int i= m-2; i>=0; i--){
                for(int j= n-2; j>=0; j--){
                    if(A[i][j] == 0){
                        dp[i][j] = dp[i+1][j] + dp[i][j+1];
                    }else{
                        dp[i][j] = 0;
                    }
                }
            }
            return dp[0][0];
        }

    }

}
