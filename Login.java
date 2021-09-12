import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String username, password, newPassword;
        int control;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the username: ");
        username = inp.nextLine();

        System.out.print("Enter the password: ");
        password = inp.nextLine();

        if (username.equals("patika") && password.equals("java123")) {
            System.out.println("Login Successful...");
        } else {
            System.out.println("Your username or your password  is incorrect...");
            System.out.println("If you forgot your password press 1 and you create a new password");
            control = inp.nextInt();
            if(control==1){

              Scanner in = new Scanner(System.in);
              System.out.print("Enter the new password : ");
              newPassword = in.nextLine();
              if (newPassword.equals("java123")) {
                  System.out.println("You new password can't be the same as your old password!");
              }else
                  System.out.println("Password successfully created");


            }
        }


    }
}


