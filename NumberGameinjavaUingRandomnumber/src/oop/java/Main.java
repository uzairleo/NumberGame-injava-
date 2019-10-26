//Name : Muhammad Uzair
//classno: 181006
//BSSE(3rd Semester)
//SECTION B
package oop.java;
import java.util.Scanner;
import java.lang.Math;
class Main
    {
        public static void main(String uzairleo[]) {


        int randnumber = (int) ((Math.random() * 100) + 1);
        boolean haswongame = false;
        int guessnumber;
        char choice='n';
        do {
            System.out.println("This is Number Game u have to guess a number btw 1to100");
            Scanner input = new Scanner(System.in);
            for (int i = 10; i > 0; i--) {
                System.out.println("you have" + i + " guesses left " + "\n");

                guessnumber = input.nextInt();
                if (randnumber > guessnumber) {
                    System.out.println("Its greater than " + guessnumber);
                }
                if (randnumber < guessnumber) {
                    System.out.println("Its less than " + guessnumber );

                }
                if (randnumber == guessnumber) {
                    haswongame = true;
                    break;
                }
            }//loop+
            if (haswongame) {
                System.out.println("Congrat u won the game");
                System.out.println("your guess number is finally equal to random number ==" + randnumber + "\n");

            } else {
                System.out.println("Sorry you lose the game ");

            }

            System.out.println("If u want to play Again press y other wise press N to terminate");
            choice=input.next().charAt(0);
        }while (choice=='y');
    }
}




