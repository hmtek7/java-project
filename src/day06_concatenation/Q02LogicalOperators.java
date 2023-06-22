package day06_concatenation;

public class Q02LogicalOperators {
    public static void main(String[] args) {


        System.out.println(3+2==8||6+5==10&&12-1==9);//false


        System.out.println(5+3==8 && 6+5==10 && 7-2==3);//false


        System.out.println(5+3==8 || 6+5==10 || 7-2==3);//true


        // && isareti & de kullanilabilir ancak arada bir nuans var
        // && isareti ilk false'u buldugunda bu islemin sonucunun false olacagini bilir
        // 			ve geriye kalan islemleri kontrol etmeden sonucu false yazdirir
        // & isareti ise once tum islemleri bitirir sonra sonucu false olarak yazdirir


        int a =10;
        int b =20;
        int c =30;


        boolean result=a>b || b>c||a+b>=c;




        int yas=16;
        int boy=182;
        char gender= 'M';

        System.out.println(yas<20&& boy>180 || gender=='M');



    }
}
