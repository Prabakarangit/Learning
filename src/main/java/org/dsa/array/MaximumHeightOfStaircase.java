package org.dsa.array;

public class MaximumHeightOfStaircase {

    public static void main(String[] args) {
        System.out.println(solve(7));
    }

    static int solve(int A) {

        long h = A, l=1, m =0,ans=1;

        while(h>=l){

            m = (l + (h-l)/2);


            long num = ((m*(m+1))/2);

            if(num <=A){
                ans = m;
                l = m+1;
            }else{
                h = m-1;
            }


        }

        return (int)ans;



    }
}
