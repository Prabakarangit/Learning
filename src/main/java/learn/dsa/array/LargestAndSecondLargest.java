package learn.dsa.array;

import java.util.Scanner;

//https://www.codechef.com/practice/course/arrays/ARRAYS/problems/LARGESECOND?authuser=0
public class LargestAndSecondLargest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            int first = Integer.MIN_VALUE;
            int second = Integer.MIN_VALUE;

            for(int i=0; i<n; i++){
                if(a[i] > first){
                    second = first;
                    first = a[i];
                }else if(a[i] != first && a[i] > second){
                    second = a[i];
                }
            }
            System.out.println(first+second);

        }
    }
}
