package learn.dsa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AllocateBooks {

    public static void main(String[] args) {

        System.out.println(books(new ArrayList<>(Arrays.asList(97, 26, 12, 67, 10, 33, 79, 49, 79, 21, 67, 72, 93, 36, 85, 45, 28, 91, 94, 57, 1, 53, 8, 44, 68, 90, 24 )), 26));
    }

    static int books(ArrayList<Integer> A, int B) {

        if(A.size() < B){
            return -1;
        }

        int h=A.stream().reduce(0,Integer::sum),
                l=A.stream().max(Comparator.naturalOrder()).get(),
                m, n=-1;

        while(h>=l){

            m = l + (h-l)/2;
            int b = B;

            if(check(m, A, b)){
                n = m;
                h = m-1;
            }else{
                l = m+1;
            }
        }
        return n;

    }


    static boolean check( int N,  List<Integer> A,  int B){

        int curr_pages = 0;


        for(int i=0;i<A.size();i++){

            curr_pages += A.get(i);

            if(curr_pages > N){
                B--;
                curr_pages = A.get(i);
            }

        }
        if(B<1){
            return false;
        }

        return true;

    }
}
