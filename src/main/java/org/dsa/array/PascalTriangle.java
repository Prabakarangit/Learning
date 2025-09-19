package org.dsa.array;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {


    public static void main(String[] args) {
        System.out.println(generate(5));

    }
    public static List<List<Integer>> generate(int numRows) {


        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        for(int i=0; i< numRows; i++){
            if(i==0){
                temp.add(1);
            }else{
                temp.add(1);
                for(int j=1; j<i; j++){
                    int val = ans.get(i-1).get(j) + ans.get(i-1).get(j-1);
                    temp.add(val);
                }
                temp.add(1);
            }
            ans.add(temp);
            temp = new ArrayList<>();

        }
        return ans;



    }
}
