package SquareRoot;

public class MostDivisors {
    private static int countDivisors(int n){
        int counter = 0;
        for (int i=1; i<=n; i++) {
            if ( n % i == 0) counter++;
        }
        return counter;
    }
    public static void main(String[] args) {
        int mostDivisors = 1;
        int mostDivisorsAmount = 1;
        int divisors;
        for (int i = 1; i<10001; i++){
            divisors = countDivisors(i);
            if (divisors > mostDivisorsAmount){
                    mostDivisors = i;
                    mostDivisorsAmount = divisors;
            }
        }
        System.out.println(mostDivisors + " divisors: " + mostDivisorsAmount);
    }
}
