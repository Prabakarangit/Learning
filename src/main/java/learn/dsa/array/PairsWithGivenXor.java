package learn.dsa.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
// https://www.interviewbit.com/problems/pairs-with-given-xor/?authuser=1
public class PairsWithGivenXor {

    public static void main(String[] args) {
        System.out.println(solve(Arrays.asList(5,4,10,15,7,6), 5));
    }

    static int solve(List<Integer> A, int B) {
        Map<Integer, Integer> map = new HashMap<>();
        int count =0;
        for(int a : A){
            int ans = B^a;
            if(map.containsKey(ans)){
                count += map.get(ans);
            }
            if(map.containsKey(a)){
                map.put(a, map.get(a) + 1) ;
            }else{
                map.put(a, 1);
            }
        }
        return count;

    }
}
