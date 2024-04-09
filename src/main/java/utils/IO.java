package utils;

import java.io.File;

import java.util.ArrayList;
import java.util.List;

public class IO {
    private static final String ROOT = "src/main/resources/";

    public static boolean exists(String file) {
        return (new File(file)).exists();
    }

    public static List<String> getFiles() {
        return getFiles(ROOT);
    }

    public static List<String> getFiles(String path) {
        File file = new File(path);
        List<String> list = new ArrayList<>();

        if(file.exists() && file.isDirectory()) {
            for(File f : file.listFiles()) {
                if(f.isDirectory()) {
                    list.addAll(getFiles(f.getPath()));
                } else if(f.isFile()) {
                    list.add(f.getAbsolutePath());
                }
            }
        }

        return list;
    }
}
