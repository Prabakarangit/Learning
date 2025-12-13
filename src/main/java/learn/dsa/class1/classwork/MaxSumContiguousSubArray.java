package learn.dsa.class1.classwork;

import java.util.List;

//https://www.interviewbit.com/problems/max-sum-contiguous-subarray/?authuser=0
public class MaxSumContiguousSubArray {

    public int maxSubArray(final List<Integer> A) {
        int sum = Integer.MIN_VALUE;
        int currSum = 0;
        for(Integer a : A){
            currSum+=a;
            if(sum < currSum){
                sum = currSum;
            }
            if(currSum < 0){
                currSum = 0;
            }
        }
        return sum;

    }
}
