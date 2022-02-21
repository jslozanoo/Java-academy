package Topic3;
import java.util.Arrays;
import java.util.List;

public class Login {
    private final List<String> passwordsArray;
    private final String loginAttempt;

    public Login(String loginAttempt){
        passwordsArray = Arrays.asList("because", "can", "do", "must", "we", "what");
        this.loginAttempt = loginAttempt;
    }

    public String replaceLogin(){
        return this.passwordsArray.stream().reduce(this.loginAttempt, (partialString, word) ->
                partialString.replace(word, "1"));
    }
    public String splitLogin(){
        String loginSplit = this.passwordsArray.stream().reduce(this.loginAttempt, (partialString, word)->
                partialString.replace(word, " " + word + " "));
        return loginSplit.trim().replace("  ", " ");
    }
}