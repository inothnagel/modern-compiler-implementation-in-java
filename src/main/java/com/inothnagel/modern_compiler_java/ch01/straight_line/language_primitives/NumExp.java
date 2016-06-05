package com.inothnagel.modern_compiler_java.ch01.straight_line.language_primitives;

public class NumExp extends Exp {
    public int num;

    public NumExp(int num) {
        this.num = num;
    }

    public String toString() {
        return Integer.toString(num);
    }

    public int getNum() {
        return num;
    }
}
