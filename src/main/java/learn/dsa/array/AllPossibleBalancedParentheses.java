package learn.dsa.array;

import java.util.ArrayList;
import java.util.List;

//https://www.naukri.com/code360/problems/all-possible-balanced-parentheses_985274
public class AllPossibleBalancedParentheses {

    public static void main(String[] args) {
        System.out.println(balancedParentheses(3));
    }

    public static ArrayList<String> balancedParentheses(int n)
    {
        ArrayList<String> res = new ArrayList();
        recur(res, new StringBuilder(), n, n);

        return res;

    }
    public static void recur(List<String> res, StringBuilder temp, int open, int close){
        if(open ==0 && close == 0){
            res.add(temp.toString());
            return;
        }
        if(open > 0){
            temp.append('(');
            recur(res, temp, open-1, close);
            temp.deleteCharAt(temp.length()-1);
        }
        if(close > open){
            temp.append(')');
            recur(res, temp, open, close-1);
            temp.deleteCharAt(temp.length()-1);
        }
    }




}

