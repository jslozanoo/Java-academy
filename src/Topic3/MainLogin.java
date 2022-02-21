package Topic3;

public class MainLogin {
    public static void main(String[] args){
        Login login = new Login("wedowhatwemustbecausewecan");

        String test = login.replaceLogin();
        String finalAnswer = login.splitLogin();

        try{
            Double.parseDouble(test);
            System.out.println(finalAnswer);
        }catch (Exception e){
            System.out.println("WRONG PASSWORD");
        }
    }
}

