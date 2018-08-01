package user;


import config.Config;
import config.Initializion;
import org.omg.CORBA.INITIALIZE;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {
    private String username;
    private String password;
    private String name;
    private String surname;
    private int age;
    private boolean status;
    private boolean isAdmin;

    private ArrayList<User> users = null;

    public void setUsers(ArrayList<User> users) {
        this.users = users;
        Initializion.refreshConfig();
    }
    public ArrayList<User> getUsers() {
        return users;
    }

    public User() {
    }

    public User(String username, String password,boolean isAdmin) {
        this.username = username;
        this.password = password;
        this.isAdmin=isAdmin;
    }

    public User(String username, String password, String name, String surname, int age, boolean status, boolean isAdmin) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.status = status;
        this.isAdmin = isAdmin;

    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return
                "username=" + username  +
                ", name=" + name  +
                ", surname=" + surname +
                ", age=" + age;
    }
}
