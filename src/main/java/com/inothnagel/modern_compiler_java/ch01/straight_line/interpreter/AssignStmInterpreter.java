package com.inothnagel.modern_compiler_java.ch01.straight_line.interpreter;

import com.inothnagel.modern_compiler_java.ch01.straight_line.language_primitives.AssignStm;
import com.inothnagel.modern_compiler_java.ch01.straight_line.language_primitives.Exp;

public class AssignStmInterpreter {
    private final AssignStm s;
    private final Environment env;

    public AssignStmInterpreter(Environment env, AssignStm s) {
        this.env = env;
        this.s = s;
    }

    public void interpret() {
        System.out.println("Interpreting AssignStm: " + s);
        String key = s.getId();
        Exp val = new ExpInterpreter(env, s.getExp()).interpret();
        System.out.println("Setting value " + val + " for key " + key + " in environment.");
        env.put(key, val);
    }
}
