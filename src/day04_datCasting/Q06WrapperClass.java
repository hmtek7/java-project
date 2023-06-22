package day04_datCasting;

public class Q06WrapperClass {
    public static void main(String[] args) {



        int sayi = 56;
        int sayi2 = 65;

        boolean x = true;
        boolean y = false;
        int booleanControl = Boolean.compare(x, y);


        System.out.println(booleanControl);


        int integerMax= Integer.MAX_VALUE;
        int integerMin= Integer.MIN_VALUE;
        System.out.println(integerMax+" "+integerMin);


        //int smallNumber = Integer.min(sayi, sayi2);
        // System.out.println(smallNumber + 10);


        //   String sayiStr= sayi.toString();

        // System.out.println(sayiStr+10);
    }
}
