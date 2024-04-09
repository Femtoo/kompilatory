package cute.uwu.gen;// Generated from D:/Studia/sem8/kompilatory/projekt/kompilatory/cutelang/grammar/cuteLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link cuteLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface cuteLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link cuteLangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(cuteLangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code write}
	 * labeled alternative in {@link cuteLangParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite(cuteLangParser.WriteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link cuteLangParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(cuteLangParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code read}
	 * labeled alternative in {@link cuteLangParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(cuteLangParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code single0}
	 * labeled alternative in {@link cuteLangParser#expr0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle0(cuteLangParser.Single0Context ctx);
	/**
	 * Visit a parse tree produced by the {@code add}
	 * labeled alternative in {@link cuteLangParser#expr0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(cuteLangParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code single1}
	 * labeled alternative in {@link cuteLangParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle1(cuteLangParser.Single1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code mult}
	 * labeled alternative in {@link cuteLangParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(cuteLangParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code single2}
	 * labeled alternative in {@link cuteLangParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle2(cuteLangParser.Single2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link cuteLangParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(cuteLangParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code single3}
	 * labeled alternative in {@link cuteLangParser#expr3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle3(cuteLangParser.Single3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code div}
	 * labeled alternative in {@link cuteLangParser#expr3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(cuteLangParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link cuteLangParser#expr4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(cuteLangParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code float}
	 * labeled alternative in {@link cuteLangParser#expr4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(cuteLangParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code array}
	 * labeled alternative in {@link cuteLangParser#expr4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(cuteLangParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code toint}
	 * labeled alternative in {@link cuteLangParser#expr4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToint(cuteLangParser.TointContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tofloat}
	 * labeled alternative in {@link cuteLangParser#expr4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTofloat(cuteLangParser.TofloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code par}
	 * labeled alternative in {@link cuteLangParser#expr4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPar(cuteLangParser.ParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intarray}
	 * labeled alternative in {@link cuteLangParser#arrayExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntarray(cuteLangParser.IntarrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatarray}
	 * labeled alternative in {@link cuteLangParser#arrayExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatarray(cuteLangParser.FloatarrayContext ctx);
}