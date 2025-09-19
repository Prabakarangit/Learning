package org.dsa.array;

import java.util.Arrays;
// https://www.naukri.com/code360/problems/aggressive-cows_1082559?authuser=1&leftPanelTabValue=PROBLEM
public class AggressiveCows {

    public static int aggressiveCows(int []stalls, int k) {

        Arrays.sort(stalls);

        int l=0,h=Integer.MAX_VALUE,m=0;
      /* for(int i=0;i<stalls.length;i++){
           // l = Math.max(l,stalls[i]);
            h+=stalls[i];
       } */
        int out = 0;

        while(h>=l){
            m = l+(h-l)/2;
            if(check(m, stalls, k)){
                out = m;
                l = m+1;
            }else{
                h = m-1;
            }

        }
        return out;
    }


    static boolean check(int N, int[] A, int K){

        int cows=1;
        int lastCowPlaced = A[0];

        for(int i=1; i<A.length; i++){
            if(A[i] - lastCowPlaced >= N){
                cows++;
                lastCowPlaced = A[i];
            }
        }
        if(cows >=K){
            return true;
        }
        return false;


    }

}
