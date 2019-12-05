package ShortVideoClass_3;

public class SimpleForLoops {
    public static void main(String[] args) {
        for (int i=0 ; i<=10;i++){
            System.out.print(i);
        }
        System.out.println("\n+++++++++++++++++++++++++++++");
        for (int i = 10; i>=0 ;i--){
            System.out.print(i);
        }
        System.out.println("\n+++++++++++++++++++++++++++++");

        //sum the numbers

       int total=0;
        for (int k =1;k<6;k++){
            total= total+k;
            System.out.println(total);
        }
        System.out.println("\n+++++++++++++++++++++++++++++");


        for (int i = 0; i < 6; i++) {
            int total2 =0;
            total2=total2+i;
            System.out.println(total2);
        }
        System.out.println("\n+++++++++++++++++++++++++++++");
        int total3=0;
        for (int i = 0;i<100;i++) {
            total3=total3+i;
            System.out.println(total3);
        }
        System.out.println("\n+++++++++++++++++++++++++++++");




    }
}
