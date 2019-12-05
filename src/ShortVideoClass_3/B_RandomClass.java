package ShortVideoClass_3;

import java.util.Random;

public class B_RandomClass {
    public static void main(String[] args) {
        Random rnd= new Random();

        int randomNum = rnd.nextInt();
        System.out.println(randomNum);

        int randomNum1 = rnd.nextInt(10);
        System.out.println(randomNum1);

        int randomNum2= rnd.nextInt(100);
        System.out.println(randomNum2);


        Random rnd2= new Random();
        double d1 =rnd2.nextInt();
        System.out.println(d1);

        double d2 = rnd2.nextInt(100);
        System.out.println(d2);





    }
}
