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
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link cuteLangParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterString(cuteLangParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link cuteLangParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitString(cuteLangParser.StringContext ctx);
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
	 * Enter a parse tree produced by the {@code boolexpr}
	 * labeled alternative in {@link cuteLangParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterBoolexpr(cuteLangParser.BoolexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolexpr}
	 * labeled alternative in {@link cuteLangParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitBoolexpr(cuteLangParser.BoolexprContext ctx);
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
	 * Enter a parse tree produced by the {@code id1}
	 * labeled alternative in {@link cuteLangParser#expr4}.
	 * @param ctx the parse tree
	 */
	void enterId1(cuteLangParser.Id1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code id1}
	 * labeled alternative in {@link cuteLangParser#expr4}.
	 * @param ctx the parse tree
	 */
	void exitId1(cuteLangParser.Id1Context ctx);
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
	 * Enter a parse tree produced by the {@code singlebool0}
	 * labeled alternative in {@link cuteLangParser#boolExpr0}.
	 * @param ctx the parse tree
	 */
	void enterSinglebool0(cuteLangParser.Singlebool0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code singlebool0}
	 * labeled alternative in {@link cuteLangParser#boolExpr0}.
	 * @param ctx the parse tree
	 */
	void exitSinglebool0(cuteLangParser.Singlebool0Context ctx);
	/**
	 * Enter a parse tree produced by the {@code and}
	 * labeled alternative in {@link cuteLangParser#boolExpr0}.
	 * @param ctx the parse tree
	 */
	void enterAnd(cuteLangParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code and}
	 * labeled alternative in {@link cuteLangParser#boolExpr0}.
	 * @param ctx the parse tree
	 */
	void exitAnd(cuteLangParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singlebool1}
	 * labeled alternative in {@link cuteLangParser#boolExpr1}.
	 * @param ctx the parse tree
	 */
	void enterSinglebool1(cuteLangParser.Singlebool1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code singlebool1}
	 * labeled alternative in {@link cuteLangParser#boolExpr1}.
	 * @param ctx the parse tree
	 */
	void exitSinglebool1(cuteLangParser.Singlebool1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code or}
	 * labeled alternative in {@link cuteLangParser#boolExpr1}.
	 * @param ctx the parse tree
	 */
	void enterOr(cuteLangParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code or}
	 * labeled alternative in {@link cuteLangParser#boolExpr1}.
	 * @param ctx the parse tree
	 */
	void exitOr(cuteLangParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singlebool2}
	 * labeled alternative in {@link cuteLangParser#boolExpr2}.
	 * @param ctx the parse tree
	 */
	void enterSinglebool2(cuteLangParser.Singlebool2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code singlebool2}
	 * labeled alternative in {@link cuteLangParser#boolExpr2}.
	 * @param ctx the parse tree
	 */
	void exitSinglebool2(cuteLangParser.Singlebool2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code xor}
	 * labeled alternative in {@link cuteLangParser#boolExpr2}.
	 * @param ctx the parse tree
	 */
	void enterXor(cuteLangParser.XorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xor}
	 * labeled alternative in {@link cuteLangParser#boolExpr2}.
	 * @param ctx the parse tree
	 */
	void exitXor(cuteLangParser.XorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singlebool3}
	 * labeled alternative in {@link cuteLangParser#boolExpr3}.
	 * @param ctx the parse tree
	 */
	void enterSinglebool3(cuteLangParser.Singlebool3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code singlebool3}
	 * labeled alternative in {@link cuteLangParser#boolExpr3}.
	 * @param ctx the parse tree
	 */
	void exitSinglebool3(cuteLangParser.Singlebool3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code neg}
	 * labeled alternative in {@link cuteLangParser#boolExpr3}.
	 * @param ctx the parse tree
	 */
	void enterNeg(cuteLangParser.NegContext ctx);
	/**
	 * Exit a parse tree produced by the {@code neg}
	 * labeled alternative in {@link cuteLangParser#boolExpr3}.
	 * @param ctx the parse tree
	 */
	void exitNeg(cuteLangParser.NegContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bool}
	 * labeled alternative in {@link cuteLangParser#boolExpr4}.
	 * @param ctx the parse tree
	 */
	void enterBool(cuteLangParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link cuteLangParser#boolExpr4}.
	 * @param ctx the parse tree
	 */
	void exitBool(cuteLangParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id2}
	 * labeled alternative in {@link cuteLangParser#boolExpr4}.
	 * @param ctx the parse tree
	 */
	void enterId2(cuteLangParser.Id2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code id2}
	 * labeled alternative in {@link cuteLangParser#boolExpr4}.
	 * @param ctx the parse tree
	 */
	void exitId2(cuteLangParser.Id2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code boolpar}
	 * labeled alternative in {@link cuteLangParser#boolExpr4}.
	 * @param ctx the parse tree
	 */
	void enterBoolpar(cuteLangParser.BoolparContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolpar}
	 * labeled alternative in {@link cuteLangParser#boolExpr4}.
	 * @param ctx the parse tree
	 */
	void exitBoolpar(cuteLangParser.BoolparContext ctx);
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