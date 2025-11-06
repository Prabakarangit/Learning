package learn.dsa.array;

import java.util.Scanner;

public class DifficultyRatingOrder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] d = new int[n];

            for (int i = 0; i < n; i++) {
                d[i] = scanner.nextInt();
            }

            // Your code goes here

            int temp = Integer.MIN_VALUE;
            boolean ans = true;
            for(int i=0; i<n; i++){
                if(d[i] >= temp){
                    temp = d[i];
                    continue;
                }else{
                    ans = false;
                    break;
                }
            }
            if(ans){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

        }
    }
}
