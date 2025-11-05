package learn.dsa.array;

import java.util.List;

public class MaxSumContiguousSubArray {

    public int maxSubArray(final List<Integer> A) {
        int ans = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i : A){
            currSum+=i;
            ans = currSum > ans ? currSum : ans;
            currSum = currSum > 0 ? currSum : 0;
        }
        return ans;
    }
}
