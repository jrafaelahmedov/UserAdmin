package util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileUtil {
    public static void whriteObjectToFile(Object obj, String fileName) {
        FileOutputStream fout = null;
        ObjectOutputStream out = null;

        try {
            fout = new FileOutputStream(fileName);
            out = new ObjectOutputStream(fout);
            out.writeObject(obj);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (fout != null) {
                try {
                    fout.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public static Object readObjectFromFile(String name) throws Exception{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(name));
        Object  obj = in.readObject();
        return obj;
    }
}
