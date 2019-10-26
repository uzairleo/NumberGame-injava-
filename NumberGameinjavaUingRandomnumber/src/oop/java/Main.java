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




//package oop.java;
//import java.util.Scanner;
//class Main{
//    public static void main(String args[]){
//
//        int arr[]={11,22,30,99,100};
//
//        Scanner input=new Scanner( System.in);
//
//        int item=input.nextInt();
//        int loc;
//        int BEG = 0;
//        int END= 4;
//        int MID=BEG+END/2;
//        while ((BEG<=END)&&(arr[MID]!=item)){
//            if (item<arr[MID]){
//                END=MID-1;
//
//            }else
//            {
//                BEG=MID+1;
//            }
//            MID=(BEG+END)/2;
//        }
//        if (arr[MID]==item){
//            loc=MID;
//
//        }else{
//            loc=0;
//        }
//        System.out.println("The item is present on location === "+loc);
//    }
//}
//
//
////package  oop.java;
////import java.util.Scanner;
////
////
////class  Main{
////    public static  void main(String arg[])
////    {
////        char opt='y';
////        Scanner input=new Scanner(System.in);
////        int x=0;
////        int sum=0;
////        while(x>=0){
////            System.out.println("Enter a number u want to calculate its sum factorial ");
////            x=input.nextInt();
////            sum=sum+x;
//////            System.out.println("if u want to continue press y/n");
//////            opt=input.next().charAt(0);
////
////            System.out.println("The Result is == "+sum);
////
////
////        }
////    }
////
////}
////
////
//////package oop.java;
//////
//////import java.io.File;
//////import java.io.FileNotFoundException;
//////import java.util.Scanner;
//////import java.lang.String;
//////public class Main {
//////    static void openFile(String s)throws Exception
//////    {
//////        File file= new File("somefile.txt");
//////    }
//////
//////    public static void main(String[] args) throws Exception{
//////
//////        float a,b, result;
//////        char option;
//////        Scanner cin=new Scanner(System.in);
//////        do {
//////            a=cin.nextInt();
//////            b=cin.nextInt();
//////            if (b==0)
//////            {
//////                try {
//////                    float c = a / b;
//////                }
//////                catch (ArithmeticException e)
//////                {
//////                    System.out.println(e);
//////                }
//////            }else
//////            {
//////                result=a/b;
//////                System.out.println("The Division of two number is == "+result);
//////            }if(b==0){System.out.println("Sorry divide by zero not allowed");}
//////            System.out.println("If u want to continue division press y/N");
//////            option=cin.next().charAt(0);
//////            try {
//////                openFile("somefile.txt");
//////            }catch (FileNotFoundException e)
//////             {
//////                System.out.println("File not found sorry");
//////            }
//////        }while (option=='y');
//////        }
//////
//////}
