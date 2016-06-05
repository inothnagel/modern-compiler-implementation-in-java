package com.inothnagel.modern_compiler_java.ch01.straight_line.language_primitives;

public class OpExp extends Exp {
    public Exp left, right;
    public int oper;
    final public static int Plus=1, Minus=2, Times=3, Div=4;

    public OpExp(Exp left, int oper, Exp right) {
        this.left = left;
        this.right = right;
        this.oper = oper;
    }

    public int getOper(){
        return oper;
    }

    public Exp getLeft() {
        return left;
    }

    public Exp getRight() {
        return right;
    }
}
