package learn.dsa.array;

import java.util.ArrayList;

public class MaxContinuousSeriesOf1s {

    static ArrayList<Integer> maxone(ArrayList<Integer> A, int B) {

        int start=0,end=0;
        int zeros = 0;
        int n = A.size();
        int maxSize =-1;
        int startIndex = 0, endIndex=0;

        while(end<n){
            //increase the right window, update zeros;
            if(zeros<=B){
                if(A.get(end) == 0){
                    zeros++;
                }
                end++;
            }
            //decrease the left window, update zeros;
            if(zeros>B){
                if(A.get(start) ==0){
                    zeros--;
                }
                start++;
            }
            //update max window
            if(end-start+1 > maxSize){
                maxSize = end-start+1;
                startIndex = start;
                endIndex = end;

            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        for(int i=startIndex;i<endIndex;i++){
            result.add(i);
        }

        return result;

    }
}
