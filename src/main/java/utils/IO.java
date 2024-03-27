package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class IO {
    private static final String ROOT = "src/main/resources/";

    public static void run() {
        run(ROOT);
    }

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

    public static void run(String path) {
        File file = new File(path);

        if(file.exists() && file.isDirectory()) {
            for(File f : file.listFiles()) {
                if(f.isDirectory()) {
                    System.out.println(Color.coloredString("[Dir]", "yellow") + " " + f.getName());
                    run(f.getPath());
                } else if(f.isFile()) {
                    System.out.println(Color.coloredString("[File]", "blue") + " " + f.getName());
                }
            }
        }
    }
}
