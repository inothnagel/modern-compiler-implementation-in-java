package com.inothnagel.modern_compiler_java.ch01.straight_line;

import com.inothnagel.modern_compiler_java.ch01.straight_line.interpreter.Environment;
import com.inothnagel.modern_compiler_java.ch01.straight_line.interpreter.StmInterpreter;
import com.inothnagel.modern_compiler_java.ch01.straight_line.language_primitives.*;

/**
 * Created by inothnagel on 2016/06/05.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Interpreter.");

        Stm prog = new CompoundStm(
                new AssignStm("a", new NumExp(5)),
                new PrintStm(
                        new LastExpList(
                                new OpExp(
                                    new IdExp("a"), OpExp.Plus, new OpExp(
                                        new IdExp("a"), OpExp.Plus, new NumExp(7)
                                    )
                                )
                        )
                )
        );

        System.out.println(prog);

        Environment env = new Environment();
        new StmInterpreter(env, prog).interpret();
    }
}
