package learn.dsa.array;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/permutations/?authuser=0
public class Permutations {

    public static void main(String[] args) {
        permute(new int[]{1,2,3});
    }

    static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int p=0;
        recurr(nums, ans, p);

    return ans;

    }

    static void recurr(int[] nums, List<List<Integer>> ans, int p){
        //base condition
        if(p == nums.length-1){
           ArrayList<Integer> list = new ArrayList<>();
            for(int n:nums){
                list.add(n);
            }
            ans.add(list);
            return;
        }
        //process
        for(int i=p; i<nums.length;i++) {
            swap(nums, p, i);
            //recursive
            recurr(nums, ans, p + 1);
            //backtracking
            swap(nums, p, i);
        }
    }

        static void swap(int[] nums, int p, int i){
            int temp = nums[p];
            nums[p] = nums[i];
            nums[i] = temp;
        }

}
