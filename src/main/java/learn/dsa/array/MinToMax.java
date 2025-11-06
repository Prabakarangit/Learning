package learn.dsa.array;

//https://www.codechef.com/practice/course/arrays/ARRAYS/problems/OPMIN?authuser=0
public class MinToMax {
    public int countNonMinimum(int[] a) {
        int n = a.length;
        int count = 0;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            if(a[i] < min){
                min = a[i];
            }
        }

        for(int i=0; i<n; i++){
            if(a[i]>min){
                count++;
            }
        }

        return count;

    }

}
