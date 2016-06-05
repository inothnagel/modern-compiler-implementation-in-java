package com.inothnagel.modern_compiler_java.ch01.straight_line;

/**
 * Created by inothnagel on 2016/06/05.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Interpreter.");

        // a := 5
        // print a

        Stm prog = new CompoundStm(
                new AssignStm("a", new NumExp(5)),
                new PrintStm(new LastExpList(new IdExp("a")))
        );

        new Interpreter().interpret(prog);
    }
}
