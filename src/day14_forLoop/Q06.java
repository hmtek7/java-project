package day14_forLoop;

public class Q06 { public static void main(String[] args) {
    //Verilen stringdeki tekrarsiz  karakterleri ekrana yazdiran kodu yaziniz
    String str="sssssssellllaaaaaaamarda";
    for (int i = 0; i <str.length() ; i++) {
        char ch=  str.charAt(i);
        if (str.indexOf(ch)==str.lastIndexOf(ch)){
            System.out.print(ch);

        }

    }
    System.out.println("");
    String str1="javaaa";
    System.out.println(str1.indexOf('a'));
    System.out.println(str1.lastIndexOf('a'));


}
}

