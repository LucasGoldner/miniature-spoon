package compiler;

import java.io.IOException;

import org.antlr.v4.runtime.*;

import antlr.output.LangLexer;

import utils.Color;
import utils.IO;

public class Compiler {
    private String path;

    public Compiler(String file) {
        this.path = null;

        if(IO.exists(file)) {
            this.path = file;
            if(!this.path.endsWith(".lan")) {
                String warning = Color.coloredString("[Warning]", "yellow");
                System.out.println(warning + " " + this.path + " does not have .lan extension");
            }

        } else {
            String error = Color.coloredString("[Error]", "red");
            System.out.println(error + " " + file + " not found");
        }
    }
    
    public void lexer() throws IOException {
        if(this.path != null) {
            CharStream cs = CharStreams.fromFileName(path);
            LangLexer lexer = new LangLexer(cs);
            CommonTokenStream cts = new CommonTokenStream(lexer);

            int errors = 0;
            for(int i = 0; i < cts.getNumberOfOnChannelTokens(); i++) {
                Token token = cts.getTokens().get(i);
                String type = lexer.getVocabulary().getSymbolicName(token.getType());
                
                String mgs = "";
                String color = "blue";
                if(type.equals("ERROR")) {
                    color = "red";
                    errors += 1;
                    mgs = "[l:" + token.getLine() + ", c:" + token.getCharPositionInLine() + "] ";
                }

                type = Color.coloredString("["+type+"]", color);
                System.out.println(type + " " + mgs + token.getText());
            }

            if(errors != 0) {
                String error = Color.coloredString("[Error]", "red");
                System.out.println(error + " " + this.path + " has been rejected");
            }
        }
    }
}
