package com.inothnagel.modern_compiler_java.ch01.straight_line.interpreter;

import com.inothnagel.modern_compiler_java.ch01.straight_line.language_primitives.*;

public class PrintStmInterpreter {
    private final PrintStm s;
    private final Environment env;

    public PrintStmInterpreter(Environment env, PrintStm s) {
        this.env = env;
        this.s = s;
    }

    public void interpret() {
        System.out.println("Interpreting PrintStm: " + s);
        String out = printExplist(s.getExpList());
        System.out.println("OUTPUT: " + out);
    }

    private String printExplist(ExpList expList) {
        if (expList instanceof LastExpList) {
            LastExpList lel = (LastExpList) expList;
            return printExp(lel.getHead());
        }
        return null;
    }

    private String printExp(Exp e) {
        if (e instanceof NumExp) {
            NumExp ne = (NumExp) e;
            return Integer.toString(ne.getNum());
        }

        if (e instanceof IdExp) {
            IdExp ie = (IdExp) e;
            String key = ie.getId();
            String val = printExp(env.get(ie.getId()));
            System.out.println("Found value " + val + " for key " + key + " in environment.");
            return val;
        }

        return null;
    }
}
