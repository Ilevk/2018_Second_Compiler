import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.List;

public class MiniGoPrintListener extends MiniGoBaseListener {
    ParseTreeProperty<String> newTexts = new ParseTreeProperty<String>();

    @Override
    public void enterFun_decl(MiniGoParser.Fun_declContext ctx) {
        StringBuilder sb = new StringBuilder();
//        System.out.println("Hello enter fun decl");
//        String params = newTexts.get(ctx.params());
        sb.append(ctx.FUNC().getText());
        sb.append(" ");
        sb.append(ctx.IDENT().getText());
        newTexts.put(ctx, sb.toString());
        System.out.print(newTexts.get(ctx));
    }

    @Override
    public void enterParams(MiniGoParser.ParamsContext ctx) {
//        System.out.println("Hello enter param");
//        List<MiniGoParser.ParamContext> params = ctx.param();
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for (int i = 0; i < ctx.param().size(); i++) {
            sb.append(ctx.param(i).IDENT().getText());
            sb.append(" ");
            sb.append(ctx.param(i).type_spec().getText());
            if (i != ctx.param().size() - 1)
                sb.append(", ");

//            newTexts.put(ctx, ctx.param(0).IDENT().getText());
//            newTexts.put(ctx,ctx.param(0).type_spec().getText());
        }
        newTexts.put(ctx, sb.toString());
        System.out.print(newTexts.get(ctx));
    }

    @Override
    public void exitParams(MiniGoParser.ParamsContext ctx) {
        newTexts.put(ctx, ")");
        System.out.print(newTexts.get(ctx));
    }

    @Override
    public void enterCompound_stmt(MiniGoParser.Compound_stmtContext ctx) {
//        StringBuilder sb = new StringBuilder();
//        sb.append("\n{");
        newTexts.put(ctx, "\n{\n");
        System.out.print(newTexts.get(ctx));
    }

    @Override
    public void exitCompound_stmt(MiniGoParser.Compound_stmtContext ctx) {
//        StringBuilder sb = new StringBuilder();
//        sb.append("\n{");
        newTexts.put(ctx, "}");
        System.out.print(newTexts.get(ctx));
    }

    @Override
    public void enterExpr(MiniGoParser.ExprContext ctx) {
        String s1 = null, s2 = null, op = null;
//        System.out.println("Hello enter expr");
//        newTexts.put(ctx,"," + ctx);
        if (isBinaryOperation(ctx)) {

            s1 = ctx.IDENT().getText();
            s2 = ctx.expr(0).getText();
            op = ctx.getChild(1).getText();

            newTexts.put(ctx, "...." + s1 + " " + op + " " + s2 + "\n");
            System.out.print(newTexts.get(ctx));
        }

        if (isPrefixOperation(ctx)) {
            StringBuilder sb = new StringBuilder();
            sb.append("....");
            sb.append(ctx.op.getText());
//            sb.append(ctx)
//            s1 = ctx.op.getText();
            newTexts.put(ctx, sb.toString());
//            System.out.print(s1);
        }


        if (isSingleIdent(ctx)) {
            newTexts.put(ctx, ctx.getText());

//            System.out.print(newTexts.get(ctx));
        }
        if (isSingleExpr(ctx)) {
//            System.out.print("Call");
//            newTexts.put(ctx, ctx.getText());
//            System.out.print(newTexts.get(ctx));
        }

//        if(M)
    }

    public void exitExpr(MiniGoParser.ExprContext ctx){
        String s1 = null, s2 = null, op = null;




    }

    public boolean isBinaryOperation(MiniGoParser.ExprContext ctx) {
        return ctx.getChildCount() == 3 && ctx.getChild(1) != ctx.expr();
    }

    public boolean isPrefixOperation(MiniGoParser.ExprContext ctx) {
        return ctx.getChildCount() == 2 && ctx.getChild(0) != ctx.expr() && ctx.getChild(0) != ctx.IDENT();
    }

    public boolean isSingleExpr(MiniGoParser.ExprContext ctx) {
        return ctx.getChildCount() == 1 && ctx.getChild(0) != ctx.IDENT();
    }

    public boolean isSingleIdent(MiniGoParser.ExprContext ctx){
        return ctx.getChildCount() == 1 && ctx.getChild(0) == ctx.IDENT();
    }

    public boolean isIdentExpr(MiniGoParser.ExprContext ctx) {
        return ctx.getChildCount() == 2 && ctx.getChild(0) != ctx.expr() && ctx.getChild(1) == ctx.expr();
    }


    @Override
    public void enterDecl(MiniGoParser.DeclContext ctx) {
//        System.out.println("Hello enter decl");
//        newTexts.put(ctx, "enter decl " );
//        System.out.println(newTexts.get(ctx));
//        newTexts.put(ctx, "%%" + ctx.fun_decl());
    }


    @Override
    public void exitFun_decl(MiniGoParser.Fun_declContext ctx) {
//        System.out.println("Hello exit fun decl");
//        newTexts.put(ctx, "++++"+ctx.getText());
//        System.out.println(newTexts.get(ctx));
    }

    @Override
    public void enterVar_decl(MiniGoParser.Var_declContext ctx) {
//        System.out.println("Hello enter var decl");
//        newTexts.put(ctx, "..." + ctx.getText());
//        System.out.println(newTexts.get(ctx));
    }

    @Override
    public void exitVar_decl(MiniGoParser.Var_declContext ctx) {
//        System.out.println("Hello exit var decl");
//        newTexts.put(ctx, "\n" + ctx.getText());
    }


}
