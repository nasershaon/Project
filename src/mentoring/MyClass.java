package mentoring;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        /*System.out.println("Hello world");
        First java Program */

        /*int i= 123;
        double a= 100.25;
        String s= "Hello";
        char c='A';
        boolean b = true;
        System.out.println("My Value is"+" "+i+" "+ a+" "+" "+s);*/
//Casting

        //int myInt=9;
       /* double myDouble=10.555;
        int myInt=(int) myDouble;
        System.out.println(myInt);

        //operator
        int sum1= 100+50;
        int sum2= sum1+100;
        int sum3= sum1+sum2;
        System.out.println("Value "+ sum3);

       int time =20;
        if (20>25){
            System.out.println("Good Morning");
        } else {
            System.out.println("Good Evening");
        }*/
       //Switch Case &  //Scanner
        int menu ;
        Scanner yourMenu= new Scanner(System.in);
        System.out.println("Enter Your Menu Number");
        menu=yourMenu.nextInt();
        switch (menu){
            case 1:
                System.out.println("Pizza");
                break;
            case 2:
                System.out.println("Fries");
                break;
            case 3:
                System.out.println("burger");
                break;
            case 4:
                System.out.println("Supe");
                break;
            case 5:
                System.out.println("Main Course");
                break;
            case 6:
                System.out.println("Drinks");
                break;
            case 7:
                System.out.println("No Value");
                break;

                }






    }
}
