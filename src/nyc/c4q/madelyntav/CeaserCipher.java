package nyc.c4q.madelyntav;
import java.util.Scanner;

/**
 * Created by c4q-madelyntavarez on 3/27/15.
 */


public class CeaserCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstMessage = new String();
        String secondMessage = new String();

        System.out.println("Give me a secret message");
        firstMessage = scanner.nextLine();

        for (int i = 0; i < firstMessage.length(); i++) {
            char c = firstMessage.charAt(i);
            int code = (int) c;
            int codeConv = 0;
            if ((code > 119 && code < 123) || (code > 87 && code < 91)) {
                codeConv = code - 23;
                System.out.print(Character.toChars(codeConv));
            } else if ((code > 96 && code < 120) || (code > 64 && code < 88)) {
                codeConv = code + 3;
                System.out.print(Character.toChars(codeConv));
            } else if (code == 32) {
                System.out.print(" ");
            } else {
                System.out.println("\nTry again, invalid entry");
            }
        }

        System.out.println("\nGive me a second message");
        secondMessage = scanner.next();
        for (int i = 0; i < secondMessage.length(); i++) {
            char c = secondMessage.charAt(i);
            int code = (int) c;
            int codeConv2 = 0;

            if ((code > 116 && code < 123) || (code > 84 && code < 91)) {
                codeConv2 = code - 20;
                System.out.print(Character.toChars(codeConv2));
            } else if ((code > 96 && code < 117) || (code > 64 && code < 85)) {
                codeConv2 = code + 6;
                System.out.print(Character.toChars(codeConv2));
            } else if (code == 32) {
                System.out.print(" ");
            } else {
                System.out.println("\nTry again, invalid entry");
            }
        }
        if (sameMesage(firstMessage, secondMessage)) {
            System.out.println(("\nBoth messages are the same"));
        } else
            System.out.println("\nMessages do not match");
    }

    public static boolean sameMesage(String firstMessage, String secondMessage){
        return (firstMessage.equals(secondMessage));


    }









//    public static boolean sameCity(Person person1, Person person2){
//            return (person1.getCity().equalsIgnoreCase(person2.getCity()))
        }




