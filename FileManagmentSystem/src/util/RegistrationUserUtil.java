package util;

import config.Config;
import config.Initializion;
import user.User;

import java.util.ArrayList;
import java.util.Scanner;

public class RegistrationUserUtil {

    public static void registerUser() {
       ArrayList<User> users =Initializion.config.getUsers();
            User user = registration();
            users.add(user);
        Initializion.config.setUsers(users);
    }

    public static User registration() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your username: ");
        String username = scan.nextLine();
        System.out.println("Please enter your password: ");
        String password = scan.nextLine();
        System.out.println("Please enter your name: ");
        String name = scan.nextLine();
        System.out.println("Please enter your surname: ");
        String surname = scan.nextLine();
        System.out.println("Please enter your age: ");
        int age = scan.nextInt();
        boolean agree = true;
        boolean isAdmin = false;
        System.out.println("Your request has been Admin panel , Please wait for Admin accept!");
        User user = new User(username, password, name, surname, age, agree, isAdmin);
        return user;
    }
}
