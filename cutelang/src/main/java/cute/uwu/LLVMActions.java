package cute.uwu;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

import cute.uwu.gen.*;

enum VarType {INT, FLOAT, STRING, BOOL, UNKNOWN}

class Value {
    public String name;
    public VarType type;
    public int length;

    public Value(String name, VarType type, int length) {
        this.name = name;
        this.type = type;
        this.length = length;
    }
}

public class LLVMActions extends cuteLangBaseListener {

    HashMap<String, Value> variables = new HashMap<String, Value>();
    HashMap<String, Value> localvariables = new HashMap<String, Value>();
    HashSet<String> functions = new HashSet<String>();
    Stack<Value> stack = new Stack<Value>();
    String function;
    Boolean global;

    static int BUFFER_SIZE = 16;

    @Override
    public void enterProgram(cuteLangParser.ProgramContext ctx) {
        global = true;
    }

    @Override
    public void exitFparam(cuteLangParser.FparamContext ctx) {
        String ID = ctx.ID().getText();
        functions.add(ID);
        function = ID;
        LLVMGenerator.functionstart(ID);
    }

    @Override
    public void enterFblock(cuteLangParser.FblockContext ctx) {
        global = false;
    }

    @Override
    public void exitFblock(cuteLangParser.FblockContext ctx) {
//        if( ! localvariables.containsKey(function) ){
//            LLVMGenerator.assign(set_variable(function), "0");
//        }
//        LLVMGenerator.load( "%"+function );
//        LLVMGenerator.functionend();
//        localvariables = new HashMap<String, Value>();
//        global = true;
    }

    @Override
    public void exitRepetitions(cuteLangParser.RepetitionsContext ctx) {
        var tmp = stack.pop();
        if (tmp.type == VarType.INT) {
            LLVMGenerator.repeatstart(tmp.name);
        } else {
            System.err.println("Line " + ctx.getStart().getLine() + ", wrong type, should be int");
        }
    }

    @Override
    public void exitBlock(cuteLangParser.BlockContext ctx) {
        if (ctx.getParent() instanceof cuteLangParser.RepeatContext) {
            LLVMGenerator.repeatend();
        }
    }

    @Override
    public void exitIf(cuteLangParser.IfContext ctx) {
    }

    @Override
    public void enterIfblock(cuteLangParser.IfblockContext ctx) {
        LLVMGenerator.ifstart();
    }

    @Override
    public void exitIfblock(cuteLangParser.IfblockContext ctx) {
        LLVMGenerator.ifend();
    }

    @Override
    public void exitCond(cuteLangParser.CondContext ctx) {
        String prefix = global ? "@" : "%";
        String ID = prefix + ctx.ID().getText();
        String INT = ctx.INT().getText();
//        if( variables.contains(ID) ) {
        if (global) {

        }

        if (variables.containsKey(ID)) {
            LLVMGenerator.icmp(ID, INT);
        } else {
            ctx.getStart().getLine();
            System.err.println("Line " + ctx.getStart().getLine() + ", unknown variable: " + ID);
        }
    }

    @Override
    public void exitAssign(cuteLangParser.AssignContext ctx) {

        String ID = ctx.ID().getText();
        Value v = stack.pop();
        String prefix = global ? "@" : "%";

        if (!variables.containsKey(prefix + ID)) {
            if (global) {
                variables.put(prefix + ID, v);
            } else {
                localvariables.put(prefix + ID, v);
            }

            if (v.type == VarType.INT) {
                LLVMGenerator.declare_i32(ID, global);
            }
            if (v.type == VarType.FLOAT) {
                LLVMGenerator.declare_double(ID, global);
            }
            if (v.type == VarType.BOOL) {
                LLVMGenerator.declare_bool(ID, global);
            }
            if (v.type == VarType.STRING) {
                LLVMGenerator.declare_string(ID, global);
            }
        }
//        else {
//            variables.get(ID).name = v.name;
//        }
        if (v.type == VarType.INT) {
            LLVMGenerator.assign_i32(prefix + ID, v.name);
        }
        if (v.type == VarType.FLOAT) {
            LLVMGenerator.assign_double(prefix + ID, v.name);
        }
        if (v.type == VarType.BOOL) {
            LLVMGenerator.assign_bool(prefix + ID, v.name);
        }
        if (v.type == VarType.STRING) {
            LLVMGenerator.assign_string(prefix + ID);
        }
    }

    @Override
    public void exitProgram(cuteLangParser.ProgramContext ctx) {
        LLVMGenerator.close_main();
        String output = LLVMGenerator.generate();
        System.out.println(output);

        try {
            //FileWriter writer = new FileWriter("C:\\Users\\KT\\kompilatory\\cutelang\\cuteLangFiles\\test.ll");
            FileWriter writer = new FileWriter("D:\\Studia\\sem8\\kompilatory\\projekt\\test.ll");
            writer.write(output);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void exitId1(cuteLangParser.Id1Context ctx) {
        String prefix = global ? "@" : "%";
        String ID = prefix + ctx.ID().getText();
        if (variables.containsKey(ID)) {
            stack.push(variables.get(ID));
        } else {
            error(ctx.getStart().getLine(), "unknown variable");
        }
    }

    @Override
    public void exitId2(cuteLangParser.Id2Context ctx) {
        String prefix = global ? "@" : "%";
        String ID = prefix + ctx.ID().getText();
        if (variables.containsKey(ID)) {
            stack.push(variables.get(ID));
        } else {
            error(ctx.getStart().getLine(), "unknown variable");
        }
    }

    @Override
    public void exitId3(cuteLangParser.Id3Context ctx) {
        String prefix = global ? "@" : "%";
        String ID = prefix + ctx.ID().getText();
        if (variables.containsKey(ID)) {
            stack.push(variables.get(ID));
        } else {
            error(ctx.getStart().getLine(), "unknown variable");
        }
    }

    @Override
    public void exitInt(cuteLangParser.IntContext ctx) {
        stack.push(new Value(ctx.INT().getText(), VarType.INT, 0));
    }

    @Override
    public void exitInt2(cuteLangParser.Int2Context ctx) {
        stack.push(new Value(ctx.INT().getText(), VarType.INT, 0));
    }

    @Override
    public void exitFloat(cuteLangParser.FloatContext ctx) {
        stack.push(new Value(ctx.FLOAT().getText(), VarType.FLOAT, 0));
    }

    @Override
    public void exitBool(cuteLangParser.BoolContext ctx) {
        var tmp = ctx.BOOL().getText().equals("true") ? "1" : "0";
        stack.push(new Value(tmp, VarType.BOOL, 0));
    }

    @Override
    public void exitString(cuteLangParser.StringContext ctx) {
        String tmp = ctx.STRING().getText();
        String content = tmp.substring(1, tmp.length() - 1);
        LLVMGenerator.constant_string(content);
        String n = "%ptrstr" + (LLVMGenerator.str - 1);
        stack.push(new Value(n, VarType.STRING, content.length()));
    }

    @Override
    public void exitAdd(cuteLangParser.AddContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if (v1.type == v2.type) {
            if (v1.type == VarType.INT) {
                LLVMGenerator.add_i32(v1.name, v2.name);
                stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.INT, 0));
            }
            if (v1.type == VarType.FLOAT) {
                LLVMGenerator.add_double(v1.name, v2.name);
                stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.FLOAT, 0));
            }
            if (v1.type == VarType.STRING) {
                LLVMGenerator.add_string(v1.name, v1.length, v2.name, v2.length);
                stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.STRING, v1.length + v2.length));
            }
        } else {
            error(ctx.getStart().getLine(), "add type mismatch");
        }
    }

    @Override
    public void exitSub(cuteLangParser.SubContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if (v1.type == v2.type) {
            if (v1.type == VarType.INT) {
                LLVMGenerator.sub_i32(v1.name, v2.name);
                stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.INT, 0));
            }
            if (v1.type == VarType.FLOAT) {
                LLVMGenerator.sub_double(v1.name, v2.name);
                stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.FLOAT, 0));
            }
        } else {
            error(ctx.getStart().getLine(), "sub type mismatch");
        }
    }

    @Override
    public void exitMult(cuteLangParser.MultContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if (v1.type == v2.type) {
            if (v1.type == VarType.INT) {
                LLVMGenerator.mult_i32(v1.name, v2.name);
                stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.INT, 0));
            }
            if (v1.type == VarType.FLOAT) {
                LLVMGenerator.mult_double(v1.name, v2.name);
                stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.FLOAT, 0));
            }
        } else {
            error(ctx.getStart().getLine(), "mult type mismatch");
        }
    }

    @Override
    public void exitDiv(cuteLangParser.DivContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if (v1.type == v2.type) {
            if (v1.type == VarType.INT) {
                LLVMGenerator.div_i32(v1.name, v2.name);
                stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.INT, 0));
            }
            if (v1.type == VarType.FLOAT) {
                LLVMGenerator.div_double(v1.name, v2.name);
                stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.FLOAT, 0));
            }
        } else {
            error(ctx.getStart().getLine(), "div type mismatch");
        }
    }

    @Override
    public void exitAnd(cuteLangParser.AndContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if (v1.type == VarType.BOOL && v2.type == VarType.BOOL) {
            LLVMGenerator.and_bool(v1.name, v2.name);
            stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.BOOL, 0));
        } else {
            error(ctx.getStart().getLine(), "and type mismatch");
        }
    }

    @Override
    public void exitOr(cuteLangParser.OrContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if (v1.type == VarType.BOOL && v2.type == VarType.BOOL) {
            LLVMGenerator.or_bool(v1.name, v2.name);
            stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.BOOL, 0));
        } else {
            error(ctx.getStart().getLine(), "or type mismatch");
        }
    }

    @Override
    public void exitXor(cuteLangParser.XorContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if (v1.type == VarType.BOOL && v2.type == VarType.BOOL) {
            LLVMGenerator.xor_bool(v1.name, v2.name);
            stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.BOOL, 0));
        } else {
            error(ctx.getStart().getLine(), "xor type mismatch");
        }
    }

    @Override
    public void exitNeg(cuteLangParser.NegContext ctx) {
        Value v = stack.pop();
        if (v.type == VarType.BOOL) {
            LLVMGenerator.neg_bool(v.name);
            stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.BOOL, 0));
        } else {
            error(ctx.getStart().getLine(), "neg type mismatch");
        }
    }

    @Override
    public void exitToint(cuteLangParser.TointContext ctx) {
        Value v = stack.pop();
        LLVMGenerator.fptosi(v.name);
        stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.INT, 0));
    }

    @Override
    public void exitTofloat(cuteLangParser.TofloatContext ctx) {
        Value v = stack.pop();
        LLVMGenerator.sitofp(v.name);
        stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.FLOAT, 0));
    }

    @Override
    public void exitWrite(cuteLangParser.WriteContext ctx) {
        String ID = ctx.ID().getText();
        String prefix = global ? "@" : "%";
        ID = prefix + ID;
        if (variables.containsKey(ID)) {
            Value v = variables.get(ID);
            if (v.type != null) {
                if (v.type == VarType.INT) {
                    LLVMGenerator.writef_i32(ID);
                }
                if (v.type == VarType.FLOAT) {
                    LLVMGenerator.writef_double(ID);
                }
                if (v.type == VarType.STRING) {
                    LLVMGenerator.writef_string(ID);
                }
                if (v.type == VarType.BOOL) {
                    LLVMGenerator.writef_bool(ID);
                }

            }
        } else {
            error(ctx.getStart().getLine(), "unknown variable");
        }
    }

    @Override
    public void exitRead(cuteLangParser.ReadContext ctx) {
        String ID = ctx.ID().getText();
        Value v = new Value(ID, VarType.STRING, BUFFER_SIZE - 1);
        variables.put(ID, v);
        LLVMGenerator.scanf(ID, BUFFER_SIZE);
    }

    void error(int line, String msg) {
        System.err.println("Error, line " + line + ", " + msg);
        System.exit(1);
    }

}