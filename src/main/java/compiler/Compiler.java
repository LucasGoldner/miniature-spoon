package compiler;

import java.io.IOException;
import org.antlr.v4.runtime.*;

import antlr.output.LangLexer;
import utils.Color;

public class Compiler {
    private String path;

    public Compiler(String path) {
        this.path = path.endsWith(".lan") ? path : ""; 
    }

    public void lexer() throws IOException {
        if(!path.isEmpty()) {
            CharStream charStream = CharStreams.fromFileName(path);
            LangLexer lexer = new LangLexer(charStream);
            CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);

            for(int i = 0; i < commonTokenStream.getNumberOfOnChannelTokens(); i++) {
                Token token = commonTokenStream.getTokens().get(i);
                String type = lexer.getVocabulary().getSymbolicName(token.getType());

                if(type.equals("ERROR")) {
                    type = Color.coloredString("[" + type + "]", "red");
                } else {
                    type = Color.coloredString("[" + type + "]", "blue");
                }

                System.out.println(type + " " + token.getText());
            }
        }

        /* 
        for(int i=0; i < commonTokenStream.getNumberOfOnChannelTokens(); i++){
            String type = lexer.getVocabulary().getSymbolicName(commonTokenStream.getTokens().get(i).getType());
            if(type.equals("ERROR")){
                System.out.println("ERRO na linha "+ commonTokenStream.getTokens().get(i).getLine()+" coluna "+commonTokenStream.getTokens().get(i).getCharPositionInLine()+" caracter inválido: "+commonTokenStream.getTokens().get(i).getText());
            }else{
                System.out.print(type);
                System.out.println(" : " + commonTokenStream.getTokens().get(i).getText());
            }
        }*/
    }
}
