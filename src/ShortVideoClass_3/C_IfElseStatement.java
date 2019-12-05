package ShortVideoClass_3;

import java.util.Random;

public class C_IfElseStatement {
    public static void main(String[] args) {

        Random random = new Random();
        int i1 = random.nextInt(10000);
        System.out.println("i1 is here==> " + i1);


        if (i1 > 9000) {
            System.out.println("YAY!!! for Japan");
        } else if (i1 > 5000) {
            System.out.println("Hawaii is a good option too");
        } else if (i1 > 3000) {
            System.out.println("Miami is also cool");
        } else {
            System.out.println("Grab a pack of chips and watch your favorite show");

        }

        Random rnd = new Random();
        int i = rnd.nextInt(50);
        System.out.println("i is here==>" + i);
        if (i > 40) {
            System.out.println("i>40 woooow");
        } else if (i > 30) {
            System.out.println("i>30  :)");
        } else if (i > 20) {
            System.out.println("i>20 :|");
        } else {
            System.out.println(":' ");

        }
    }
}
