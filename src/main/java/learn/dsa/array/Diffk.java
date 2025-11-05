package learn.dsa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Diffk {
    public static void main(String[] args) {
        System.out.println(diffPossible(Arrays.asList(1,2,3), 0));
    }

    static int diffPossible(List<Integer> A, int B) {

        int n = A.size();

        int i=0;
        int j=1;

        while(i<n-1 && j<n){

            if(i==j){
                j++;
            }

            int diff = A.get(j) - A.get(i);

            if(diff == B){
                return 1;
            }
            else if(diff<B){
                j++;
            }else {
                i++;
            }
        }
        return 0;
    }
}
