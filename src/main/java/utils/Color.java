package utils;

public class Color {
    private static final String RESET = "\u001B[0m";

    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String BLUE = "\u001B[34m";
    private static final String YELLOW = "\u001B[33m";
  
    public static String coloredString(String str, String op) {
        String color = "";

        if(op.equals("red"))
            color = RED;
        else if(op.equals("green"))
            color = GREEN;
        else if(op.equals("blue"))
            color = BLUE;
        else if(op.equals("yellow"))
            color = YELLOW;

        return color + str + RESET;
    }
}
