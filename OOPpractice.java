import java.util.Scanner;

public abstract class Login {
    public static boolean returnBool;

    public static void main() {
        if(Login.checkUsername(Login.enterUsername())){
            System.out.println("Username accepted");
            if(Login.checkPassword(Login.enterPassword())){
                System.out.println("Password accepted");
            }
        }
    }

    public static String enterUsername(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your username : ");
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static boolean checkUsername(String userInput){
        userDatabase database = new userDatabase();
        if(!database.getUser(userInput)){
            System.out.println("The username you entered does not exist");
            returnBool = false;
        }
        else returnBool = true;
        return returnBool;
    }

    public static String enterPassword(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your password : ");
        String passInput = scanner.nextLine();
        return passInput;
    }

    public static boolean checkPassword(String passInput){
        userDatabase database = new userDatabase();
        if(!database.getPass(passInput)){
            System.out.println("The password you entered is Incorect");
            returnBool = false;
        }
        else returnBool = true;
        return returnBool;
    }
}
