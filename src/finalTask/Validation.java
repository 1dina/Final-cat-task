package finalTask;

import java.util.regex.Pattern;

public class Validation {
    static boolean CapitalChar = false;
    static char ch;
    static Result result = new Result();
 // I made methods static ,so I feel free to call the method without creating an object from the class Validation
    static Result valdiateEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";
        Pattern pat = Pattern.compile(emailRegex);
        if (email == "") {
            result.setValid(false);
            result.setMessage("please try again");


        } else {
            //matches method make sure that the given email is following the format ***@**.**
            if (pat.matcher(email).matches()) {
                result.setValid(true);
            } else result.setMessage("please try again");
        }
        return result;
    }

    static Result validatePassword(String pass) {

        if (pass == "") {
            result.setValid(false);
            result.setMessage("please try again");
        } else {
            //we made a character array to check if there's at least one capital letter
            for (int i = 0; i < pass.length(); i++) {
                ch = pass.charAt(i);
                if (Character.isUpperCase(ch)) {
                    CapitalChar = true;
                    break;

                }

            }

            if ((pass.length() <= 20) && (pass.length() >= 8) && (CapitalChar)) {
                result.setValid(true);
                result.setMessage("You have signed up!");
            } else {
                result.setValid(false);
                result.setMessage("please try again");
            }
        }
        return result;
    }
}
