package com.inothnagel.modern_compiler_java.ch01.straight_line.interpreter;

import com.inothnagel.modern_compiler_java.ch01.straight_line.language_primitives.AssignStm;
import com.inothnagel.modern_compiler_java.ch01.straight_line.language_primitives.CompoundStm;
import com.inothnagel.modern_compiler_java.ch01.straight_line.language_primitives.PrintStm;
import com.inothnagel.modern_compiler_java.ch01.straight_line.language_primitives.Stm;

public class StmInterpreter {
    private final Stm s;
    private final Environment env;

    public StmInterpreter(Environment env, Stm s) {
        this.env = env;
        this.s = s;
    }

    public void interpret() {
        System.out.println("Interpreting Statement: " + s);

        if (s instanceof CompoundStm) {
            new CompoundStmInterpreter(env, (CompoundStm) s).interpret();
        }

        if (s instanceof AssignStm) {
            new AssignStmInterpreter(env, (AssignStm) s).interpret();
        }

        if (s instanceof PrintStm) {
            new PrintStmInterpreter(env, (PrintStm) s).interpret();
        }
    }
}
