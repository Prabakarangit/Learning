package learn.dsa.array;

public class CorporateFlightBookings {

    public static void main(String[] args) {
        int n=5;
        int[][] bookings = {{1,2,10},{2,3,20},{2,5,25}};
        int answer[] = new int[n];
        for(int i=0; i<bookings.length; i++){
            int first = bookings[i][0];
            int last = bookings[i][1];
            int seats = bookings[i][2];
            answer[first-1] += seats;
            if(last != n) {
                answer[last] -= seats;
            }
        }
        //prefix sum:
        for(int i=1; i<n; i++){
            answer[i]+=answer[i-1];
        }
        for(int i=0 ;i<n;i++){
            System.out.println(answer[i]);
        }

    }
}
