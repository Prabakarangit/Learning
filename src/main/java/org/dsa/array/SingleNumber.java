package org.dsa.array;

import java.util.Arrays;
import java.util.List;

// https://www.interviewbit.com/problems/single-number/?authuser=1
public class SingleNumber {

    public static void main(String[] args) {

        System.out.println(singleNumber(Arrays.asList(1, 2, 2, 3, 1)));

    }

    static int singleNumber(final List<Integer> A) {

        int ans = 0;
        for(int a : A){
            ans = ans^a;
        }
        return ans;

    }
}
