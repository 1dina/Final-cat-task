package finalTask;

import java.util.Scanner;

import static finalTask.Validation.result;


public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
  //while true loop until the user enter the right format of email which is *****@**.** it doesn't matter number of stars
        //what matters is the order of (@,.)
        while (true) {
            System.out.println("Enter your mail : ");
            String Email = in.nextLine();
            Validation.valdiateEmail(Email);

            if (result.getValid()) {
                break;
            } else System.out.println(result.getMessage());
        }
        // the same idea as above plus you can't enter an empty password
        while (true) {
            System.out.println("your password :");
            String pass = in.nextLine();
            Validation.validatePassword(pass);
            if (result.getValid()) {
                System.out.println(result.getMessage());
                break;
            }
            System.out.println(result.getMessage());

        }
    }
}
