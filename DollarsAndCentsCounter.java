package ss.week2;

import java.util.Scanner;

public class DollarsAndCentsCounter {
    private static int dollars;
    private static int cents;

    public DollarsAndCentsCounter(){
        dollars = 0;
        cents = 0;
    }
    public int getCents() {
        return cents;
    }

    public int getDollars() {
        return dollars;
    }

    public void addDollars(int dollars){
        this.dollars = getDollars() + dollars;
    }
    public void addCents(int cents) {
        this.cents = getCents() + cents;
    }

    public void setDollars(int dollars) {
        this.dollars = dollars;
    }

    public void setCents(int cents) {
        this.cents = cents;
    }

    public void add(int dollars, int cents){
        int tempCents = cents + getCents();
        addDollars( dollars );
        if ( tempCents > 99){
            addDollars( tempCents / 100);
            setCents( tempCents % 100);
        } else {
            addCents(cents);
        }
    }

    public void reset(){
        this.setCents(0);
        this.setDollars(0);
    }
    public void printMoney(){
        System.out.println("dollars: " + getDollars() + " , cents: " + getCents());
    }
    public static void main(String[] args){
        DollarsAndCentsCounter counter = new DollarsAndCentsCounter();
        Scanner s = new Scanner(System.in);
        int dollars;
        int cents;
        while (true) {
            counter.printMoney();
            System.out.println("add dollars");
            dollars = s.nextInt();
            System.out.println("cents");
            cents = s.nextInt();
            counter.add(dollars, cents);
        }
    }

}
