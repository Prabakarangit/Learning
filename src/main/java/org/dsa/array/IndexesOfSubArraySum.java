package org.dsa.array;

import java.util.ArrayList;

public class IndexesOfSubArraySum {

    public static void main(String[] args) {
        int[] arr ={1,2,3};
        int target = 5;
        subarraySum(arr, target);
    }

    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here

        int i=0,j=0;
        int sum=arr[0];

        ArrayList<Integer> res = new ArrayList<>();

        while(i< arr.length && j < arr.length){
            if(sum == target){
                res.add(i+1);
                res.add(j+1);
                return res;
            }else if(sum < target && j<arr.length-1){
                j++;
                sum+=arr[j];
            }else{
                sum-=arr[i];
                i++;

            }
        }

        res.add(-1);
        return res;

    }
}
