package org.dsa.array;

public class SingleElementInSortedArray {

    public static void main(String[] args) {
        System.out.println(singleNonDuplicate(new int[]{1,1,2,3,3,4,4,8,8}));
    }

    static int singleNonDuplicate(int[] nums) {

        int h = nums.length-1, l=0, m=0;

        while(h>l){

            m = l + (h-l)/2;

            if(m %2 != 0){
                m--;
            }
            if(nums[m] == nums[m+1]){
                l = m +2;
            }else{
                h = m;
            }

        }

        return nums[l];


    }

}
