package learn.dsa.array;

import java.util.ArrayList;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(4);
        list.add(3);
        System.out.println(maxArea(list));
    }

    static int maxArea(ArrayList<Integer> A) {

        int i=0,j=A.size()-1;
        int maxArea=0;
        while(i<j){

            int area = (j-i)*Math.min(A.get(i), A.get(j));

            if(area > maxArea){
                maxArea = area;
            }

            if(A.get(i) < A.get(j)){
                i++;
            }else{
                j--;
            }

        }
        return maxArea;


    }
}
