package day16doWhileLoop;

public class Q02 {
    public static void main(String[] args) {
        // ’m’ harfinden baslayarak ‘c’ harfine kadar tum harfleri yazdirin.
        //=====forloop========
        for (char i = 'm'; i >='c' ; i--) {
            System.out.print(i+" ");
        }
        System.out.println("");
        //=====Whileloop========
        char harf='m';
        while (harf>='c'){
            System.out.print(harf+" ");
            harf--;
        }
        System.out.println("");
        //=====doWhileloop========
        char letter='m';
        do{
            System.out.print(letter+" ");
            letter--;
        }while (letter>='c');

    }
}
