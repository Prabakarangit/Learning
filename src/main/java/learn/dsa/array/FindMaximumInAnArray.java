package learn.dsa.array;

import java.util.Scanner;

//https://www.codechef.com/practice/course/arrays/ARRAYS/problems/UWCOI20A?authuser=0
public class FindMaximumInAnArray {

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            int ans = a[0];
            for(int i=1; i<a.length; i++){
                if(a[i] > ans){
                    ans = a[i];
                }
            }
            System.out.println(ans);


        }

    }
}
