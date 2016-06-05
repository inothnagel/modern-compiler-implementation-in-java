package com.inothnagel.modern_compiler_java.ch01.straight_line.interpreter;

import com.inothnagel.modern_compiler_java.ch01.straight_line.language_primitives.Exp;
import com.inothnagel.modern_compiler_java.ch01.straight_line.language_primitives.IdExp;
import com.inothnagel.modern_compiler_java.ch01.straight_line.language_primitives.NumExp;
import com.inothnagel.modern_compiler_java.ch01.straight_line.language_primitives.OpExp;

/**
 * Created by inothnagel on 2016/06/05.
 */
public class ExpInterpreter {
    private final Environment env;
    private final Exp e;

    public ExpInterpreter(Environment env, Exp exp) {
        this.env = env;
        this.e = exp;
    }

    public Exp interpret() {
        if (e instanceof OpExp) {
            OpExp oe = (OpExp) e;
            return new OpExpInterpreter(env, oe).interpret();
        }

        if (e instanceof NumExp) {
            return e;
        }

        if (e instanceof IdExp) {
            IdExp ie = (IdExp) e;
            String key = ie.getId();
            Exp val = env.get(ie.getId());
            System.out.println("Found value " + val + " for key " + key + " in environment.");
            return val;
        }

        return null;
    }
}
