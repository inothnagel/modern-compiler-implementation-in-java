package com.inothnagel.modern_compiler_java.ch01.straight_line;

/**
 * Created by inothnagel on 2016/06/05.
 */
public class CompoundStm extends Stm {
    public Stm stm1, stm2;

    public CompoundStm(Stm stm2, Stm stm1) {
        this.stm2 = stm2;
        this.stm1 = stm1;
    }
}

