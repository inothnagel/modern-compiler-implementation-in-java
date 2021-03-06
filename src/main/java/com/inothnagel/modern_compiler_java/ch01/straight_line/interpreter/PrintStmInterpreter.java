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
        Exp resolvedExp = new ExpInterpreter(env, e).interpret();

        if (resolvedExp instanceof NumExp) {
            NumExp ne = (NumExp) resolvedExp;
            return Integer.toString(ne.getNum());
        }

        if (resolvedExp instanceof IdExp) {
            IdExp ie = (IdExp) resolvedExp;
            String key = ie.getId();
            String val = printExp(env.get(ie.getId()));
            System.out.println("Found value " + val + " for key " + key + " in environment.");
            return val;
        }

        return null;
    }
}
