package com.inothnagel.modern_compiler_java.ch01.straight_line.language_primitives;

public class EseqExp extends Exp {
    public Stm stm;
    public Exp exp;

    public EseqExp(Stm stm, Exp exp) {
        this.stm = stm;
        this.exp = exp;
    }
}
