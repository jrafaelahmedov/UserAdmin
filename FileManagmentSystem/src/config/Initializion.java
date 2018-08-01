package config;

import user.User;
import util.FileUtil;

import java.util.ArrayList;

public class Initializion {

    public static Config config = null;

    public static void initialiceConfig(User user) {
        config = new Config(user);
        try {
            Object configobj = FileUtil.readObjectFromFile("Users.ser");
            config = (Config) configobj;
        } catch (Exception ex) {

        }
    }

    public static void refreshConfig() {
        FileUtil.whriteObjectToFile(config, "Users.ser");
    }

}
