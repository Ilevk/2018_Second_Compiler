import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class MiniGoPrintListener extends MiniGoBaseListener {
    ParseTreeProperty<String> newTexts = new ParseTreeProperty<String>();
    int depth = 0;

    @Override
    public void enterFun_decl(MiniGoParser.Fun_declContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(ctx.FUNC().getText());
        sb.append(" ");
        sb.append(ctx.IDENT().getText());
        newTexts.put(ctx, sb.toString());
        System.out.print(newTexts.get(ctx));
    }

    @Override
    public void enterIf_stmt(MiniGoParser.If_stmtContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(ctx.IF().getText());
        newTexts.put(ctx, sb.toString());
        System.out.print(newTexts.get(ctx));
    }


    @Override
    public void enterParams(MiniGoParser.ParamsContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for (int i = 0; i < ctx.param().size(); i++) {
            sb.append(ctx.param(i).IDENT().getText());
            sb.append(" ");
            sb.append(ctx.param(i).type_spec().getText());
            if (i != ctx.param().size() - 1)
                sb.append(", ");

        }
        newTexts.put(ctx, sb.toString());
        System.out.print(newTexts.get(ctx));
    }

    @Override
    public void exitParams(MiniGoParser.ParamsContext ctx) {
        newTexts.put(ctx, ")\n");
        System.out.print(newTexts.get(ctx));
    }

    @Override
    public void enterCompound_stmt(MiniGoParser.Compound_stmtContext ctx) {
        newTexts.put(ctx, "{\n");
        depth++;
        System.out.print(newTexts.get(ctx));
    }

    @Override
    public void exitCompound_stmt(MiniGoParser.Compound_stmtContext ctx) {
        depth--;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append("....");
        }

        sb.append("}\n");
        newTexts.put(ctx, sb.toString());
        System.out.print(newTexts.get(ctx));
    }

    @Override
    public void enterExpr(MiniGoParser.ExprContext ctx) {
        String s1 = null, s2 = null, op = null;
        if (isBinaryOperation(ctx)) {
            if (ctx.getChild(0) == ctx.IDENT()) {
                s1 = ctx.IDENT().getText();
                s2 = ctx.expr(0).getText();
                op = ctx.getChild(1).getText();
                newTexts.put(ctx, s1 + " " + op + " " + s2 + "\n");
                System.out.print(newTexts.get(ctx));
            }

            if (ctx.getChild(0) == ctx.left) {
                s1 = ctx.left.getText();
                s2 = ctx.right.getText();
                op = ctx.getChild(1).getText();
                newTexts.put(ctx, "(" + s1 + " " + op + " " + s2 + ")\n");
                System.out.print(newTexts.get(ctx));
            }
        }

    }

    @Override
    public void enterStmt(MiniGoParser.StmtContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append("....");
        }
        newTexts.put(ctx, sb.toString());
        System.out.print(newTexts.get(ctx));
    }

    public boolean isBinaryOperation(MiniGoParser.ExprContext ctx) {
        return ctx.getChildCount() == 3 && ctx.getChild(1) != ctx.expr();
    }


    @Override
    public void exitFun_decl(MiniGoParser.Fun_declContext ctx) {
        newTexts.put(ctx, "\n");
        System.out.print(newTexts.get(ctx));
    }
}
