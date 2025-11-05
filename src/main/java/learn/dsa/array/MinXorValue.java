package learn.dsa.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// https://www.interviewbit.com/problems/min-xor-value/?authuser=1
public class MinXorValue {

    public static void main(String[] args) {
        System.out.println(findMinXor(Arrays.asList(0, 2, 5, 7)));
    }

    static int findMinXor(List<Integer> A) {

        A.sort(Comparator.naturalOrder());

        int ans = Integer.MAX_VALUE;

        for(int i=0; i<A.size()-1; i++){
            ans = Math.min(ans, A.get(i)^A.get(i+1));
        }

        return ans;



    }
}
