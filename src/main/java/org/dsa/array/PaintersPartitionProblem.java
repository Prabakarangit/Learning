package org.dsa.array;

import java.util.ArrayList;
import java.util.Arrays;

public class PaintersPartitionProblem {


    public static void main(String[] args) {

        System.out.println(paint(1, 1000000, new ArrayList<>(Arrays.asList(1000000, 1000000))));

    }

    static int paint(int A, int B, ArrayList<Integer> C) {

        long l=C.get(0),h=(long)C.get(0),m,n=-1;

        for(int i=1; i<C.size(); i++){
            l = Math.max(l, C.get(i));
            h += (long)C.get(i);
        }


        while(h>=l){
            m = l +(h-l)/2;

            if(check(m, C, A)){
                n = m;
                h = m-1;
            }else{
                l = m +1;

            }
        }

        return (int)((n*B)%10000003);

    }


    static boolean check(long N, ArrayList<Integer> C, long A){

        long current_length=0;
        long painters = A;

        for(int i=0; i<C.size(); i++){

            current_length += (long)C.get(i);

            if(current_length > N){
                painters--;
                current_length = (long)C.get(i);
            }
        }

        if(painters<1){
            return false;
        }
        return true;

    }
}
