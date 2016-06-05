package com.inothnagel.modern_compiler_java.ch01.straight_line.interpreter;

import com.inothnagel.modern_compiler_java.ch01.straight_line.language_primitives.Exp;
import com.inothnagel.modern_compiler_java.ch01.straight_line.language_primitives.NumExp;
import com.inothnagel.modern_compiler_java.ch01.straight_line.language_primitives.OpExp;

public class PlusOpExpInterpreter {
    private final Environment env;
    private final OpExp e;

    public PlusOpExpInterpreter(Environment env, OpExp e) {
        this.env = env;
        this.e = e;
    }

    public Exp interpret() {
        Exp left = new ExpInterpreter(env, e.getLeft()).interpret();
        Exp right = new ExpInterpreter(env, e.getRight()).interpret();

        if (left instanceof NumExp && right instanceof NumExp) {
            int a = ((NumExp) left).getNum();
            int b = ((NumExp) right).getNum();
            return new NumExp(a + b);
        }

        return null;
    }
}
