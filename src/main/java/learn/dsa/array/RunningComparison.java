package learn.dsa.array;

import java.util.Scanner;

//https://www.codechef.com/practice/course/arrays/ARRAYS/problems/RUNCOMPARE?authuser=3
public class RunningComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }

            int count =0;
            for(int i=0; i< n; i++){
                if(a[i] > (2*b[i]) || b[i] > (2*a[i])){
                    continue;
                }
                count++;
            }
            System.out.println(count);
        }
    }

}
