package learn.dsa.array;

//https://www.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
public class GcdOfTwoNumbers {

    public static int gcd(int a, int b) {


        if(a==0){
            return b;
        }
        if(b==0){
            return a;
        }

        if(a>b){
            int rem = a%b;
            if(rem == 0){
                return b;
            }
            return  gcd(rem, b);

        }
        else{
            int rem = b%a;
            if(rem == 0){
                return a;
            }
            return gcd(rem, a);

        }

    }

    public static void main(String[] args) {
        System.out.println(gcd(5,12));
    }
}
