
//Problem 07 - Login System

import java.util.*;

public class Login{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Username: ");
        String username = sc.nextLine();
        if(username.equals("Aashish")){
            System.out.println("Password: ");
            String password = sc.nextLine();
            if(password.equals("1234")){
                System.out.println("Login Successful");
            }
            else{
                System.out.println("Password Incorrect!!");
            }
        }
        else{
            System.out.println("Username not found!!");
        }
        sc.close();
    }
}
