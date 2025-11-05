package learn.dsa.array;

import java.util.ArrayList;
import java.util.List;

public class AddOneToNumber {


    public static void main(String[] args) {

        List<Integer> A = new ArrayList<>();
        A.add(0);
        A.add(6);
        A.add(0);
        A.add(6);
        A.add(4);
        A.add(8);
        A.add(8);
        A.add(1);

        System.out.println(plusOne(A));
    }
    public static List<Integer> plusOne(List<Integer> A) {

        boolean allNine=true;
        for(int i = A.size()-1; i >= 0; i--){
            if(A.get(i) == 9){
                A.set(i, 0);
            }else{
                A.set(i, A.get(i)+1);
                allNine=false;
                break;
            }
        }
        if(allNine){
            A.add(0, 1);
        }

        while(A.get(0) == 0){
            A.remove(0);
        }


        return A;

    }
}
