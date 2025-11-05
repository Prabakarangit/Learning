package learn.dsa.array;

public class ExcelColumnTitle {

    public String convertToTitle(int A) {

        StringBuilder sb = new StringBuilder();

        while(A>0){
            int rem = (A-1) % 26;
            sb.append((char) (rem + 'A'));
            A = (A-1)/26;

        }
        return sb.reverse().toString();

    }
}

