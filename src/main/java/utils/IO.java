package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

public class IO {
    private static final String ROOT = "src/main/resources/";

    public static void read(String file) {
        String error = Color.coloredString("[Error]", "red");

        try {
            BufferedReader buffer = new BufferedReader(new FileReader(file));
            
            String line = buffer.readLine();
            while(line != null) {
                System.out.println(line);
                line = buffer.readLine();
            }

            buffer.close();

        } catch (FileNotFoundException e) {
            System.out.println(error + " " + file + " not found");
        } catch (IOException e) {
            System.out.println(error + " something's gone wrong");
        }
        
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
