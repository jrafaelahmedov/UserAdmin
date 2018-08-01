package util;

import config.Config;
import config.Initializion;
import user.User;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoginUtil {

    public static User login(String username, String password) throws Exception {
        for (int i = 0; i < returnRegisteredUsers().getUsers().size(); i++) {
            if (returnRegisteredUsers().getUsers().get(i).getUsername().equals(username) && returnRegisteredUsers().getUsers().get(i).getPassword().equals(password)) {
                return returnRegisteredUsers(); }
        }
        throw new IllegalArgumentException("Username or Password invalid try again!");
    }


    public static User requareLogin() throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type your username:");
        String username = scan.nextLine();
        System.out.println("Please type your password:");
        String password = scan.nextLine();
        return login(username, password);
    }

    public static Config returnRegisteredUsers() throws Exception{
        Config user = (Config) FileUtil.readObjectFromFile("Users.ser");
        return user;
    }

}
