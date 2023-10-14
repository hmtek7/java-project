package practices05ForLoop;

public class P11 {
    public static void main(String[] args) {
          /*
        kullanıcının girdiği kelimenin palindromik bir kelime olup
        olmadığını bulup ekrana yazdıracağız.
        Palindrome = Tersten okunuşu da aynı olan cümle, kelime ve sayılara denilmektedir.
         */
        String palindrome="ey edip adanada pide ye";
        String reverseInput="";
        for (int i=palindrome.length()-1;i>=0;i--){
            reverseInput+=palindrome.charAt(i);
        }
        if (palindrome.equals(reverseInput)){
            System.out.println("sentence is a palindrome");
        }else{
            System.out.println("sentence is not a palindrome");
        }
    }
}
