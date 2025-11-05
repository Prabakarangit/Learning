package learn.dsa.array;

public class NextPermutation {
    public static void main(String[] args) {
      //  int[] nums = {16,27,25,23,25,16,12,9,1,2,7,20,19,23,16,0,6,22,16,11,8,27,9,2,20,2,13,7,25,29,12,12,18,29,27,13,16,1,22,9,3,21,29,14,7,8,14,5,0,23,16,1,20};
       int[] nums = {3,2,1};
        int n = nums.length;

        int x=-1,y=-1;
        for(int i=n-1;i>0;i--){
            if(nums[i-1] < nums[i]){
               x=i-1;
                break;
            }
        }

        if(x!=-1){
            int small = nums[x+1];
            y=x+1;
            for(int i=x+2;i<n;i++){
                if(nums[i] < small && nums[i] > nums[x]){
                    small = nums[i];
                    y=i;
                }
            }

            int temp = nums[x];
            nums[x] = nums[y];
            nums[y] = temp;


        }
        
        for(int i=x+1; i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i] > nums[j]){
                    int temp1 = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp1;
                }
            }
        }
        for(int i: nums){
            System.out.println(i);
        }




    }
}
