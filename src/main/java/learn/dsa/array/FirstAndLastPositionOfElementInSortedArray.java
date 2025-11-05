package learn.dsa.array;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/?authuser=1
public class FirstAndLastPositionOfElementInSortedArray {

    public static void main(String[] args) {
        searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8);
    }

    static int[] searchRange(int[] nums, int target) {


        int h = nums.length-1, l=0, m =0,first=-1,last=-1;

        while(h>=l){

            m=l+(h-l)/2;

            if(nums[m] > target){
                h = m-1;
            }
            else if(nums[m]<target){
                l=m+1;
            }else{
                first = m;
                h = m-1;
            }

        }

        h = nums.length-1; l=0; m=0;

        while(h>=l){
            m=l+(h-l)/2;

            if(nums[m] > target){
                h = m-1;
            }else if(nums[m] < target){
                l = m+1;
            }else{
                last = m;
                l = m+1;
            }
        }

        System.out.println(first+ " "+last);

        int[] res = {first, last};
        return res;


    }
}
