package learn.dsa.array;


import java.util.Scanner;

//https://www.codechef.com/practice/course/strings/STRINGS/problems/WCC?authuser=0
public class WorldChessChampionship {

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int p = scanner.nextInt();
            String matchResult = scanner.next();
            char[] res = matchResult.toCharArray();
            int carlsen = 0;
            int chef = 0;
            for(char r : res){
                if(r == 'C'){
                    carlsen++;
                }else if(r == 'N'){
                    chef++;
                }else if(r == 'D'){
                    carlsen++;
                    chef++;
                }
            }

            if(carlsen > chef){
                System.out.println(60 * p);
            }else if(carlsen < chef){
                System.out.println(40 * p);
            }if(carlsen == chef){
                System.out.println(55 * p);
            }


        }

    }
}
