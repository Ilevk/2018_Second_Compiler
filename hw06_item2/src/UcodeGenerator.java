import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class UcodeGenerator {
    static void minigo2ucode(String mgFile) throws IOException {
        MiniGoLexer lexer = new MiniGoLexer(CharStreams.fromFileName("test.go"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MiniGoParser parser = new MiniGoParser(tokens);
        ParseTree tree = parser.program();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new UCodeGenListener(), tree);

    }
}
