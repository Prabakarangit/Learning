package org.dsa.array;

import java.util.ArrayList;

public class PrimeNumbers {

    public ArrayList<Integer> sieve(int A) {

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=2; i<A; i++){

            boolean prime = true;
            for(int j=2; j<=Math.sqrt(i); j++){
                if(i%j==0){
                    prime =false;
                    break;
                }
            }
            if(prime){
                list.add(i);

            }

        }
        return list;
    }

}
