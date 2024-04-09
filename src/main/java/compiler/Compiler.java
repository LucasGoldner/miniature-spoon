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
        } else {
            String error = Color.coloredString("[Error]", "red");
            System.out.println(error + " " + file + " not found");
        }
    }
    
    public void lexer() throws IOException {
        if(this.path != null) {
            if(this.path.endsWith(".lan")) {
                CharStream charStream = CharStreams.fromFileName(path);
                LangLexer lexer = new LangLexer(charStream);
                CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);

                for(int i = 0; i < commonTokenStream.getNumberOfOnChannelTokens(); i++) {
                    Token token = commonTokenStream.getTokens().get(i);
                    String type = lexer.getVocabulary().getSymbolicName(token.getType());

                    if(type.equals("ERROR")) {
                        type = Color.coloredString("["+type+"]", "red");
                    } else {
                        type = Color.coloredString("["+type+"]", "blue");
                    }

                    System.out.println(type + " " + token.getText());
                }
            }
        }
    }
}
