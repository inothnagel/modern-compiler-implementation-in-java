package com.inothnagel.modern_compiler_java.ch01.straight_line;

/**
 * Created by inothnagel on 2016/06/05.
 */
public class NumExp extends Exp {
    public int num;

    public NumExp(int num) {
        this.num = num;
    }

    public String toString() {
        return Integer.toString(num);
    }
}
