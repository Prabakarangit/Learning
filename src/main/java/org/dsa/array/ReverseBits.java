package org.dsa.array;

import java.util.ArrayList;
import java.util.List;

public class ReverseBits {


    public static void main(String[] args) {
        System.out.println(reverse(3));
    }
    static long reverse(long a) {
        StringBuilder sb = new StringBuilder();
        for(int i=31;i>=0;i--){
            int mask = 1 << i;
            sb.append((a & mask) != 0 ? "1" : "0");
        }
        char[] chars = sb.toString().toCharArray();
        for(int i=0,j=sb.length()-1; i<sb.length()/2; i++, j--){
            if(chars[i] != chars[j]){
                chars[i] = (char)(chars[i]^1);
                chars[j] = (char)(chars[j]^1);
            }
        }
        Long out = Long.parseLong(String.valueOf(chars), 2);




        return out;
    }



}
