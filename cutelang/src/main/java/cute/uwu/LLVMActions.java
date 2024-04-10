package cute.uwu;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Stack;

import cute.uwu.gen.*;

enum VarType {INT, FLOAT, STRING, TRUE, FALSE, UNKNOWN}

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
    Stack<Value> stack = new Stack<Value>();

    static int BUFFER_SIZE = 16;

    @Override
    public void exitAssign(cuteLangParser.AssignContext ctx) {

        String ID = ctx.ID().getText();
        Value v = stack.pop();

        if (!variables.containsKey(ID)) {
            variables.put(ID, v);
            if (v.type == VarType.INT) {
                LLVMGenerator.declare_i32(ID);
            }
            if (v.type == VarType.FLOAT) {
                LLVMGenerator.declare_double(ID);
            }
            if (v.type == VarType.TRUE || v.type == VarType.FALSE) {
                LLVMGenerator.declare_bool(ID);
            }
            if (v.type == VarType.STRING) {
                LLVMGenerator.declare_string(ID);
            }
        }
        if (v.type == VarType.INT) {
            LLVMGenerator.assign_i32(ID, v.name);
        }
        if (v.type == VarType.FLOAT) {
            LLVMGenerator.assign_double(ID, v.name);
        }
        if (v.type == VarType.TRUE) {
            LLVMGenerator.assign_bool(ID, "1");
        }
        if (v.type == VarType.FALSE) {
            LLVMGenerator.assign_bool(ID, "0");
        }
        if (v.type == VarType.STRING) {
            LLVMGenerator.assign_string(ID);
        }
    }

    @Override
    public void exitProgram(cuteLangParser.ProgramContext ctx) {
        String output = LLVMGenerator.generate();
        System.out.println(output);

        try {
            FileWriter writer = new FileWriter("D:\\Studia\\sem8\\kompilatory\\projekt\\test.ll");
            writer.write(output);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void exitInt(cuteLangParser.IntContext ctx) {
        stack.push(new Value(ctx.INT().getText(), VarType.INT, 0));
    }

    @Override
    public void exitFloat(cuteLangParser.FloatContext ctx) {
        stack.push(new Value(ctx.FLOAT().getText(), VarType.FLOAT, 0));
    }

    @Override
    public void exitTrue(cuteLangParser.TrueContext ctx) {
        stack.push(new Value(ctx.TRUE().getText(), VarType.TRUE, 0));
    }

    @Override
    public void exitFalse(cuteLangParser.FalseContext ctx) {
        stack.push(new Value(ctx.FALSE().getText(), VarType.FALSE, 0));
    }

    @Override
    public void exitString(cuteLangParser.StringContext ctx) {
        String tmp = ctx.STRING().getText();
        String content = tmp.substring(1, tmp.length() - 1);
        LLVMGenerator.constant_string(content);
        String n = "ptrstr" + (LLVMGenerator.str - 1);
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

    /*@Override
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
    }*/

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
        if (variables.containsKey(ID)) {
            Value v = variables.get(ID);
            if (v.type != null) {
                if (v.type == VarType.INT) {
                    LLVMGenerator.writef_i32(ID);
                }
                if (v.type == VarType.FLOAT) {
                    LLVMGenerator.writef_double(ID);
                }
//                if (v.type == VarType.STRING) {
//                    LLVMGenerator.writef_string(ID);
//                }
                if (v.type == VarType.TRUE) {
                    LLVMGenerator.writef_bool(ID);
                }
                if (v.type == VarType.FALSE) {
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
        LLVMGenerator.scanf(ID/*, BUFFER_SIZE*/);
    }

    void error(int line, String msg) {
        System.err.println("Error, line " + line + ", " + msg);
        System.exit(1);
    }

}