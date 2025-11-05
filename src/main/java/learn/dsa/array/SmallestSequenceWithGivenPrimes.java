package learn.dsa.array;

import java.util.ArrayList;

public class SmallestSequenceWithGivenPrimes {

    public static void main(String[] args){
        solve(2,3,5, 10);
    }

    static ArrayList<Integer> solve(int A, int B, int C, int D) {

        ArrayList<Integer> res = new ArrayList<>();
        res.add(1);

        int x=0;
        int y=0;
        int z=0;

        while(D>0){

            int n1 = res.get(x) * A;
            int n2 = res.get(y) * B;
            int n3 = res.get(z) * C;

            int small = n1;
            if(n2<small){
                small =n2;
            }
            if(n3<small){
                small =n3;
            }

            if(n1==small){
                x++;
            }
            if(n2== small){
                y++;
            }if(n3==small){
                z++;
            }
            res.add(small);
            D--;
        }
        res.remove(0);

        return res;




    }
}
