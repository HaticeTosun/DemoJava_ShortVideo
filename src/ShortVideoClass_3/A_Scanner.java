package ShortVideoClass_3;


import java.util.Scanner;

public class A_Scanner {
    public static void main(String[] args) {


        //Scanner
        Scanner scan=new Scanner(System.in);
        System.out.println("Please write your birth place");
        String s1 = scan.next();
        System.out.println("You were born in ==> "+ s1);
        System.out.println("Please write your eye color");
        String s2 = scan.next();
        System.out.println("The color of your eyes are==> "+ s2);
        System.out.println("Please write your favorite color");
        String s3 =scan.next();
        System.out.println("My Favorite color is==> " + s3);
        System.out.println("Please write your name");
        String s4 = scan.next();
        System.out.println("Your name is ==> "+ s4);
        System.out.println("Write your age");
        int i1=scan.nextInt();
        System.out.println("your age is ==> " + i1);
        System.out.println("Write your birth year");
        int i2= scan.nextInt();
        System.out.println("you are born in==> " + i2);

        //


    }
}
