package practices04MC;

public class P06 {
    /*
        TASK :
        Bir String içinde kaç kelime olduğunu yazdıran bir method create ediniz.
       Test Data:
       Input the string: The quick brown fox jumps over the lazy dog.
 	   Expected Output: Number of words in the string: 9
         */
    public static void main(String[] args) {
        String cumle="Bugun java cok guzel";
        System.out.println(kelimeSayisi(cumle));
    }
    public static int kelimeSayisi(String str){
        int sayac=0;
        char space=' ';
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)==space){
                sayac++;
            }
        }
        return sayac+1;
    }

}
