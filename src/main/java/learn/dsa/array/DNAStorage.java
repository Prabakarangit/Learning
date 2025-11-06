package learn.dsa.array;

import java.util.Scanner;

public class DNAStorage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            StringBuilder res = new StringBuilder();
            for(int i=0; i< n-1; i+=2){
                String subString = s.substring(i, i+2);
                if("00".equals(subString)){
                    res.append('A');
                }
                else if("01".equals(subString)){
                    res.append('T');
                }
                else if("10".equals(subString)){
                    res.append('C');
                }
                else if("11".equals(subString)){
                    res.append('G');
                }
            }
            System.out.println(res.toString());
        }
    }
}
