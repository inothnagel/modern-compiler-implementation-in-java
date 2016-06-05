package com.inothnagel.modern_compiler_java.ch01.straight_line.interpreter;

import com.inothnagel.modern_compiler_java.ch01.straight_line.language_primitives.Exp;
import com.inothnagel.modern_compiler_java.ch01.straight_line.language_primitives.OpExp;

/**
 * Created by inothnagel on 2016/06/05.
 */
public class OpExpInterpreter {
    private final Environment env;
    private final OpExp e;

    public OpExpInterpreter(Environment env, OpExp e) {
        this.env = env;
        this.e = e;
    }

    public Exp interpret() {
        if (e.getOper() == OpExp.Plus) {
            OpExp oe = (OpExp) e;
            return new PlusOpExpInterpreter(env, oe).interpret();
        }
        return null;
    }
}
