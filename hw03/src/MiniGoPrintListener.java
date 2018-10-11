import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class MiniGoPrintListener extends MiniGoBaseListener {
    ParseTreeProperty<String> newTexts = new ParseTreeProperty<String>();
    @Override
    public void enterFun_decl(MiniGoParser.Fun_declContext ctx){
        newTexts.put(ctx,ctx.getText());
        System.out.println(newTexts.get(ctx));
    }
}
