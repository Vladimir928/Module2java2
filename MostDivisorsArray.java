package SquareRoot;


import java.util.ArrayList;

public class MostDivisorsArray {
    private static int countDivisors(int n){
        int counter = 0;
        for (int i=1; i<=n; i++) {
            if ( n % i == 0) counter++;
        }
        return counter;
    }
    public static void main(String[] args){
        int divisors;
        ArrayList<Integer> mostDivisors = new ArrayList<>();
        int mostDivisorsAmount = 1;
        for (int i = 1; i<10001; i++){
            divisors = countDivisors(i);
            if (divisors > mostDivisorsAmount) {
                mostDivisors.clear();
                mostDivisors.add(i);
                mostDivisorsAmount = divisors;
            } else if (divisors == mostDivisorsAmount) mostDivisors.add(i);
        }
        System.out.println(mostDivisors + " " + mostDivisorsAmount);
    }
}
