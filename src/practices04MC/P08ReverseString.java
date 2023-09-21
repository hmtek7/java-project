package practices04MC;

public class P08ReverseString {
    /*      TASK:
        reverseString isminde bir method create ediniz.
        Bu method bir String'i parametre olarak alsın.
        Ve bu method, girilen String'i tersten print etsin.
        Örn: String = "Java'yı Seviyorum."
        Print: .muroyiveS ıy'avaJ
         */
    public static void main(String[] args) {
        String str= "Java'yı Seviyorum.";
        System.out.println(reverseString(str));
    }
    public static String reverseString(String str){
        String tersInput="";
        tersInput=tersInput.trim();
        for (int i = str.length()-1; i >=0 ; i--) {
            tersInput += str.substring(i,i+1);
            // tersInput += str.charAt(i);

        }
        return tersInput;
    }
}
