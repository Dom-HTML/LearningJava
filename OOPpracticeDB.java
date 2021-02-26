public class userDatabase {

    private boolean userDatabase(String userInput){
        String[] usernames = {"dom", "bob"};
        boolean searchStatus = false;
        for(String item : usernames){
            if(item == userInput){
                searchStatus = true;
                break;
            }
        }
        return searchStatus;
    }

    private boolean passDatabase(String passInput){
        String[] passwords = {"dom", "bob"};
        boolean searchStatus = false;
        for(String item : passwords){
            if(item == passInput){
                searchStatus = true;
                break;
            }
        }
        return searchStatus;
    }

    public boolean getUser(String userInput){
        boolean userFound = userDatabase(userInput);
        return userFound;
    }

    public boolean getPass(String passInput){
        boolean passFound = passDatabase(passInput);
        return passFound;
    }
}
