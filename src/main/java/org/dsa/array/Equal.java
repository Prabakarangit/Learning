package org.dsa.array;

import java.util.HashMap;
import java.util.Map;

public class Equal {

    public static void main(String[] args) {
       int[] ans = equal(new int[]{3, 4, 7, 1, 2, 9, 8});
       for(int a : ans){
           System.out.print(a+" ");
       }
    }

    public static int[] equal(int[] A) {
        Map<Integer, Pair> map = new HashMap<>();
        for(int i=0; i< A.length; i++){
            for(int j=i+1; j<A.length; j++){

                if(!map.containsKey(A[i]+A[j])){
                    map.put(A[i]+A[j], new Pair(i,j));
                }


            }
        }

        int[] ans = null;

        for(int i=0; i< A.length; i++){
            for(int j=i+1; j<A.length; j++){

                if(map.containsKey(A[i] + A[j])){

                    Pair pair = map.get(A[i] + A[j]);
                    int p1 = pair.getFirst();
                    int p2 = pair.getSecond();

                    if(p1 != i && p2 != j){

                        if(ans == null){
                            ans = new  int[]{p1,p2,i,j};
                        }else {
                         //   ans = updateIfSmallerThanBefore(ans, new int[]{p1, p2, i, j});
                        }



                    }
                }



            }
        }

        return ans;


    }

    private static int[] returnSmaller(int[] ans, int[] p) {

        for(int k=0;k<4;k++){
            if(ans[k] > p[k]){
               return p;
            }

        }
        return ans;


    }


    static class Pair{
        int first;
        int second;

        Pair(int first, int second){
            this.first = first;
            this.second = second;
        }

        int getFirst(){
            return first;
        }
        int getSecond(){
            return second;
        }

    }
}
