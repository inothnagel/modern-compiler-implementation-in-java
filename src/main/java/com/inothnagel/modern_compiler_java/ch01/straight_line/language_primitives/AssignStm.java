package com.inothnagel.modern_compiler_java.ch01.straight_line.language_primitives;

public class AssignStm extends Stm {
    public String id;
    public Exp exp;

    public AssignStm(String id, Exp exp) {
        this.id = id;
        this.exp = exp;
    }

    public String toString() {
        return id + " := " + exp.toString();
    }

    public String getId() {
        return id;
    }

    public Exp getExp() {
        return exp;
    }
}
