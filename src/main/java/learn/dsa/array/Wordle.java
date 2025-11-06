package learn.dsa.array;

import java.util.Scanner;

public class Wordle {

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {

            String input1 = scanner.next();
            String input2 = scanner.next();

            char[] a = input1.toCharArray();
            char[] b = input2.toCharArray();

            StringBuilder res = new StringBuilder();

            for(int i=0; i<a.length; i++){
                if(a[i] == b[i]){
                    res.append('G');
                }else{
                    res.append('B');
                }
            }
            System.out.println(res.toString());

        }

    }
}
