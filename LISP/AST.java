import java.util.*;
public class AST{
    public static void lexer(String input){
        String[] tokens = input.split(" ");
        System.out.println("The tokens are:");
        for (String token : tokens) {
            System.out.println(token);
            try 
            {
                double d = Double.parseDouble(token);
                return "number";
            } 
            catch (NumberFormatException nfe) {
                if(token.equals("(") || token.equals(")"))
                    return "paran";
                else if(token.equals("+"))
                    return "add";
                else if(token.equals("-"))
                    return "sub";
                else if(token.equals("*"))
                    return "mul";
                else if(token.equals("/"))
                    return "div";
                else
                    return "Ident";
            }        
        }
    }
    public static void parser(String[] args){
        
    }
}