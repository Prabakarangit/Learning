package learn.dsa.array;

import java.util.Arrays;
import java.util.Scanner;

//https://www.codechef.com/practice/course/arrays/ARRAYS/problems/SEARCHINARR?authuser=3
public class SearchAnElementInAnArray {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        int l = 0;
        int h = n-1;
        String found = "NO";
        while(l<=h){
            int mid = (l+h)/2;
            if(a[mid]==x){
                found = "YES";
                break;
            }else if(a[mid] < x){
                l = mid+1;
            }else{
                h=mid-1;
            }
        }
        System.out.println(found);

    }
}
