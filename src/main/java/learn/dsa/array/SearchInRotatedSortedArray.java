package learn.dsa.array;

public class SearchInRotatedSortedArray {


    public static void main(String[] args) {
        System.out.println(search(new int[]{4,5,6,7,0,1,2}, 0));
    }

    static int search(int[] nums, int target) {
        int h=nums.length-1, l=0, m;
        while(h>=l){
            m = l + (h-l)/2;
            if(nums[m] == target){
                return m;
            }

            if(nums[m] >= nums[l]){
                if(target >= nums[l] && target <nums[m]){
                    h = m-1;
                }
                else{
                    l = m+1;
                }
            }else{

                if(target > nums[m] && target <=nums[h]){
                    l = m+1;
                }else{
                    h = m-1;
                }
            }

        }
        return -1;


    }
}
