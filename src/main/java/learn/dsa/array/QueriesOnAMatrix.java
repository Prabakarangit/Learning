package learn.dsa.array;

public class QueriesOnAMatrix {

    public int[][] solveQueries(int n, int[][] Queries) {
        int[][] mat = new int[n][n];
        for (int i = 0; i < Queries.length; i++) {
            int a = Queries[i][0];
            int b = Queries[i][1];
            int c = Queries[i][2];
            int d = Queries[i][3];
            mat[a][b] += 1;
            if (d + 1 < n) mat[a][d + 1] -= 1;
            if (c + 1 < n) mat[c + 1][b] -= 1;
            if (c + 1 < n && d + 1 < n) mat[c + 1][d + 1] += 1;
        }
        //prefix sum for matrix
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                mat[i][j] += mat[i][j - 1];
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] += mat[i - 1][j];
            }
        }
        return mat;
    }
}
