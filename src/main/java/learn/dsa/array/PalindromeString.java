package learn.dsa.array;

public class PalindromeString {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    static int isPalindrome(String A) {

        char[] chars = A.toCharArray();
        String regex = "[a-zA-Z]";
        StringBuilder sb = new StringBuilder();
        for(char c : chars){
            if((c>='a' && c<='z') || (c>='A' && c<='Z') || (c>= '0' && c<='9')){
                sb.append(c+"");
            }

        }
        String input = sb.toString();
        String reversedString = sb.reverse().toString();
        if(input.equalsIgnoreCase(reversedString)){
            return 1;
        }
        return 0;

    }

}
