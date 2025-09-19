package org.dsa.array;

import java.util.ArrayList;

public class AllFactors {

    public ArrayList<Integer> allFactors(int A) {
        ArrayList<Integer> list = new ArrayList<>();

        if(A==0){
            list.add(0);
            return list;
        }
        if(A==1){
            list.add(1);
            return list;
        }

        list.add(1);
        for(int i=2;i<=A/2;i++){
            if(A%i == 0){
                list.add(i);
            }

        }
        list.add(A);
        return list;

    }
}
