package org.dsa.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CountingTriangles {

    public static void main(String[] args) {
        System.out.println(nTriang(Arrays.asList(1,1,1)));
    }

    static int nTriang(List<Integer> A) {
        A.sort(Comparator.naturalOrder());

        int ans = 0;

        for(int i=2;i<A.size();i++){

            int l=0,r=i-1;

            while(l<r){

                if((A.get(l) + A.get(r) > A.get(i))){
                    int modNum = (int)Math.pow(10,9) +7;
                    int temp = (r-l)%modNum;
                    ans = (ans + temp)%modNum;
                    r--;
                }else{
                    l++;
                }
            }

        }

        return ans;


    }
}
