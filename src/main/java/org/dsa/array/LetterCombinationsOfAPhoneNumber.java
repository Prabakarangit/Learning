package org.dsa.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfAPhoneNumber {

    public static void main(String[] args) {
        List<String> res = letterCombinations("23");
        for(String r : res){
            System.out.println(r);
        }

    }

    public static List<String> letterCombinations(String digits) {

        Map<String, String> map = new HashMap<>();
        map.put("2", "abc");
        map.put("3", "def");
        map.put("4", "ghi");
        map.put("5", "jkl");
        map.put("6", "mno");
        map.put("7", "pqrs");
        map.put("8", "tuv");
        map.put("9", "wxyz");

        String s = new String();
        int p=0;
        List<String> result = new ArrayList<>();

        recurr(digits, map, s, p, result);


        return result;
    }

    static void recurr(String digits, Map<String, String> map, String s, int p, List<String> result){

        //Base/Stopping condition
        if(s.length()==digits.length()){
            result.add(s);
            return;
        }

        //process
        String chars = map.get(digits.charAt(p)+"");
        for(int i=0; i<chars.length();i++){
            s+=chars.charAt(i)+"";
            recurr(digits, map, s, p+1, result);
            s = new StringBuilder(s).deleteCharAt(s.length()-1).toString();
        }


    }

}
