
import utils.*;

import java.io.IOException;

import compiler.Compiler;

public class Main {
    public static void main(String[] args) throws IOException {
        if(args.length != 0) {
            String file = args[0];
            
            Compiler compiler = new Compiler(file);
            compiler.lexer();

        }
    }
}