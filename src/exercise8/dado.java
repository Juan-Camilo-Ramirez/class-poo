package exercise8;

import java.util.Random;

public class dado {
    public static void main(String[] args) {
        Random numbdice = new Random();
        int firstdice;
        int seconddice;
        int counter=0;
        int plus;
        firstdice=1+numbdice.nextInt(6);
        seconddice=1+numbdice.nextInt(6);
        plus=firstdice+seconddice;
        while (counter==1) {
            if (plus>=4 || plus<=10){

            }
        }
        if (plus == 6 || plus == 7) {
            System.out.println("");
        }


        System.out.println(firstdice);
        System.out.println(seconddice);
        System.out.println(plus);

        public static int rollDice(){
             // pick random die values
             int die1 = 1 + randomNumbers.nextInt( 6 ); // first die roll
             int die2 = 1 + randomNumbers.nextInt( 6 ); // second die roll
                int sum = die1 + die2; // sum of die values

            System.out.printf( "Player rolled "+ die1, die2, sum );
            return sum;

            }





    }
}
