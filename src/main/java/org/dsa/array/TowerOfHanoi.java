package org.dsa.array;

public class TowerOfHanoi {

    public static void main(String[] args) {
        System.out.println(towerOfHanoi(2, 1, 3, 2));
    }

    static int towerOfHanoi(int n, int from, int to, int aux) {

        int count = 0;
        recurr(n, count, from, to, aux);
        return count;

    }


    static void  recurr(int n, int count, int from, int to, int aux){
        if(n==1){
            //move from source to dest
            count++;
            return;
        }else{
            recurr(n-1, count, from, aux, to);//move from source to aux
            count++;
            recurr(n-1, count, aux, to, from); //move from aux to dest
        }


    }
}
