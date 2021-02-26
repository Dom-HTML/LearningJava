import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class HelloWorld {

    private static String randLetter() {
        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","r","x","y","z"};
        int randIndex = (int)(Math.random() * 26);
        String letter = alphabet[randIndex];
        return letter;
    }

    public static String genString() {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the length of the word you want = ");
        int len = parseInt(obj.nextLine());
        String word = "";
        for (int i = 0; i < len; i++){
            word = word + randLetter();
        }
        return word;
   }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("1.random string / 2.login:");
        int userInput = parseInt(obj.nextLine());
        if(userInput == 1) {
            System.out.println(genString());
        }
        if(userInput == 2) {
            Login.main();
        }
    }
}
