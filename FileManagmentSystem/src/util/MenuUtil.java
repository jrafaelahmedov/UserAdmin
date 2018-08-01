package util;

import config.Config;
import config.Initializion;
import javafx.beans.binding.When;
import user.User;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuUtil {
    public static int showMenuNonRegistration() {
        String menuNonRegistration =
                "Please select menu:\n" +
                        "1.Login\n" +
                        "2.Registration\n" +
                        "3.Exit";
        System.out.println(menuNonRegistration);
        Scanner scan = new Scanner(System.in);
        int selectedMenu = scan.nextInt();
        if (selectedMenu > 0 && selectedMenu < 4) {
            return selectedMenu;
        } else {
            System.out.println("Invalid menu selected");
            return -1;
        }
    }

    public static int showMenuUsers() {
        String menuUsers =
                "Please select menu:\n" +
                        "1.Folders\n" +
                        "2.Exit\n";
        System.out.println(menuUsers);
        Scanner scan = new Scanner(System.in);
        int selectedMenu = scan.nextInt();
        if (selectedMenu > 0 && selectedMenu < 3) {
            return selectedMenu;
        } else {
            System.out.println("Invalid menu selected");
            return -1;
        }

    }

    public static int showMenuAdmin() {
        String menuAdmin =
                "Please select menu:\n" +
                        "1.Requests\n" +
                        "2.Folders\n" +
                        "3.Users\n" +
                        "4.Exit\n";
        System.out.println(menuAdmin);
        Scanner scan = new Scanner(System.in);
        int selectedMenu = scan.nextInt();
        if (selectedMenu > 0 && selectedMenu < 7) {
            return selectedMenu;
        } else {
            System.out.println("Invalid menu selected");
            return -1;
        }
    }

    public static int showMenuAdminInfiniti() {
        while (true) {
            int selectedMenu = showMenuAdmin();
            if (selectedMenu == 1) {
                System.out.println(Initializion.config.getUsers().toString());
            } else if (selectedMenu == 2) {

            } else if (selectedMenu == 3) {

            } else if (selectedMenu == 4) {

            }
        }
    }

    public static int showMenuUsersInfiniti() {
        while (true) {
            int selectedMenu = showMenuUsers();
            if (selectedMenu == 1) {

            } else if (selectedMenu == 2) {

            }
        }
    }

    public static int showMenuNonRegistrationInfiniti() throws Exception {
        while (true) {
            int selectedMenu = showMenuNonRegistration();
            if (selectedMenu == 1) {
              User user=LoginUtil.requareLogin();
                Initializion.initialiceConfig(user);
              if(user.isAdmin()){
                  MenuUtil.showMenuAdmin();
              }else{
                  MenuUtil.showMenuUsers();
              }
            } else if (selectedMenu == 2) {
                    RegistrationUserUtil.registerUser();
            } else if (selectedMenu == 3) {
                System.exit(1);
            }
        }
    }
}