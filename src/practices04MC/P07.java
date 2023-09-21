package practices04MC;

public class P07 {
    public static void main(String[] args) {
         /*
           TASK  :
           Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method create ediniz.
           Test Data:
           input: "aabbcccccddddaaa"
           output: abcd
        */

        tekrarsizYazdir("xyzalsmnxyz");

    }

    public static void tekrarsizYazdir(String str) {
        String tekrarsizHarfler = "";
        for (int i = 0; i < str.length(); i++) {
            if (!tekrarsizHarfler.contains(str.substring(i,i+1))){
                tekrarsizHarfler+=str.substring(i,i+1);
            }
        }
        System.out.println(tekrarsizHarfler);
    }
}
