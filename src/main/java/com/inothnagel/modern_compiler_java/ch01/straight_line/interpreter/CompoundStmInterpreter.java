package com.inothnagel.modern_compiler_java.ch01.straight_line.interpreter;

import com.inothnagel.modern_compiler_java.ch01.straight_line.language_primitives.CompoundStm;

public class CompoundStmInterpreter {
    private final CompoundStm s;
    private final Environment env;

    public CompoundStmInterpreter(Environment env, CompoundStm s) {
        this.env = env;
        this.s = s;
    }

    public void interpret() {
        System.out.println("Interpreting CompoundStm: " + s);
        new StmInterpreter(env, s.getStm1()).interpret();
        new StmInterpreter(env, s.getStm2()).interpret();
    }
}
