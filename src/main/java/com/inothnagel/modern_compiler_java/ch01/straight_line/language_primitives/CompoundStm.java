package com.inothnagel.modern_compiler_java.ch01.straight_line.language_primitives;

public class CompoundStm extends Stm {
    public Stm stm1, stm2;

    public CompoundStm(Stm stm1, Stm stm2) {
        this.stm2 = stm2;
        this.stm1 = stm1;
    }

    public String toString() {
        return stm1.toString() + "; " + stm2.toString();
    }

    public Stm getStm1() {
        return stm1;
    }

    public Stm getStm2() {
        return stm2;
    }
}

