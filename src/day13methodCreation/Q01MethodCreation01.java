package day13methodCreation;

public class Q01MethodCreation01 {    public static void main(String[] args) {
//String str="ali";
//int uzunluk=str.length();
    System.out.println(toplama(9, 0));
    System.out.println(toplama(10, 5));
    carpma(5,5);
}
    //method create edildikten sonra method call ile cagrilmasi gerekir


    public static int toplama(int a,int b){
        return a+b;

    }
    public static void carpma (int x,int y){
        int carpim=x*y;
        System.out.println(carpim);
    }


}

