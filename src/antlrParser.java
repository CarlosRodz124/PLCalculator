
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.misc.*;
import polynomial.Polynomial;
import polynomial.PolynomialImp;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class antlrParser {

    public static void main(String[] args) throws IOException {
        while(true){
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the program:");
            String program = in.nextLine();
            program="class pl{"+program+"}";
            if(program.equals("quit")){
                System.out.println("Exit");
                break;
            }
            CharStream charStream = CharStreams.fromString(program);
            /*
            // if you want to text the 2 Example files comment every line after the while, otherwise enter the input to text
            CharStream charStream = CharStreams.fromFileName("inputExamplePoly");
            */
            polyLexer polylexer = new polyLexer(charStream);
            CommonTokenStream commonTokenStream = new CommonTokenStream(polylexer);
            polyParser polyparser = new polyParser(commonTokenStream);

            ParseTree tree = polyparser.program();

            Myvisitor visitor = new Myvisitor();
            visitor.visit(tree);


        }

    }

}

class Myvisitor extends polyBaseVisitor<Object> {
    Map<String,Object> symbolTable = new HashMap<String,Object>();
    @Override public Object visitExp(polyParser.ExpContext ctx) {
        return visitChildren(ctx);
    }
    @Override public Object visitSumpolynomial(polyParser.SumpolynomialContext ctx) {
        String[] tokens = ctx.getText().split("\\$");
        Polynomial P1= new PolynomialImp(tokens[1]);
        Polynomial P2 = new PolynomialImp(tokens[3]);
        Polynomial P3 = P1.add(P2);
        symbolTable.put(ctx.getText(),P3);
        return visitChildren(ctx);
    }
    @Override public Object visitPrint(polyParser.PrintContext ctx) {
        System.out.println(symbolTable.get(symbolTable.get(ctx.exp().getText())));
        return visitChildren(ctx);
    }

    @Override public Object visitIdop(polyParser.IdopContext ctx) {
        String id1=ctx.children.get(0).getText();
        String id2=ctx.children.get(1).getText();
        String id3=ctx.children.get(2).getText();
        if(id2.equals("+")){
            String[] token1 = symbolTable.get(id1).toString().split("\\$");
            String[] token2 = symbolTable.get(id3).toString().split("\\$");
            Polynomial P1= new PolynomialImp(token1[1]);
            Polynomial P2 = new PolynomialImp(token2[1]);
            Polynomial P3 = P1.add(P2);
            symbolTable.put(ctx.getText(),P3);
        }else if(id2.equals("-")){
            String[] token1 = symbolTable.get(id1).toString().split("\\$");
            String[] token2 = symbolTable.get(id3).toString().split("\\$");
            Polynomial P1= new PolynomialImp(token1[1]);
            Polynomial P2 = new PolynomialImp(token2[1]);
            Polynomial P3 = P1.subtract(P2);
            symbolTable.put(ctx.getText(),P3);
        }else if(id2.equals("*")){
            String[] token1 = symbolTable.get(id1).toString().split("\\$");
            String[] token2 = symbolTable.get(id3).toString().split("\\$");
            Polynomial P1= new PolynomialImp(token1[1]);
            Polynomial P2 = new PolynomialImp(token2[1]);
            Polynomial P3 = P1.multiply(P2);
            symbolTable.put(ctx.getText(),P3);
        }
        return visitChildren(ctx);
    }


    @Override public Object visitSubpolynomial(polyParser.SubpolynomialContext ctx) {
        String[] tokens = ctx.getText().split("\\$");
        Polynomial P1= new PolynomialImp(tokens[1]);
        Polynomial P2 = new PolynomialImp(tokens[3]);
        Polynomial P3 = P1.subtract(P2);
        symbolTable.put(ctx.getText(),P3);
        return visitChildren(ctx);
    }

    @Override public Object visitMulpolynomial(polyParser.MulpolynomialContext ctx) {
        String[] tokens = ctx.getText().split("\\$");
        Polynomial P1= new PolynomialImp(tokens[1]);
        Polynomial P2 = new PolynomialImp(tokens[3]);
        Polynomial P3 = P1.multiply(P2);
        symbolTable.put(ctx.getText(),P3);
        return visitChildren(ctx);
    }

    @Override public Object visitMulcpolynomial(polyParser.MulcpolynomialContext ctx) {
        String[] tokens = ctx.getText().split("\\$");
        Polynomial P1= new PolynomialImp(tokens[1]);
        Integer c = new Integer(tokens[2].substring(1));
        Polynomial P3 = P1.multiply(c);
        symbolTable.put(ctx.getText(),P3);
        return visitChildren(ctx);
    }

    @Override public Object visitDerpolynomial(polyParser.DerpolynomialContext ctx) {
        String[] tokens = ctx.getText().split("\\$");
        Polynomial P1= new PolynomialImp(tokens[1]);
        Polynomial P3 = P1.derivative();
        symbolTable.put(ctx.getText(),P3);
        return visitChildren(ctx);
    }

    @Override public Object visitIntegralpolynomial(polyParser.IntegralpolynomialContext ctx) {
        String[] tokens = ctx.getText().split("\\$");
        Polynomial P1= new PolynomialImp(tokens[1]);
        Polynomial P3 = P1.indefiniteIntegral();
        String temp=P3.toString()+"+c";
        symbolTable.put(ctx.getText(),temp);
        return visitChildren(ctx);
    }

    @Override public Object visitDefintegralpolynomial(polyParser.DefintegralpolynomialContext ctx) {
        String[] tokens = ctx.getText().split("\\$");
        Polynomial P1= new PolynomialImp(tokens[1]);
        int commaPos= tokens[2].indexOf(',');
        Integer a = new Integer(tokens[2].substring(0,commaPos));
        Integer b = new Integer(tokens[2].substring(commaPos+1));
        double P3 = P1.definiteIntegral(a, b);
        symbolTable.put(ctx.getText(),P3);
        return visitChildren(ctx);
    }

    @Override public Object visitEvalpolynomial(polyParser.EvalpolynomialContext ctx) {
        String[] tokens = ctx.getText().split("\\$");
        Polynomial P1= new PolynomialImp(tokens[1]);
        Integer x = new Integer(tokens[2]);
        double P3 = P1.evaluate(x);
        symbolTable.put(ctx.getText(),P3);
        return visitChildren(ctx);
    }

    @Override public Object visitDegree(polyParser.DegreeContext ctx) {
        String[] tokens = ctx.getText().split("\\$");
        Polynomial P1= new PolynomialImp(tokens[1]);
        double P3 = P1.degree();
        symbolTable.put(ctx.getText(),P3);
        return visitChildren(ctx);
    }

    @Override public Object visitEqualpolynomial(polyParser.EqualpolynomialContext ctx) {
        String[] tokens = ctx.getText().split("\\$");
        Polynomial P1= new PolynomialImp(tokens[1]);
        Polynomial P2 = new PolynomialImp(tokens[3]);
        boolean P3 = P1.equals(P2);
        symbolTable.put(ctx.getText(),P3);
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

    @Override public Object visitDef(polyParser.DefContext ctx) {
        String id=ctx.children.get(0).getText();
        String ex=ctx.children.get(2).getText();
        symbolTable.put(id,ex);
        return visitChildren(ctx);
    }

    @Override public Object visitEmpty(polyParser.EmptyContext ctx) { return visitChildren(ctx); }

    @Override public Object visitBool(polyParser.BoolContext ctx) { return visitChildren(ctx); }

    @Override public Object visitUnop(polyParser.UnopContext ctx) { return visitChildren(ctx); }

    @Override public Object visitSign(polyParser.SignContext ctx) { return visitChildren(ctx); }

    @Override public Object visitBinop(polyParser.BinopContext ctx) { return visitChildren(ctx); }

    @Override public Object visitId(polyParser.IdContext ctx) {
        return visitChildren(ctx);
    }

    @Override public Object visitInteger(polyParser.IntegerContext ctx) {
        return visitChildren(ctx);
    }

}
