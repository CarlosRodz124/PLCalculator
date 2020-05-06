
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.misc.*;
import polynomial.Polynomial;
import polynomial.PolynomialImp;


import java.io.IOException;

public class antlrParser {

    public static void main(String[] args) throws IOException {
     try {
         CharStream charStream = CharStreams.fromFileName("inputExamplePoly");
         polyLexer polylexer = new polyLexer(charStream);
         CommonTokenStream commonTokenStream = new CommonTokenStream(polylexer);
         polyParser polyparser = new polyParser(commonTokenStream);

         ParseTree tree = polyparser.program();

         Myvisitor visitor = new Myvisitor();
         visitor.visit(tree);
         System.out.println("done");
     }
     catch (IOException e){
         e.printStackTrace();
     }
    }

}

class Myvisitor extends polyBaseVisitor<Object> {


    @Override public Object visitExp(polyParser.ExpContext ctx) {
        return visitChildren(ctx);
    }
    @Override public Object visitSumpolynomial(polyParser.SumpolynomialContext ctx) {
        String[] tokens = ctx.getText().split("\\$");
        Polynomial P1= new PolynomialImp(tokens[1]);
        Polynomial P2 = new PolynomialImp(tokens[3]);
        Polynomial P3 = P1.add(P2);
        System.out.println(P3);
        System.out.println(tokens[1]);
        System.out.println(tokens[3]);
        return visitChildren(ctx);
    }
    @Override public Object visitSubpolynomial(polyParser.SubpolynomialContext ctx) {
        String[] tokens = ctx.getText().split("\\$");
        Polynomial P1= new PolynomialImp(tokens[1]);
        Polynomial P2 = new PolynomialImp(tokens[3]);
        Polynomial P3 = P1.subtract(P2);
        System.out.println(P3);
        System.out.println(tokens[1]);
        System.out.println(tokens[3]);
        return visitChildren(ctx);
    }

    @Override public Object visitMulpolynomial(polyParser.MulpolynomialContext ctx) {
        String[] tokens = ctx.getText().split("\\$");
        Polynomial P1= new PolynomialImp(tokens[1]);
        Polynomial P2 = new PolynomialImp(tokens[3]);
        Polynomial P3 = P1.multiply(P2);
        System.out.println(P3);
        System.out.println(tokens[1]);
        System.out.println(tokens[3]);
        return visitChildren(ctx);
    }

    @Override public Object visitMulcpolynomial(polyParser.MulcpolynomialContext ctx) {
        String[] tokens = ctx.getText().split("\\$");
        Polynomial P1= new PolynomialImp(tokens[1]);
        Integer c = new Integer(tokens[3]);
        Polynomial P3 = P1.multiply(c);
        System.out.println(P3);
        System.out.println(tokens[1]);
        System.out.println(tokens[3]);
        return visitChildren(ctx);
    }

    @Override public Object visitDerpolynomial(polyParser.DerpolynomialContext ctx) {
        String[] tokens = ctx.getText().split("\\$");
        Polynomial P1= new PolynomialImp(tokens[2]);
        Polynomial P3 = P1.derivative();
        System.out.println(P3);
        System.out.println(tokens[2]);
        return visitChildren(ctx);
    }

    @Override public Object visitIntegralpolynomial(polyParser.IntegralpolynomialContext ctx) {
        String[] tokens = ctx.getText().split("\\$");
        Polynomial P1= new PolynomialImp(tokens[2]);
        Polynomial P3 = P1.indefiniteIntegral();
        System.out.println(P3);
        System.out.println(tokens[2]);
        return visitChildren(ctx);
    }

    @Override public Object visitDefintegralpolynomial(polyParser.DefintegralpolynomialContext ctx) {
        String[] tokens = ctx.getText().split("\\$");
        Polynomial P1= new PolynomialImp(tokens[2]);
        Integer a = new Integer(tokens[3]);
        Integer b = new Integer(tokens[4]);
        double P3 = P1.definiteIntegral(a, b);
        System.out.println(P3);
        System.out.println(tokens[2]);
        System.out.println(tokens[3]);
        System.out.println(tokens[4]);
        return visitChildren(ctx);
    }

    @Override public Object visitEvalpolynomial(polyParser.EvalpolynomialContext ctx) {
        String[] tokens = ctx.getText().split("\\$");
        Polynomial P1= new PolynomialImp(tokens[2]);
        Integer x = new Integer(tokens[3]);
        double P3 = P1.evaluate(x);
        System.out.println(P3);
        System.out.println(tokens[2]);
        System.out.println(tokens[3]);
        return visitChildren(ctx);
    }

    @Override public Object visitDegree(polyParser.DegreeContext ctx) {
        String[] tokens = ctx.getText().split("\\$");
        Polynomial P1= new PolynomialImp(tokens[2]);
        double P3 = P1.degree();
        System.out.println(P3);
        System.out.println(tokens[2]);
        return visitChildren(ctx);
    }

    @Override public Object visitEqualpolynomial(polyParser.EqualpolynomialContext ctx) {
        String[] tokens = ctx.getText().split("\\$");
        Polynomial P1= new PolynomialImp(tokens[1]);
        Polynomial P2 = new PolynomialImp(tokens[3]);
        boolean P3 = P1.equals(P2);
        System.out.println(P3);
        System.out.println(tokens[1]);
        System.out.println(tokens[3]);
        return visitChildren(ctx);
    }

    @Override public Object visitTerm(polyParser.TermContext ctx) { return visitChildren(ctx); }

    @Override public Object visitMonomial(polyParser.MonomialContext ctx) { return visitChildren(ctx); }

    @Override public Object visitPolynomial(polyParser.PolynomialContext ctx) {
        return visitChildren(ctx);
    }


    @Override public Object visitString(polyParser.StringContext ctx) { return visitChildren(ctx); }

    @Override public Object visitFactor(polyParser.FactorContext ctx) { return visitChildren(ctx); }

    @Override public Object visitExpList(polyParser.ExpListContext ctx) { return visitChildren(ctx); }

    @Override public Object visitPropExpList(polyParser.PropExpListContext ctx) { return visitChildren(ctx); }

    @Override public Object visitIdList(polyParser.IdListContext ctx) { return visitChildren(ctx); }

    @Override public Object visitPropIdList(polyParser.PropIdListContext ctx) { return visitChildren(ctx); }

    @Override public Object visitDef(polyParser.DefContext ctx) { return visitChildren(ctx); }

    @Override public Object visitEmpty(polyParser.EmptyContext ctx) { return visitChildren(ctx); }

    @Override public Object visitBool(polyParser.BoolContext ctx) { return visitChildren(ctx); }

    @Override public Object visitUnop(polyParser.UnopContext ctx) { return visitChildren(ctx); }

    @Override public Object visitSign(polyParser.SignContext ctx) { return visitChildren(ctx); }

    @Override public Object visitBinop(polyParser.BinopContext ctx) { return visitChildren(ctx); }

    @Override public Object visitId(polyParser.IdContext ctx) { return visitChildren(ctx); }

    @Override public Object visitInteger(polyParser.IntegerContext ctx) { return visitChildren(ctx); }

}
