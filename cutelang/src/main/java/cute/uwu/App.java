package cute.uwu;

import cute.uwu.gen.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromFileName(args[0]);

        cuteLangLexer lexer = new cuteLangLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        cuteLangParser parser = new cuteLangParser(tokens);

        ParseTree tree = parser.program();

        //System.out.println(tree.toStringTree(parser));

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new LLVMActions(), tree);

    }
}
