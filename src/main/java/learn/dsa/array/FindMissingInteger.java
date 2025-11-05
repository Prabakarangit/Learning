package learn.dsa.array;

public class FindMissingInteger {
    public int firstMissingPositive(int[] A) {

        int n =A.length;

        for(int i=0; i<n; i++){

            if(A[i] == i+1 || A[i] <=0 || A[i] > n){
                continue;
            }
            //swap to the position

            int position = A[i]-1;
            if(A[i] != A[position]){
                int temp = A[i];
                A[i] = A[position];
                A[position] = temp;

                if(A[i] != i+1){
                    i--;
                }
            }

        }


        for(int i=0;i<n;i++){
            if(i!=A[i]-1){
                return i+1;
            }
        }

        return n+1;

    }
}
