package day12_string_manipulations;

public class Q10Contains {
    public static void main(String[] args) {
        String str="java ogrenmek cok guzel";
        boolean sonuc=str.contains("ava");
        System.out.println("sonuc = " + sonuc);
        System.out.println(!(str.contains(" ")));
        System.out.println(str.contains("og,J"));
    }
}
