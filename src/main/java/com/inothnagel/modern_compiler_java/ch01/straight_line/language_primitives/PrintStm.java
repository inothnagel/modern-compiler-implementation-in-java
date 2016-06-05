package com.inothnagel.modern_compiler_java.ch01.straight_line.language_primitives;

public class PrintStm extends Stm {
    public ExpList expList;

    public PrintStm(ExpList exps) {
        this.expList = exps;
    }

    public String toString() {
        return "print " + expList.toString();
    }

    public ExpList getExpList() {
        return expList;
    }
}
