package config;


import user.User;
import util.FileUtil;

import javax.jws.soap.SOAPBinding;
import java.awt.*;
import java.io.Serializable;
import java.util.ArrayList;

public class Config extends User implements Serializable {
    private ArrayList<User> users;
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Config(User user) {
        this.user = user;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
     Initializion.refreshConfig();
    }
}
