package org.dsa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxNonNegativeSubArray {

    public static void main(String[] args) {
        maxset(Arrays.asList(1, 2, 5, -7, 2, 3));
    }

    static ArrayList<Integer> maxset(List<Integer> A) {

        int start=0,end=0;//result window

        int anchor=0;//starting point of temp window
        long sum=0L, maxSum=0L;
        int n = A.size();
        //i is the endpoint of temp window
        for(int i=0; i< n; i++){
            if(A.get(i)<0){
                anchor = i+1;
                sum = 0;
            } else{
                sum+=A.get(i);
                if(sum > maxSum){
                    start = anchor;
                    end = i;
                    maxSum = sum;
                }else if(sum == maxSum && (i-anchor > end-start)){
                    start = anchor;
                    end = i;
                }else if(sum == maxSum && anchor<start){
                    start =anchor;
                    end =i;
                }


            }


        }

        ArrayList<Integer> list = new ArrayList();
        while(start<=end){
            if(A.get(start) >= 0){
                list.add(A.get(start));
            }
            start++;
        }

        return list;


    }
}
