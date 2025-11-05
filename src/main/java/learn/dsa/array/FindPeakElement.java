package learn.dsa.array;

//Pending clarification
// https://leetcode.com/problems/find-peak-element/?authuser=0
public class FindPeakElement {

    public static void main(String[] args) {

        System.out.println(findPeakElement(new int[]{7,7,6,6,6,5}));
    }

    static int findPeakElement(int[] nums) {

        int h=nums.length-1,l=0,m;


        while(h>=l){
            m = l + (h-l)/2;
            if(m==0 || m==nums.length-1){
                return m;
            }else if((nums[m] > nums[m+1]) && (nums[m] > nums[m-1])){
                return m;
            }else if(nums[m+1] > nums[m]){
                l = m+1;
            }else if(nums[m-1] > nums[m]){
                h=m-1;
            }
        }
        return -1;

    }
}
