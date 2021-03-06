// Generated from /home/anthony/IdeaProjects/PLCalculator/grammar/poly.g4 by ANTLR 4.8

import java.util.Map;
import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link polyParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface polyVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link polyParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(polyParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link polyParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(polyParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link polyParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(polyParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link polyParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(polyParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link polyParser#idop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdop(polyParser.IdopContext ctx);
	/**
	 * Visit a parse tree produced by {@link polyParser#sumpolynomial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumpolynomial(polyParser.SumpolynomialContext ctx);
	/**
	 * Visit a parse tree produced by {@link polyParser#subpolynomial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubpolynomial(polyParser.SubpolynomialContext ctx);
	/**
	 * Visit a parse tree produced by {@link polyParser#mulpolynomial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulpolynomial(polyParser.MulpolynomialContext ctx);
	/**
	 * Visit a parse tree produced by {@link polyParser#mulcpolynomial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulcpolynomial(polyParser.MulcpolynomialContext ctx);
	/**
	 * Visit a parse tree produced by {@link polyParser#derpolynomial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDerpolynomial(polyParser.DerpolynomialContext ctx);
	/**
	 * Visit a parse tree produced by {@link polyParser#defintegralpolynomial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefintegralpolynomial(polyParser.DefintegralpolynomialContext ctx);
	/**
	 * Visit a parse tree produced by {@link polyParser#integralpolynomial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegralpolynomial(polyParser.IntegralpolynomialContext ctx);
	/**
	 * Visit a parse tree produced by {@link polyParser#evalpolynomial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvalpolynomial(polyParser.EvalpolynomialContext ctx);
	/**
	 * Visit a parse tree produced by {@link polyParser#degree}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDegree(polyParser.DegreeContext ctx);
	/**
	 * Visit a parse tree produced by {@link polyParser#equalpolynomial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualpolynomial(polyParser.EqualpolynomialContext ctx);
	/**
	 * Visit a parse tree produced by {@link polyParser#monomial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonomial(polyParser.MonomialContext ctx);
	/**
	 * Visit a parse tree produced by {@link polyParser#polynomial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPolynomial(polyParser.PolynomialContext ctx);
	/**
	 * Visit a parse tree produced by {@link polyParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(polyParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link polyParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(polyParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link polyParser#expList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpList(polyParser.ExpListContext ctx);
	/**
	 * Visit a parse tree produced by {@link polyParser#propExpList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropExpList(polyParser.PropExpListContext ctx);
	/**
	 * Visit a parse tree produced by {@link polyParser#idList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdList(polyParser.IdListContext ctx);
	/**
	 * Visit a parse tree produced by {@link polyParser#propIdList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropIdList(polyParser.PropIdListContext ctx);
	/**
	 * Visit a parse tree produced by {@link polyParser#def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef(polyParser.DefContext ctx);
	/**
	 * Visit a parse tree produced by {@link polyParser#empty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty(polyParser.EmptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link polyParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(polyParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link polyParser#unop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnop(polyParser.UnopContext ctx);
	/**
	 * Visit a parse tree produced by {@link polyParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(polyParser.SignContext ctx);
	/**
	 * Visit a parse tree produced by {@link polyParser#binop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinop(polyParser.BinopContext ctx);
	/**
	 * Visit a parse tree produced by {@link polyParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(polyParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link polyParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(polyParser.IntegerContext ctx);
}