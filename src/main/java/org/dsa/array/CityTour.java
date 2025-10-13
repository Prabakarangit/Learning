package org.dsa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CityTour {

    final int MOD = 1000000007;
    long[] fact;
    long[] invFact;

    public int solve(int A, int[] B) {

        int M = B.length;
        int U = A - M;


        if (M == 0) {
            return 0;
        }
        if (A == M) {
            return 1;
        }

        Arrays.sort(B);
        preComputeFactorials(A);

        List<Integer> gaps = new ArrayList<>();
        gaps.add(B[0] - 1);
        for (int i = 0; i < M - 1; i++) {
            gaps.add(B[i + 1] - B[i] - 1);
        }
        gaps.add(A - B[M - 1]);
        long result = fact[U];
        for (int i = 0; i < gaps.size(); i++) {
            int g = gaps.get(i);
            if (g >= 1)
                result = (result * invFact[g]) % MOD;
        }

        for (int i = 1; i < gaps.size() - 1; i++) {
            int g = gaps.get(i);
            if (g >= 1)
                result = (result * modPow(2, g - 1)) % MOD;
        }

        return (int) result;

    }


    public long modPow(long a, long b) {
        long res = 1;
        a %= MOD;

        while (b > 0) {
            //odd number
            if ((b & 1) == 1) {
                res = (res * a) % MOD;
            }
            a = (a * a) % MOD;
            b >>= 1;

        }
        return res;
    }

    public void preComputeFactorials(int n) {
        fact = new long[n + 1];
        invFact = new long[n + 1];
        fact[0] = 1;
        //factorial
        for (int i = 1; i <= n; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
        }
        //invFactorial
        invFact[n] = modPow(fact[n], MOD - 2);
        for (int i = n; i > 0; i--) {
            invFact[i - 1] = (invFact[i] * i) % MOD;
        }
    }

}




