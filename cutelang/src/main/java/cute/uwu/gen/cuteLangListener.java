package cute.uwu.gen;// Generated from D:/Studia/sem8/kompilatory/projekt/kompilatory/cutelang/grammar/cuteLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link cuteLangParser}.
 */
public interface cuteLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link cuteLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(cuteLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link cuteLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(cuteLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code write}
	 * labeled alternative in {@link cuteLangParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterWrite(cuteLangParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code write}
	 * labeled alternative in {@link cuteLangParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitWrite(cuteLangParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link cuteLangParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterAssign(cuteLangParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link cuteLangParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitAssign(cuteLangParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code read}
	 * labeled alternative in {@link cuteLangParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterRead(cuteLangParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code read}
	 * labeled alternative in {@link cuteLangParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitRead(cuteLangParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single0}
	 * labeled alternative in {@link cuteLangParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterSingle0(cuteLangParser.Single0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code single0}
	 * labeled alternative in {@link cuteLangParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitSingle0(cuteLangParser.Single0Context ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link cuteLangParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterAdd(cuteLangParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link cuteLangParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitAdd(cuteLangParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single1}
	 * labeled alternative in {@link cuteLangParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterSingle1(cuteLangParser.Single1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code single1}
	 * labeled alternative in {@link cuteLangParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitSingle1(cuteLangParser.Single1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code mult}
	 * labeled alternative in {@link cuteLangParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterMult(cuteLangParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mult}
	 * labeled alternative in {@link cuteLangParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitMult(cuteLangParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single2}
	 * labeled alternative in {@link cuteLangParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterSingle2(cuteLangParser.Single2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code single2}
	 * labeled alternative in {@link cuteLangParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitSingle2(cuteLangParser.Single2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code sub}
	 * labeled alternative in {@link cuteLangParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterSub(cuteLangParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link cuteLangParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitSub(cuteLangParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single3}
	 * labeled alternative in {@link cuteLangParser#expr3}.
	 * @param ctx the parse tree
	 */
	void enterSingle3(cuteLangParser.Single3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code single3}
	 * labeled alternative in {@link cuteLangParser#expr3}.
	 * @param ctx the parse tree
	 */
	void exitSingle3(cuteLangParser.Single3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code div}
	 * labeled alternative in {@link cuteLangParser#expr3}.
	 * @param ctx the parse tree
	 */
	void enterDiv(cuteLangParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code div}
	 * labeled alternative in {@link cuteLangParser#expr3}.
	 * @param ctx the parse tree
	 */
	void exitDiv(cuteLangParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link cuteLangParser#expr4}.
	 * @param ctx the parse tree
	 */
	void enterInt(cuteLangParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link cuteLangParser#expr4}.
	 * @param ctx the parse tree
	 */
	void exitInt(cuteLangParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code float}
	 * labeled alternative in {@link cuteLangParser#expr4}.
	 * @param ctx the parse tree
	 */
	void enterFloat(cuteLangParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code float}
	 * labeled alternative in {@link cuteLangParser#expr4}.
	 * @param ctx the parse tree
	 */
	void exitFloat(cuteLangParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code array}
	 * labeled alternative in {@link cuteLangParser#expr4}.
	 * @param ctx the parse tree
	 */
	void enterArray(cuteLangParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code array}
	 * labeled alternative in {@link cuteLangParser#expr4}.
	 * @param ctx the parse tree
	 */
	void exitArray(cuteLangParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code toint}
	 * labeled alternative in {@link cuteLangParser#expr4}.
	 * @param ctx the parse tree
	 */
	void enterToint(cuteLangParser.TointContext ctx);
	/**
	 * Exit a parse tree produced by the {@code toint}
	 * labeled alternative in {@link cuteLangParser#expr4}.
	 * @param ctx the parse tree
	 */
	void exitToint(cuteLangParser.TointContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tofloat}
	 * labeled alternative in {@link cuteLangParser#expr4}.
	 * @param ctx the parse tree
	 */
	void enterTofloat(cuteLangParser.TofloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tofloat}
	 * labeled alternative in {@link cuteLangParser#expr4}.
	 * @param ctx the parse tree
	 */
	void exitTofloat(cuteLangParser.TofloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code par}
	 * labeled alternative in {@link cuteLangParser#expr4}.
	 * @param ctx the parse tree
	 */
	void enterPar(cuteLangParser.ParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code par}
	 * labeled alternative in {@link cuteLangParser#expr4}.
	 * @param ctx the parse tree
	 */
	void exitPar(cuteLangParser.ParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intarray}
	 * labeled alternative in {@link cuteLangParser#arrayExpr}.
	 * @param ctx the parse tree
	 */
	void enterIntarray(cuteLangParser.IntarrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intarray}
	 * labeled alternative in {@link cuteLangParser#arrayExpr}.
	 * @param ctx the parse tree
	 */
	void exitIntarray(cuteLangParser.IntarrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatarray}
	 * labeled alternative in {@link cuteLangParser#arrayExpr}.
	 * @param ctx the parse tree
	 */
	void enterFloatarray(cuteLangParser.FloatarrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatarray}
	 * labeled alternative in {@link cuteLangParser#arrayExpr}.
	 * @param ctx the parse tree
	 */
	void exitFloatarray(cuteLangParser.FloatarrayContext ctx);
}