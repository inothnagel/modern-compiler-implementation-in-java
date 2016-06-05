package com.inothnagel.modern_compiler_java.ch01.straight_line;

/**
 * Created by inothnagel on 2016/06/05.
 */
public class PrintStm extends Stm {
    public ExpList exps;

    public PrintStm(ExpList exps) {
        this.exps = exps;
    }
}
