// Generated from C:/Users/antho/Desktop/polynomial/grammar\poly.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link polyParser}.
 */
public interface polyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link polyParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(polyParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link polyParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(polyParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link polyParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(polyParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link polyParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(polyParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link polyParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(polyParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link polyParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(polyParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link polyParser#monomial}.
	 * @param ctx the parse tree
	 */
	void enterMonomial(polyParser.MonomialContext ctx);
	/**
	 * Exit a parse tree produced by {@link polyParser#monomial}.
	 * @param ctx the parse tree
	 */
	void exitMonomial(polyParser.MonomialContext ctx);
	/**
	 * Enter a parse tree produced by {@link polyParser#polynomial}.
	 * @param ctx the parse tree
	 */
	void enterPolynomial(polyParser.PolynomialContext ctx);
	/**
	 * Exit a parse tree produced by {@link polyParser#polynomial}.
	 * @param ctx the parse tree
	 */
	void exitPolynomial(polyParser.PolynomialContext ctx);
	/**
	 * Enter a parse tree produced by {@link polyParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(polyParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link polyParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(polyParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link polyParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(polyParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link polyParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(polyParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link polyParser#expList}.
	 * @param ctx the parse tree
	 */
	void enterExpList(polyParser.ExpListContext ctx);
	/**
	 * Exit a parse tree produced by {@link polyParser#expList}.
	 * @param ctx the parse tree
	 */
	void exitExpList(polyParser.ExpListContext ctx);
	/**
	 * Enter a parse tree produced by {@link polyParser#propExpList}.
	 * @param ctx the parse tree
	 */
	void enterPropExpList(polyParser.PropExpListContext ctx);
	/**
	 * Exit a parse tree produced by {@link polyParser#propExpList}.
	 * @param ctx the parse tree
	 */
	void exitPropExpList(polyParser.PropExpListContext ctx);
	/**
	 * Enter a parse tree produced by {@link polyParser#idList}.
	 * @param ctx the parse tree
	 */
	void enterIdList(polyParser.IdListContext ctx);
	/**
	 * Exit a parse tree produced by {@link polyParser#idList}.
	 * @param ctx the parse tree
	 */
	void exitIdList(polyParser.IdListContext ctx);
	/**
	 * Enter a parse tree produced by {@link polyParser#propIdList}.
	 * @param ctx the parse tree
	 */
	void enterPropIdList(polyParser.PropIdListContext ctx);
	/**
	 * Exit a parse tree produced by {@link polyParser#propIdList}.
	 * @param ctx the parse tree
	 */
	void exitPropIdList(polyParser.PropIdListContext ctx);
	/**
	 * Enter a parse tree produced by {@link polyParser#def}.
	 * @param ctx the parse tree
	 */
	void enterDef(polyParser.DefContext ctx);
	/**
	 * Exit a parse tree produced by {@link polyParser#def}.
	 * @param ctx the parse tree
	 */
	void exitDef(polyParser.DefContext ctx);
	/**
	 * Enter a parse tree produced by {@link polyParser#empty}.
	 * @param ctx the parse tree
	 */
	void enterEmpty(polyParser.EmptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link polyParser#empty}.
	 * @param ctx the parse tree
	 */
	void exitEmpty(polyParser.EmptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link polyParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(polyParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link polyParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(polyParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link polyParser#unop}.
	 * @param ctx the parse tree
	 */
	void enterUnop(polyParser.UnopContext ctx);
	/**
	 * Exit a parse tree produced by {@link polyParser#unop}.
	 * @param ctx the parse tree
	 */
	void exitUnop(polyParser.UnopContext ctx);
	/**
	 * Enter a parse tree produced by {@link polyParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(polyParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link polyParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(polyParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link polyParser#binop}.
	 * @param ctx the parse tree
	 */
	void enterBinop(polyParser.BinopContext ctx);
	/**
	 * Exit a parse tree produced by {@link polyParser#binop}.
	 * @param ctx the parse tree
	 */
	void exitBinop(polyParser.BinopContext ctx);
	/**
	 * Enter a parse tree produced by {@link polyParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(polyParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link polyParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(polyParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link polyParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(polyParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link polyParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(polyParser.IntegerContext ctx);
}